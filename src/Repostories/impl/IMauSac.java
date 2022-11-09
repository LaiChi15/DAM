/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.MauSac;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IMauSac {
     List<MauSac> getAll();

    void add(MauSac ms);

    void update(MauSac ms, String id);

    void delete(String id);
}
