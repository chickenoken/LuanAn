package org.planning.net.service;

import org.planning.net.dto.LoginDto;
import org.planning.net.entity.NhanVien;

public interface LoginService {

    public NhanVien dangNhap(LoginDto model) throws Exception;

}
