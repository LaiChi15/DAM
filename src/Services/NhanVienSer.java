/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChucVu;
import DomainModels.CuaHang;
import DomainModels.NhanVien;
import Repositories.ChucVurepo;
import Repositories.CuaHangrepo;
import Repositories.NhanVienrepo;
import Repostories.impl.IChucVu;
import Repostories.impl.ICuaHang;
import Repostories.impl.INhanVien;
import Untilties.DBConnection;
import ViewModels.HoaDonViewModel;
import ViewModels.NhanVienViewModel;
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
public class NhanVienSer implements INhanVienSer{
    private INhanVien nhanvienrepo;
    private ICuaHang cuahangrepo;
    private IChucVu chucvurepo;
    
    public NhanVienSer(){
        nhanvienrepo = new NhanVienrepo();
        cuahangrepo = new CuaHangrepo();
        chucvurepo = new ChucVurepo();
    }
    
    @Override
    public ArrayList<NhanVienViewModel> getAll() {
       ArrayList<NhanVienViewModel> listNV = new ArrayList<>();

        try {
            Connection cn = DBConnection.getConnection();

            String sql = "SELECT NhanVien.Id,NhanVien.Ma,NhanVien.Ten,TenDem,Ho,Sdt,MatKhau,CuaHang.Ten as 'CuaHang',CuaHang.DiaChi,ChucVu.Ma,ChucVu.Ten as'ChucVu',TrangThai\n"
                    + "		From NhanVien join CuaHang ON NhanVien.IdCH =CuaHang.Id\n"
                    + "					  join ChucVu ON NhanVien.IdCV = ChucVu.Id";

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                listNV.add(new NhanVienViewModel(rs.getString("Id"), rs.getString("Ma"),
                        rs.getString("Ten"), rs.getString("TenDem"), rs.getString("Ho"), 
                        rs.getInt("Sdt"),rs.getString("MatKhau"), rs.getString("CuaHang"),
                        rs.getString("DiaChi"), rs.getString("Ma"),rs.getString("ChucVu") ,rs.getString("ChucVu"),
                        rs.getInt("TrangThai")));
            }
           

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listNV;
    }

    @Override
    public void add(NhanVienViewModel hdvm) {
        nhanvienrepo.add(new NhanVien(null, hdvm.getMacv(), hdvm.getTencv(), null, null, null, hdvm.getSdt(), hdvm.getTrangthai()));
        chucvurepo.add(new ChucVu(null, hdvm.getMacv(), hdvm.getTencv()));
        cuahangrepo.add(new CuaHang(null, hdvm.getMa(), hdvm.getCuahang(), hdvm.getDiachi(), null, null));
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
