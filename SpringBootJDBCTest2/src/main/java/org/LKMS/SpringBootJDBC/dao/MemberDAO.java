package org.LKMS.SpringBootJDBC.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO extends JdbcDaoSupport{

    @Autowired
    public MemberDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public void AddMember(String newmemberName ,String newmemberPassword,String newmemberPhone,String newmemberEmail) {
        System.out.println("SQL-----------");
        String sqlInsert ="INSERT INTO memberinfo(name,password,phone,email) VALUES (?,?,?,?)";
        this.getJdbcTemplate().update(sqlInsert,newmemberName,newmemberPassword,newmemberPhone,newmemberEmail);
        System.out.println("SQL-----------");
    }
}
