/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repostories.impl;

import DomainModels.Khach;
import java.util.List;

/**
 *
 * @author pc
 */
public interface IKhach {
    List<Khach> getAll();

    void add(Khach kh);

    void update(Khach kh, String id);

    void delete(String id);
}
