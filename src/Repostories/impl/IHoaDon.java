/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.HoaDon;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IHoaDon {
    List<HoaDon> getAll();

    void add(HoaDon hd);

    void update(HoaDon hd, String id);

    void delete(String id);
}
