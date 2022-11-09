
package Services;

import DomainModels.ChiTietSP;
import Repositories.ChitietSPrepo;
import Repositories.SanPham;
import Repostories.impl.IChitiet;
import Repostories.impl.ISanPham;
import Untilties.DBConnection;
import ViewModels.SanPhamViewModel;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SanPhamService implements ISanPhamServi{
    private IChitiet chiTietRepo;

    private ISanPham sanPhamRepository;

    public SanPhamService() {
        chiTietRepo = new ChitietSPrepo();

        sanPhamRepository = new SanPham();

    }
    @Override
    public ArrayList<SanPhamViewModel> getAll() {
         ArrayList<SanPhamViewModel> listSP = new ArrayList<>();

        try {
            Connection cn = DBConnection.getConnection();

            String sql = "select SanPham.Id , SanPham.Ma , SanPham.Ten, NamBH,MoTa ,SoLuongTon,GiaNhap,GiaBan \n"
                    + "		from ChiTietSP join SanPham on ChiTietSP.IdSP = SanPham.Id";

            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                listSP.add(new SanPhamViewModel(rs.getString("Id"), rs.getString("Ma"),
                        rs.getString("Ten"), rs.getInt("NamBH"), rs.getString("MoTa"), rs.getInt("SoLuongTon"),
                        BigDecimal.valueOf(rs.getDouble("GiaNhap")), BigDecimal.valueOf(rs.getDouble("GiaBan"))));
            }

           

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listSP;
    }

    @Override
    public void add(SanPhamViewModel spvm) {
       DomainModels.SanPham sp = new DomainModels.SanPham();
        sanPhamRepository.add(new DomainModels.SanPham(null, spvm.getMaSP(), spvm.getTenSP()));
        String idSP = sanPhamRepository.getIdByMa(spvm.getMaSP());
        chiTietRepo.add(new ChiTietSP(null, idSP, null, null, null, spvm.getNamBH(), spvm.getMoTa(), spvm.getSoLuongSP(),spvm.getGiaNhap(),spvm.getGiaBan() ));
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
