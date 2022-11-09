/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import Repostories.impl.IHoaDon;
import Untilties.DBConnection;
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
public class HoaDonrepo implements IHoaDon{


    @Override
    public List<HoaDon> getAll() {
        List<HoaDon> listHD = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma,NgayTao , NgayThanhToan,NgayShip, NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,Sdt  FROM HoaDon";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                listHD.add(new HoaDon(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("NgayTao"),
                        rs.getString("NgayThanhToan"),
                        rs.getString("NgayShip"),
                        rs.getString("NgayNhan"),
                        rs.getInt("TinhTrang"),
                        rs.getString("TenNguoiNhan"),
                        rs.getString("DiaChi"),
                        rs.getInt("Sdt")
                ));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listHD;
    }

    @Override
    public void add(HoaDon hd) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO HoaDon( Ma , NgayTao , NgayThanhToan , NgayShip, NgayNhan , TinhTrang , TenNguoiNhan , DiaChi , Sdt ) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, hd.getMa());
            ps.setString(2, hd.getNgaytao());
            ps.setString(3, hd.getNgaythanhtoan());
            ps.setString(4, hd.getNgayship());
            ps.setString(5, hd.getNgaynhan());
            ps.setInt(6, hd.getTinhtrang());
            ps.setString(7, hd.getTennguoinhan());
            ps.setString(8, hd.getDiachi());
            ps.setInt(9, hd.getSdt());

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(HoaDon hd, String id) {
         try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE HoaDon SET Ma = ?,NgayTao = ? , NgayThanhToan = ? , NgayShip = ?, NgayNhan = ? , TinhTrang = ?, TenNguoiNhan = ?, DiaChi = ?, Sdt = ? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, hd.getMa());
            ps.setString(2, hd.getNgaytao());
            ps.setString(3, hd.getNgaythanhtoan());
            ps.setString(4, hd.getNgayship());
            ps.setString(5, hd.getNgaynhan());
            ps.setInt(6, hd.getTinhtrang());
            ps.setString(7, hd.getTennguoinhan());
            ps.setString(8, hd.getDiachi());
            ps.setInt(9, hd.getSdt());
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
            String sql = "DELETE FROM HoaDon WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
