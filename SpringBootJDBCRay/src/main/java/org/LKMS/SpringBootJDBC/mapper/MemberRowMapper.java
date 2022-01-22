package org.LKMS.SpringBootJDBC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.LKMS.SpringBootJDBC.form.SelectMemberInfo;
import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<SelectMemberInfo>{
    public static final String BASE_SQL //
    ="SELECT name, email,phone FROM memberinfo WHERE account='zootreekey'";
@Override
public SelectMemberInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

    String newmemberName = rs.getString("name");
    String newmemberPhone = rs.getString("phone");
    String newmemberEmail = rs.getString("email");

    return new SelectMemberInfo(newmemberName,newmemberPhone,newmemberEmail);
}
}
