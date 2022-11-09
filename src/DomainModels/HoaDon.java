/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author pc
 */
public class HoaDon {
    private String idHD;
    private String ma;
    private String ngaytao;
    private String ngaythanhtoan;
    private String ngayship ;
    private String ngaynhan;
    private int tinhtrang;
    private String tennguoinhan;
    private String diachi;
    private int sdt;
    private String idKH;
    private String idNV;

    public HoaDon() {
    }

    public HoaDon(String idHD, String ma, String ngaytao, String ngaythanhtoan, String ngayship, String ngaynhan, int tinhtrang, String tennguoinhan, String diachi, int sdt, String idKH, String idNV) {
        this.idHD = idHD;
        this.ma = ma;
        this.ngaytao = ngaytao;
        this.ngaythanhtoan = ngaythanhtoan;
        this.ngayship = ngayship;
        this.ngaynhan = ngaynhan;
        this.tinhtrang = tinhtrang;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sdt = sdt;
        this.idKH = idKH;
        this.idNV = idNV;
    }

    public HoaDon(String string, String string0, String string1, String string2, String string3, String string4, int aInt, String string5, String string6, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getNgaythanhtoan() {
        return ngaythanhtoan;
    }

    public void setNgaythanhtoan(String ngaythanhtoan) {
        this.ngaythanhtoan = ngaythanhtoan;
    }

    public String getNgayship() {
        return ngayship;
    }

    public void setNgayship(String ngayship) {
        this.ngayship = ngayship;
    }

    public String getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(String ngaynhan) {
        this.ngaynhan = ngaynhan;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getTennguoinhan() {
        return tennguoinhan;
    }

    public void setTennguoinhan(String tennguoinhan) {
        this.tennguoinhan = tennguoinhan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "idHD=" + idHD + ", ma=" + ma + ", ngaytao=" + ngaytao + ", ngaythanhtoan=" + ngaythanhtoan + ", ngayship=" + ngayship + ", ngaynhan=" + ngaynhan + ", tinhtrang=" + tinhtrang + ", tennguoinhan=" + tennguoinhan + ", diachi=" + diachi + ", sdt=" + sdt + ", idKH=" + idKH + ", idNV=" + idNV + '}';
    }

    
    
}
