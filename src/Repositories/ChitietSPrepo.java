/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import Repostories.impl.IChitiet;
import Untilties.DBConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class ChitietSPrepo implements IChitiet{

    @Override
    public List<ChiTietSP> getAll() {
        List<ChiTietSP> listCT = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id , IdSP, IdNsx,IdMauSac,IdDongSP,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan FROM ChiTietSP"  ;
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                listCT.add(new ChiTietSP(rs.getString("Id"),
                        rs.getString("IdSP"),
                        rs.getString("IdNsx"),
                        rs.getString("IdMauSac"),
                        rs.getString("IdDongSP"),
                        rs.getInt("NamBH"),
                        rs.getString("MoTa"),
                        rs.getInt("SoLuongTon"),
                        BigDecimal.valueOf(rs.getDouble("GiaNhap")),
                        BigDecimal.valueOf(rs.getDouble("GiaBan"))
                ));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listCT;
    }

    @Override
    public void add(ChiTietSP ctsp) {
         try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO ChiTietSP( IdSP, IdNsx,IdMauSac,IdDongSP,NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ctsp.getIdSP());
            ps.setString(2, ctsp.getIdNSX());
            ps.setString(3, ctsp.getIdMauSac());
            ps.setString(4, ctsp.getIdDongSP());
            ps.setInt(5, ctsp.getNamBH());
            ps.setString(6, ctsp.getMoTa());
            ps.setInt(7, ctsp.getSoLuongTon());
            ps.setBigDecimal(8, ctsp.getGiaNhap());
            ps.setBigDecimal(9, ctsp.getGiaBan());

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(ChiTietSP ctsp, String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE ChiTietSP SET IdSP = ?, IdNsx = ? , IdMauSac = ? , IdDongSP = ?, NamBH = ?, MoTa = ?,SoLuongTon= ?,GiaNhap = ?,GiaBan =?  WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ctsp.getIdSP());
            ps.setString(2, ctsp.getIdNSX());
            ps.setString(3, ctsp.getIdMauSac());
            ps.setString(4, ctsp.getIdDongSP());
            ps.setInt(5, ctsp.getNamBH());
            ps.setString(6, ctsp.getMoTa());
            ps.setInt(7, ctsp.getSoLuongTon());
            ps.setBigDecimal(8, ctsp.getGiaNhap());
            ps.setBigDecimal(9, ctsp.getGiaBan());
            ps.setString(10, id);
            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "DELETE FROM ChiTietSP WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
}
