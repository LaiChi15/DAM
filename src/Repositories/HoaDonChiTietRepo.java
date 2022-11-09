/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDonChiTiet;
import Repostories.impl.IHoaDonChiTiet;
import Untilties.DBConnection;
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
public class HoaDonChiTietRepo implements IHoaDonChiTiet{

    @Override
    public List<HoaDonChiTiet> getAll() {
        List<HoaDonChiTiet> listHoaDonChiTiet = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT IdHoaDon, IdChiTietSP,SoLuong,DonGia FROM HoaDonChiTiet";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                listHoaDonChiTiet.add(new HoaDonChiTiet(
                        rs.getString("IdHoaDon"),
                        rs.getString("IdChiTietSP"),
                        rs.getInt("SoLuong"),
                        BigDecimal.valueOf(rs.getDouble("DonGia"))));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listHoaDonChiTiet;
    }

    @Override
    public void add(HoaDonChiTiet ct) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO HoaDonChiTiet( IdHoaDon, IdChiTietSP,SoLuong,DonGia) VALUES(?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ct.getIdHoaDon());
            ps.setString(2, ct.getIdChiTietSP());
            ps.setInt(3, ct.getSoluong());
            ps.setBigDecimal(4, ct.getDongia());
            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(HoaDonChiTiet ct, String id) {
          try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE HoaDonChiTiet SET IdHoaDon = ?, IdChiTietSP = ?,SoLuong = ?,DonGia =? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "DELETE FROM HoaDonChiTiet WHERE Id = ?"; 
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
