package org.LKMS.SpringBootJDBC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.LKMS.SpringBootJDBC.form.MemberLogin;
import org.LKMS.SpringBootJDBC.form.MemberLoginInfo;
import org.springframework.jdbc.core.RowMapper;

public class MemberLoginMapper implements RowMapper<MemberLoginInfo>{
//	public static final String BASE_SQL //
//    = "SELECT account,password FROM memberinfo WHERE account=?";

@Override
public MemberLoginInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

String selectnewmemberAccount = rs.getString("account");
String selectnewmemberPassword = rs.getString("password");

return new MemberLoginInfo(selectnewmemberAccount,selectnewmemberPassword);
}

}
