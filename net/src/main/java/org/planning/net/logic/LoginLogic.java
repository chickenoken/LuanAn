package org.planning.net.logic;

import org.planning.net.dto.LoginDto;
import org.planning.net.entity.NhanVien;

public interface LoginLogic {

	public NhanVien dangNhap(LoginDto model) throws Exception;

}
