/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.GioHangViewModel;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface iGioHangSer {
    ArrayList<GioHangViewModel> getAll();
    
    void add(GioHangViewModel ghvm);
    
    void update();
    
    void delete();
}
