/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.CuaHang;
import java.util.List;

/**
 *
 * @author pc
 */
public interface ICuaHang {
    List<CuaHang> getAll();

    void add(CuaHang ch);

    void update(CuaHang ch, String id);

    void delete(String id);
}
