/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import Repostories.impl.IChucVu;
import Untilties.DBConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author pc
 */
public class ChucVurepo implements IChucVu{

    @Override
    public List<ChucVu> getAll() {
        List<ChucVu> listcv = new ArrayList<>();
        try {
            Connection cn = DBConnection.getConnection();
            String sql = "SELECT Id, Ma , Ten FROM ChucVu";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                listcv.add(new ChucVu(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listcv;
    }

    @Override
    public void add(ChucVu cv) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql ="INSERT INTO ChucVu(Ma,Ten) VALUES (?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, cv.getMa());
            ps.setString(2, cv.getTen());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ChucVu cv, String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql ="UPDATE ChucVu SET Ma=? ,Ten=? WHERE Id=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, cv.getMa());
            ps.setString(2, cv.getTen());
            ps.setString(3, id);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            Connection cn = DBConnection.getConnection();
            String sql ="DELETE FROM ChucVu Where Id=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
