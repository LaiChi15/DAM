/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.Khach;
import Repostories.impl.IKhach;
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
public class Khachrepo implements IKhach{

    @Override
    public List<Khach> getAll() {
        List<Khach> listKH = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma , Ho+' '+TenDem+' '+Ten as HoVaTen , NgaySinh,Sdt, DiaChi,ThanhPho,QuocGia,MatKhau FROM KhachHang";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                listKH.add(new Khach(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("HoVaTen"),
                        rs.getString("NgaySinh"),
                        rs.getString("Sdt"),
                        rs.getString("DiaChi"),
                        rs.getString("ThanhPho"),
                        rs.getString("QuocGia"),
                        rs.getString("MatKhau")
                ));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listKH;
    }

    @Override
    public void add(Khach kh) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO KhachHang(Ma,Ten,NgaySinh,Sdt, DiaChi,ThanhPho,QuocGia,MatKhau) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getHoTenKH());
            ps.setString(3, kh.getNgaySinh());
            ps.setString(4, kh.getSdt());
            ps.setString(5, kh.getDiaChi());
            ps.setString(6, kh.getThanhPho());
            ps.setString(7, kh.getQuocGia());
            ps.setString(8, kh.getMatkhau());

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(Khach kh, String id) {
         try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE CuaHang SET Ma = ?,Ten = ?,NgaySinh = ? ,Sdt = ?, DiaChi = ?, ThanhPho = ?, QuocGia = ?,MatKhau = ? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql); 
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getHoTenKH());
            ps.setString(3, kh.getNgaySinh());
            ps.setString(4, kh.getSdt());
            ps.setString(5, kh.getDiaChi());
            ps.setString(6, kh.getThanhPho());
            ps.setString(7, kh.getQuocGia());
            ps.setString(8, kh.getMatkhau());
            
            ps.setString(9, id);
            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
       try {
            Connection cn = DBConnection.getConnection();
            String sql = "DELETE FROM KhachHang WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
