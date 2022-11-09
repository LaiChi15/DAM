/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import Repostories.impl.INhanVien;
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
public class NhanVienrepo implements INhanVien{

    @Override
    public List<NhanVien> getAll() {
          List<NhanVien> listNV = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma , Ho+' '+TenDem+' '+Ten as HoVaTen, GioiTinh, NgaySinh, DiaChi,Sdt,TrangThai FROM NhanVien";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                listNV.add(new NhanVien(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("HoVaTen"),
                        rs.getString("GioiTinh"),
                        rs.getString("NgaySinh"),
                        rs.getString("DiaChi"),
                        rs.getInt("Sdt"),
                        rs.getInt("TrangThai")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listNV;
    }

    @Override
    public void add(NhanVien nv) {
         try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO NhanVien(Ma,Ten,GioiTinh, NgaySinh,DiaChi,Sdt, TrangThai) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHoTenNV());
            ps.setString(3, nv.getGioiTinhNV());
            ps.setString(4, nv.getNgaySinhNV());
            ps.setString(5, nv.getDiaChiNV());
            ps.setInt(6, nv.getSdtNV());
            ps.setInt(7, nv.getTrangThaiNV());
            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(NhanVien nv, String id) {
       try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE CuaHang SET Ma = ?,Ten = ?, GioiTinh = ?, NgaySinh = ?,DiaChi = ?,Sdt = ?, TrangThai = ? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nv.getMaNV());
            ps.setString(2, nv.getHoTenNV());
            ps.setString(3, nv.getGioiTinhNV());
            ps.setString(4, nv.getNgaySinhNV());
            ps.setString(5, nv.getDiaChiNV());
            ps.setInt(6, nv.getSdtNV());
            ps.setInt(7, nv.getTrangThaiNV());
            ps.setString(8, id);
            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "DELETE FROM NhanVien WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
