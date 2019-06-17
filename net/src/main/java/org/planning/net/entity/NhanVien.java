package org.planning.net.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class NhanVien {

    @Column(name = "MA_NHAN_VIEN")
    private String maNhanVien;

    @Column(name = "TEN_NHAN_VIEN")
    private String tenNhanVien;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "TAI_KHOAN")
    private String taiKhoan;

    @Column(name = "MAT_KHAU")
    private String matKhau;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
}
