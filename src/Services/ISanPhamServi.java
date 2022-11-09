/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.SanPhamViewModel;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface ISanPhamServi {
    ArrayList<SanPhamViewModel> getAll();
    
    void add(SanPhamViewModel spvm);
    
    void update();
    
    void delete();
}
