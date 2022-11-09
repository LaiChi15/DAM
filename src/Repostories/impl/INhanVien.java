/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.NhanVien;
import java.util.List;

/**
 *
 * @author pc
 */
public interface INhanVien {
    List<NhanVien> getAll();

    void add(NhanVien nv);

    void update(NhanVien nv, String id);

    void delete(String id);
}
