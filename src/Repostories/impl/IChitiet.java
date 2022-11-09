
package Repostories.impl;

import DomainModels.ChiTietSP;
import java.util.List;


public interface IChitiet {
     List<ChiTietSP> getAll();

    void add(ChiTietSP ctsp);

    void update(ChiTietSP ctsp, String id);

    void delete(String id);
}
