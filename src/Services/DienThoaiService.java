
package Services;

import DomainModels.ChiTietSP;
import DomainModels.DongSP;
import DomainModels.MSX;
import DomainModels.MauSac;
import Repositories.ChitietSPrepo;
import Repositories.DongSPrepo;
import Repositories.MauSacrepo;
import Repositories.NSXrepo;
import Repositories.SanPham;
import Repostories.impl.IChitiet;
import Repostories.impl.IDongSP;
import Repostories.impl.IMauSac;
import Repostories.impl.INSX;
import Repostories.impl.ISanPham;
import Untilties.DBConnection;
import ViewModels.DienThoai;
import ViewModels.SanPhamViewModel;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class DienThoaiService implements IDienThoai{
    private IChitiet chiTietRepo;
    private ISanPham sanPhamRepository;
    private INSX nsxrepo;
    private IMauSac mausacrepo;
    private IDongSP dongsprepo;
    
    public DienThoaiService(){
        chiTietRepo = new ChitietSPrepo();
        sanPhamRepository = new SanPham();
        nsxrepo = new NSXrepo();
        mausacrepo = new MauSacrepo();
        dongsprepo = new DongSPrepo();
    }
    @Override
    public ArrayList<DienThoai> getAll() {
        ArrayList<DienThoai> listSP = new ArrayList<>();

        try {
            Connection cn = DBConnection.getConnection();

            String sql = "SELECT SanPham.Id ,SanPham.Ma,SanPham.Ten,NSX.Id,NSX.Ma,NSX.Ten,MauSac.Id,MauSac.Ma,MauSac.Ten,DongSP.Id,DongSP.Ma,DongSP.Ten,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan"
                    + "		FROM ChiTietSP join SanPham ON ChiTietSP.IdSP = SanPham.Id\n"
                    + "						join NSX ON ChiTietSP.IdNsx = NSX.Id\n"
                    + "						join MauSac ON ChiTietSP.IdMauSac = MauSac.Id\n"
                    + "						join DongSP ON ChiTietSP.IdDongSP = DongSP.Id";

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                listSP.add(new DienThoai(rs.getString("IdSP"),rs.getString("IdNsx"),rs.getString("IdMauSac"),rs.getString("IdDongSP"),rs.getString("Ma"),
                        rs.getString("Ma"),rs.getString("Ma"),rs.getString("Ma"),
                        rs.getString("Ten"),rs.getString("Ten"),rs.getString("Ten"),rs.getString("Ten"), rs.getInt("NamBH"), rs.getInt("SoLuongTon"),
                        BigDecimal.valueOf(rs.getDouble("GiaNhap")), BigDecimal.valueOf(rs.getDouble("GiaBan"))));
            }
           

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listSP;
    }

    @Override
    public void add(DienThoai spvm) {
        DomainModels.SanPham sp = new DomainModels.SanPham();
        sanPhamRepository.add(new DomainModels.SanPham(null, spvm.getMaSP(), spvm.getTenSP()));
        MSX nsx = new MSX();
        nsxrepo.add(new MSX(null, spvm.getMaNsx(), spvm.getTenNsx()));
        MauSac ms = new MauSac();
        mausacrepo.add(new MauSac( null,spvm.getMaMau(), spvm.getTenMauSac()));
        DongSP dg = new DongSP();
        dongsprepo.add(new DongSP(null, spvm.getMadongSP(), spvm.getTenDongsp()));
        
        chiTietRepo.add(new ChiTietSP(null,sanPhamRepository.getIdByMa(spvm.getIdSP()),spvm.getIdNSX(), spvm.getIdMauSac(), spvm.getIdDongSP(),spvm.getNamBH(), null, spvm.getSoLuongTon(),spvm.getGiaNhap(),spvm.getGiaBan()));
        
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
