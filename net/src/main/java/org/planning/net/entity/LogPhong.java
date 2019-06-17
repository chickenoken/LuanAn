package org.planning.net.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class LogPhong {

    @Column(name = "MA_KHACH_HANG")
    private String maKhachHang;

    @Column(name = "MA_PHONG")
    private String maPhong;

    @Column(name = "TINH_TRANG")
    private String tinhTrang;

    @Column(name = "NGAY_THUE")
    private String ngaythue;

    @Column(name = "NGAY_TRA")
    private String ngayTra;

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getNgaythue() {
        return ngaythue;
    }

    public void setNgaythue(String ngaythue) {
        this.ngaythue = ngaythue;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }
}
