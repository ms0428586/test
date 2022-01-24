package org.LKMS.SpringBootJDBC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.LKMS.SpringBootJDBC.form.MemberLogin;
import org.springframework.jdbc.core.RowMapper;

public class MemberLoginMapper implements RowMapper<MemberLogin>{
	public static final String BASE_SQL //
    = "SELECT password FROM memberinfo WHERE account=?";

@Override
public MemberLogin mapRow(ResultSet rs, int rowNum) throws SQLException {

String newmemberAccount = rs.getString("account");
String newmemberPassword = rs.getString("password");

return new MemberLogin(newmemberAccount, newmemberPassword);
}

}
