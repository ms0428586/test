package org.LKMS.SpringBootJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.form.SelectMemberInfo;
import org.LKMS.SpringBootJDBC.mapper.MemberRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class SelectMemberDAO extends JdbcDaoSupport{
   
    @Autowired
    public SelectMemberDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
    
    public List<SelectMemberInfo> getMemberInfo() {
    String sql = MemberRowMapper.BASE_SQL;

    Object[] params = new Object[] {};
    MemberRowMapper mapper = new MemberRowMapper();
    List<SelectMemberInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
 
    return list;
}
}
