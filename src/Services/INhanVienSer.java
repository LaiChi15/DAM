/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.NhanVienViewModel;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface INhanVienSer {
     ArrayList<NhanVienViewModel> getAll();
    
    void add(NhanVienViewModel hdvm);
    
    void update();
    
    void delete();
}
