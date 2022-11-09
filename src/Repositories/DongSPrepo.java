/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.DongSP;
import Repostories.impl.IDongSP;
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
public class DongSPrepo implements IDongSP{

    @Override
    public List<DongSP> getAll() {
        List<DongSP> listDongSP = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma, Ten FROM DongSP";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();

            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                listDongSP.add(new DongSP(
                        rs.getString("Id"),
                        rs.getString("Ma"),
                        rs.getString("Ten")
                ));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listDongSP;
    }

    @Override
    public void add(DongSP dg) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "INSERT INTO DongSP(Ma,Ten ) VALUES(?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, dg.getMa());
            ps.setString(2, dg.getTen());

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(DongSP dg, String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "UPDATE DongSP SET Ma = ? , Ten = ? WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, dg.getMa());
            ps.setString(2, dg.getTen());
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
            String sql = "DELETE FROM DongSP WHERE Id = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);

            ps.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
