package org.planning.net.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class KhachHang {

    @Column(name = "MA_KHACH_HANG")
    private String maKhachHang;

    @Column(name = "TEN_KHACH_HANG")
    private String tenKhachHang;

    @Column(name ="SDT")
    private String sdt;

    @Column(name = "TAI_KHOAN")
    private Integer taiKhoan;

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Integer getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(Integer taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
}
