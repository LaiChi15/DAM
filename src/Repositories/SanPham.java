/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import Repostories.impl.ISanPham;
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
public class SanPham implements ISanPham{

    @Override
    public List<DomainModels.SanPham> getAll() {
          List<DomainModels.SanPham> listSP = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma, Ten FROM SanPham";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            
            while (rs.next()) {
                listSP.add(new DomainModels.SanPham(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return listSP;
    }

    @Override
    public void add(DomainModels.SanPham sp) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO SanPham(Ma,Ten ) VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, sp.getMa());
            ps.setString(2, sp.getTen());
            
            ps.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(DomainModels.SanPham sp, String id) {
       try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE SanPham SET Ma = ? , Ten = ? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, sp.getMa());
            ps.setString(2, sp.getTen());
            ps.setString(3, id);
            ps.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
          try {
            Connection cn = DBConnection.getConnection();
            String sql = "DELETE FROM SanPham WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            
            ps.execute();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String getIdByMa(String ma) {
         try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id FROM SanPham Where Ma = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            
            ps.setString(1, ma);
            ps.execute();
            
            ResultSet rs = ps.getResultSet();
            
            while (rs.next()) {
                String idSP = rs.getString("Id");
                return idSP;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
       
         return null;
    
    }
}
