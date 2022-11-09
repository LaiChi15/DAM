/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.math.BigDecimal;

/**
 *
 * @author pc
 */
public class SanPhamViewModel {
    
    private String IdSP;
    private String maSP;
    private String tenSP;
    private int namBH;
    private String moTa;
    private int soLuongSP;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String IdSP, String maSP, String tenSP, int namBH, String moTa, int soLuongSP, BigDecimal giaNhap, BigDecimal giaBan) {
        this.IdSP = IdSP;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuongSP = soLuongSP;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getIdSP() {
        return IdSP;
    }

    public void setIdSP(String IdSP) {
        this.IdSP = IdSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "SanPhamViewModel{" + "IdSP=" + IdSP + ", maSP=" + maSP + ", tenSP=" + tenSP + ", namBH=" + namBH + ", moTa=" + moTa + ", soLuongSP=" + soLuongSP + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }

   
}
