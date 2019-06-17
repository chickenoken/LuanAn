package org.planning.net.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class Phong {

    @Column(name = "MA_PHONG")
    private String maPhong;

    @Column(name = "LOAI_PHONG")
    private String loaiPhong;

    @Column(name = "DON_GIA")
    private String donGia;

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }
}
