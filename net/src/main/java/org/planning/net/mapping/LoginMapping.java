package org.planning.net.mapping;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.planning.net.dto.LoginDto;
import org.springframework.jdbc.core.RowMapper;

public class LoginMapping implements RowMapper<LoginDto> {

	  public static final String BASE_SQL = //
	            "Select nv.MaNhanVien,nv.TenNhanVien "//
	                    + " from NHAN_VIEN nv ";

	   public static final String SELECT_DANG_NHAP = //
	           "SELECT nv.taiKhoan , nv.matKhau" +
	           "FROM NHAN_VIEN nv" +
	           "WHERE" +
	               "nv.taiKhoan = '" + "ccc" + "'" +
	               "AND nv.matKhau = '" + "123456789" + "'";

	@Override
	public LoginDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoginDto nv = new LoginDto();
		nv.setMaNhanVien(rs.getString("MaNhanVien"));
		nv.setTenNhanVien(rs.getString("TenNhanVien"));
		return nv;
	}

}
