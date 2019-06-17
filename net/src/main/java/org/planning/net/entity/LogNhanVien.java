package org.planning.net.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class LogNhanVien {

    @Column(name = "MA_NHAN_VIEN")
    private String maNhanVien;

    @Column(name = "DANG_NHAP")
    private String dangNhap;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getDangNhap() {
        return dangNhap;
    }

    public void setDangNhap(String dangNhap) {
        this.dangNhap = dangNhap;
    }
}
