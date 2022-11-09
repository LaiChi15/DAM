/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.DongSP;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IDongSP {
    List<DongSP> getAll();

    void add(DongSP dg);

    void update(DongSP dg, String id);

    void delete(String id);
}
