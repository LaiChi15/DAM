/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author pc
 */
public interface ISanPham {
    List<SanPham> getAll();

    void add(SanPham sp);

    void update(SanPham sp, String id);

    void delete(String id);

    String getIdByMa(String ma);
}
