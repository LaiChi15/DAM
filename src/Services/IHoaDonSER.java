/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.HoaDonViewModel;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface IHoaDonSER {
    ArrayList<HoaDonViewModel> getAll();
    
    void add(HoaDonViewModel hdvm);
    
    void update();
    
    void delete();
}
