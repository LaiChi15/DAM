/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import DomainModels.HoaDonChiTiet;
import DomainModels.Khach;
import Repositories.HoaDonChiTietRepo;
import Repositories.HoaDonrepo;
import Repositories.Khachrepo;
import Repositories.NhanVienrepo;
import Repostories.impl.IHoaDonChiTiet;
import Repostories.impl.IHoaDon;
import Repostories.impl.IKhach;
import Repostories.impl.INhanVien;
import Untilties.DBConnection;
import ViewModels.DienThoai;
import ViewModels.HoaDonViewModel;
import Views.NhanVien;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class HoaDonSer implements IHoaDonSER{
    private IHoaDon hoadonrepo;
    private IHoaDonChiTiet hoadonctrepo;
    private IKhach khachrepo;
    private INhanVien nhanvienrepo;
    
    public HoaDonSer(){
        hoadonctrepo = new HoaDonChiTietRepo();
        hoadonrepo = new HoaDonrepo();
        khachrepo = new Khachrepo();
        nhanvienrepo = new NhanVienrepo();
        
    }
    @Override
    public ArrayList<HoaDonViewModel> getAll() {
        ArrayList<HoaDonViewModel> listHD = new ArrayList<>();

        try {
            Connection cn = DBConnection.getConnection();

            String sql = "SELECT HoaDon.Id,KhachHang.Id,NhanVien.Id,HoaDon.Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,HoaDon.DiaChi,HoaDon.Sdt,HoaDonChiTiet.SoLuong,HoaDonChiTiet.DonGia\n"
                    + "		From HoaDon join HoaDonChiTiet ON HoaDon.Id =HoaDonChiTiet.IdHoaDon\n"
                    + "					join KhachHang ON HoaDon.IdKH = KhachHang.Id\n"
                    + "					join NhanVien ON HoaDon.IdNV = NhanVien.Id";

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                listHD.add(new HoaDonViewModel(rs.getString("Id"),rs.getString("Id"),rs.getString("Id"),rs.getString("Ma"),rs.getString("Ten"),rs.getString("NgayTao"),
                        rs.getString("NgayThanhToan"),rs.getString("NgayShip"),rs.getString("NgayNhan"),rs.getInt("TinhTrang"),rs.getString("TenNguoiNhan"),rs.getString("DiaChi"),rs.getInt("Sdt"),
                        rs.getInt("SoLuong") ,BigDecimal.valueOf(rs.getDouble("DonGia"))));
            }
           

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listHD;
    }

    @Override
    public void add(HoaDonViewModel hdvm) {
        khachrepo.add(new Khach(null, hdvm.getMa(), hdvm.getTennguoinhan(), null, null, null, null, null, null));
        hoadonctrepo.add(new HoaDonChiTiet(null, null, hdvm.getSoluong(), hdvm.getDongia()));
        nhanvienrepo.add(new DomainModels.NhanVien(null, null, hdvm.getTen(), null, null, null, 0, 0));
        HoaDon hd = new HoaDon();
        hoadonrepo.add(new HoaDon(null,hdvm.getMa(),hdvm.getNgaytao(), hdvm.getNgaythanhtoan(),null, null, hdvm.getTinhtrang(), null,null,hdvm.getSdt(),hdvm.getIdKH(),hdvm.getIdNV()));
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
