/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.ChucVu;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IChucVu {
    List<ChucVu> getAll();

    void add(ChucVu cv);

    void update(ChucVu cv, String id);

    void delete(String id);
}
