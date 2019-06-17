package org.planning.net.dao;

import org.planning.net.entity.NhanVien;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@InjectConfig
public interface testDoma {

    @Select
    String testDoma();

    @Select
    NhanVien selectByTaiKhoanAndPass(String taiKhoan, String matKhau);
}
