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
public class DienThoai {
    private String idNSX;
    private String idMauSac;
    private String idDongSP;
    private String IdSP;
    private String maSP;
    private String maNsx;
    private String maMau;
    private String madongSP;
    private String tenSP;
    private String tenNsx;
    private String tenMauSac;
    private String tenDongsp;
    private int namBH;
    private int SoLuongTon;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;

    public DienThoai() {
    }

    public DienThoai(String idNSX, String idMauSac, String idDongSP, String IdSP, String maSP, String maNsx, String maMau, String madongSP, String tenSP, String tenNsx, String tenMauSac, String tenDongsp, int namBH, int SoLuongTon, BigDecimal giaNhap, BigDecimal giaBan) {
        this.idNSX = idNSX;
        this.idMauSac = idMauSac;
        this.idDongSP = idDongSP;
        this.IdSP = IdSP;
        this.maSP = maSP;
        this.maNsx = maNsx;
        this.maMau = maMau;
        this.madongSP = madongSP;
        this.tenSP = tenSP;
        this.tenNsx = tenNsx;
        this.tenMauSac = tenMauSac;
        this.tenDongsp = tenDongsp;
        this.namBH = namBH;
        this.SoLuongTon = SoLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getIdDongSP() {
        return idDongSP;
    }

    public void setIdDongSP(String idDongSP) {
        this.idDongSP = idDongSP;
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

    public String getMaNsx() {
        return maNsx;
    }

    public void setMaNsx(String maNsx) {
        this.maNsx = maNsx;
    }

    public String getMaMau() {
        return maMau;
    }

    public void setMaMau(String maMau) {
        this.maMau = maMau;
    }

    public String getMadongSP() {
        return madongSP;
    }

    public void setMadongSP(String madongSP) {
        this.madongSP = madongSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenNsx() {
        return tenNsx;
    }

    public void setTenNsx(String tenNsx) {
        this.tenNsx = tenNsx;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public String getTenDongsp() {
        return tenDongsp;
    }

    public void setTenDongsp(String tenDongsp) {
        this.tenDongsp = tenDongsp;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public int getSoLuongTon() {
        return SoLuongTon;
    }

    public void setSoLuongTon(int SoLuongTon) {
        this.SoLuongTon = SoLuongTon;
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
        return "DienThoai{" + "idNSX=" + idNSX + ", idMauSac=" + idMauSac + ", idDongSP=" + idDongSP + ", IdSP=" + IdSP + ", maSP=" + maSP + ", maNsx=" + maNsx + ", maMau=" + maMau + ", madongSP=" + madongSP + ", tenSP=" + tenSP + ", tenNsx=" + tenNsx + ", tenMauSac=" + tenMauSac + ", tenDongsp=" + tenDongsp + ", namBH=" + namBH + ", SoLuongTon=" + SoLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }


    
}
