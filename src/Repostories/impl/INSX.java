/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.MSX;
import java.util.List;

/**
 *
 * @author pc
 */
public interface INSX {
     List<MSX> getAll();

    void add(MSX sx);

    void update(MSX sx, String id);

    void delete(String id);
}
