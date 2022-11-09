/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.CuaHang;
import Repostories.impl.ICuaHang;
import Untilties.DBConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author pc
 */
public class CuaHangrepo implements ICuaHang{

    @Override
    public List<CuaHang> getAll() {
       List<CuaHang> listCh = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma , Ten, DiaChi, ThanhPho, QuocGia FROM CuaHang";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                listCh.add(new CuaHang(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"),
                        rs.getString("DiaChi"), rs.getString("ThanhPho"), rs.getString("QuocGia")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCh;
    }

    @Override
    public void add(CuaHang ch) {
           try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO CuaHang(Ma,Ten, DiaChi, ThanhPho, QuocGia) VALUES(?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ch.getMa());
            ps.setString(2, ch.getTen());
            ps.setString(3, ch.getDiachi());
            ps.setString(4, ch.getThanhpho());
            ps.setString(5, ch.getQuocgia());
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(CuaHang ch, String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE CuaHang SET Ma = ? , Ten = ? , DiaChi = ? , ThanhPho = ? , QuocGia = ? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ch.getMa());
            ps.setString(2, ch.getTen());
            ps.setString(3, ch.getDiachi());
            ps.setString(4, ch.getThanhpho());
           ps.setString(5, ch.getQuocgia());
            ps.setString(6, id);
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "DELETE FROM CuaHang WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
