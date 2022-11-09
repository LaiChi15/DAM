/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;

/**
 *
 * @author pc
 */
public class HoaDonChiTiet {
    private String IdHoaDon;
    private String IdChiTietSP;
    private int soluong;
    private BigDecimal dongia;

    public HoaDonChiTiet(String IdHoaDon, String IdChiTietSP, int soluong, BigDecimal dongia) {
        this.IdHoaDon = IdHoaDon;
        this.IdChiTietSP = IdChiTietSP;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public HoaDonChiTiet() {
    }

    public String getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(String IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public String getIdChiTietSP() {
        return IdChiTietSP;
    }

    public void setIdChiTietSP(String IdChiTietSP) {
        this.IdChiTietSP = IdChiTietSP;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public BigDecimal getDongia() {
        return dongia;
    }

    public void setDongia(BigDecimal dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "IdHoaDon=" + IdHoaDon + ", IdChiTietSP=" + IdChiTietSP + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }

    
    
}
