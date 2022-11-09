/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author pc
 */
public class NhanVienViewModel {
    private String id;
    private String Ma;
    private String ten;
    private String tendem;
    private String ho;
    private int sdt;
    private String matkhau;
    private String cuahang;
    private String diachi;
    private String macv;
    private String tencv;
    private String chucvu;
    private int trangthai;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String id, String Ma, String ten, String tendem, String ho, int sdt, String matkhau, String cuahang, String diachi, String macv, String tencv, String chucvu, int trangthai) {
        this.id = id;
        this.Ma = Ma;
        this.ten = ten;
        this.tendem = tendem;
        this.ho = ho;
        this.sdt = sdt;
        this.matkhau = matkhau;
        this.cuahang = cuahang;
        this.diachi = diachi;
        this.macv = macv;
        this.tencv = tencv;
        this.chucvu = chucvu;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getCuahang() {
        return cuahang;
    }

    public void setCuahang(String cuahang) {
        this.cuahang = cuahang;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getTencv() {
        return tencv;
    }

    public void setTencv(String tencv) {
        this.tencv = tencv;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "NhanVienViewModel{" + "id=" + id + ", Ma=" + Ma + ", ten=" + ten + ", tendem=" + tendem + ", ho=" + ho + ", sdt=" + sdt + ", matkhau=" + matkhau + ", cuahang=" + cuahang + ", diachi=" + diachi + ", macv=" + macv + ", tencv=" + tencv + ", chucvu=" + chucvu + ", trangthai=" + trangthai + '}';
    }

    
}
