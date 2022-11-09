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
public class HoaDonViewModel {
    private String id;
    private String idKH;
    private String idNV;
    private String ma;
    private String Ten;
    private String ngaytao;
    private String Ngaythanhtoan;
    private String Ngayship;
    private String ngaynhan;
    private int tinhtrang;
    private String tennguoinhan;
    private String diachi;
    private int sdt;
    private int soluong;
    private BigDecimal dongia;

    public HoaDonViewModel() {
    }

    public HoaDonViewModel(String id, String idKH, String idNV, String ma, String Ten, String ngaytao, String Ngaythanhtoan, String Ngayship, String ngaynhan, int tinhtrang, String tennguoinhan, String diachi, int sdt, int soluong, BigDecimal dongia) {
        this.id = id;
        this.idKH = idKH;
        this.idNV = idNV;
        this.ma = ma;
        this.Ten = Ten;
        this.ngaytao = ngaytao;
        this.Ngaythanhtoan = Ngaythanhtoan;
        this.Ngayship = Ngayship;
        this.ngaynhan = ngaynhan;
        this.tinhtrang = tinhtrang;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sdt = sdt;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getNgaythanhtoan() {
        return Ngaythanhtoan;
    }

    public void setNgaythanhtoan(String Ngaythanhtoan) {
        this.Ngaythanhtoan = Ngaythanhtoan;
    }

    public String getNgayship() {
        return Ngayship;
    }

    public void setNgayship(String Ngayship) {
        this.Ngayship = Ngayship;
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
        return "HoaDonViewModel{" + "id=" + id + ", idKH=" + idKH + ", idNV=" + idNV + ", ma=" + ma + ", Ten=" + Ten + ", ngaytao=" + ngaytao + ", Ngaythanhtoan=" + Ngaythanhtoan + ", Ngayship=" + Ngayship + ", ngaynhan=" + ngaynhan + ", tinhtrang=" + tinhtrang + ", tennguoinhan=" + tennguoinhan + ", diachi=" + diachi + ", sdt=" + sdt + ", soluong=" + soluong + ", dongia=" + dongia + '}';
    }

    

    
    
}
