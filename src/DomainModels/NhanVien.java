/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author pc
 */
public class NhanVien {
   private String idNV;
    private String maNV;
    private String hoTenNV;
    private String gioiTinhNV;
    private String ngaySinhNV;
    private String diaChiNV;
    private int sdtNV;
    private int trangThaiNV;

    public NhanVien() {
    }

    public NhanVien(String idNV, String maNV, String hoTenNV, String gioiTinhNV, String ngaySinhNV, String diaChiNV, int sdtNV, int trangThaiNV) {
        this.idNV = idNV;
        this.maNV = maNV;
        this.hoTenNV = hoTenNV;
        this.gioiTinhNV = gioiTinhNV;
        this.ngaySinhNV = ngaySinhNV;
        this.diaChiNV = diaChiNV;
        this.sdtNV = sdtNV;
        this.trangThaiNV = trangThaiNV;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public String getGioiTinhNV() {
        return gioiTinhNV;
    }

    public void setGioiTinhNV(String gioiTinhNV) {
        this.gioiTinhNV = gioiTinhNV;
    }

    public String getNgaySinhNV() {
        return ngaySinhNV;
    }

    public void setNgaySinhNV(String ngaySinhNV) {
        this.ngaySinhNV = ngaySinhNV;
    }

    public String getDiaChiNV() {
        return diaChiNV;
    }

    public void setDiaChiNV(String diaChiNV) {
        this.diaChiNV = diaChiNV;
    }

    public int getSdtNV() {
        return sdtNV;
    }

    public void setSdtNV(int sdtNV) {
        this.sdtNV = sdtNV;
    }

    public int getTrangThaiNV() {
        return trangThaiNV;
    }

    public void setTrangThaiNV(int trangThaiNV) {
        this.trangThaiNV = trangThaiNV;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "idNV=" + idNV + ", maNV=" + maNV + ", hoTenNV=" + hoTenNV + ", gioiTinhNV=" + gioiTinhNV + ", ngaySinhNV=" + ngaySinhNV + ", diaChiNV=" + diaChiNV + ", sdtNV=" + sdtNV + ", trangThaiNV=" + trangThaiNV + '}';
    }

    
}
