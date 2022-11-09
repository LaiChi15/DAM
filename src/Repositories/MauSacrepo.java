/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import Repostories.impl.IMauSac;
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
public class MauSacrepo implements IMauSac{

    @Override
    public List<MauSac> getAll() {
       List<MauSac> listMauSac = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma, Ten FROM MauSac";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                listMauSac.add(new MauSac(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten")));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listMauSac;
    }

    @Override
    public void add(MauSac ms) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO MauSac(Ma,Ten ) VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ms.getMa());
            ps.setString(2, ms.getTen());

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(MauSac ms, String id) {
         try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE MauSac SET Ma = ? , Ten = ? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ms.getMa());
            ps.setString(2, ms.getTen());
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
            String sql = "DELETE FROM MauSac WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
