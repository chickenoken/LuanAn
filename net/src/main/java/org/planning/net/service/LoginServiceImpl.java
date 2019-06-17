package org.planning.net.service;

import org.planning.net.dto.LoginDto;
import org.planning.net.entity.NhanVien;
import org.planning.net.logic.LoginLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginLogic loginLogic;

    @Override
    public NhanVien dangNhap(LoginDto model) throws Exception {

        return loginLogic.dangNhap(model);
    }

}
