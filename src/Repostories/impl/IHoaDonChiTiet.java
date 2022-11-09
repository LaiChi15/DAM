/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IHoaDonChiTiet {
    List<HoaDonChiTiet> getAll();

    void add(HoaDonChiTiet ct);

    void update(HoaDonChiTiet ct, String id);

    void delete(String id);
}
