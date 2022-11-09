/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.DienThoai;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface IDienThoai {
    ArrayList<DienThoai> getAll();
    
    void add(DienThoai spvm);
    
    void update();
    
    void delete();
}
