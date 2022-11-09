/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MSX;
import Repostories.impl.INSX;
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
public class NSXrepo implements INSX{

    @Override
    public List<MSX> getAll() {
         List<MSX> listNSX = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma, Ten FROM NSX";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                listNSX.add(new MSX(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listNSX;
    }

    @Override
    public void add(MSX sx) {
         try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO NSX(Ma,Ten ) VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, sx.getMa());
            ps.setString(2, sx.getTen());

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(MSX sx, String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE NSX SET Ma = ? , Ten = ? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, sx.getMa());
            ps.setString(2, sx.getTen());
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
            String sql = "DELETE FROM NSX WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
