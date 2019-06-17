package org.planning.net.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class HoaDon {

    @Column(name = "MA_HOA_DON")
    private String maHoaDon;

    @Column(name = "MA_KHACH_HANG")
    private String maKhachHang;

    @Column(name = "MA_SAN_PHAM")
    private String maSanPham;

    @Column(name = "MA_NHAN_VIEN")
    private String maNhanVien;

    @Column(name ="SO_LUONG")
    private Integer soLuong;

    @Column(name ="THANH_TIEN")
    private Integer thanhTien;

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Integer thanhTien) {
        this.thanhTien = thanhTien;
    }
}
