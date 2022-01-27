package org.LKMS.SpringBootJDBC.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class updateMemberInfoDAO  extends JdbcDaoSupport{
    @Autowired
    public updateMemberInfoDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
    
    public void updateMember(String updatememberName,String updatememberEmail,String updatememberPhone) {
        System.out.println("SQL-----------");
        String sqlInsert ="UPDATE memberinfo SET name=?,email=?,phone=?  WHERE account='zootreekey'";
        this.getJdbcTemplate().update(sqlInsert,updatememberName,updatememberEmail,updatememberPhone);
        System.out.println("SQL-----------");
    }
}
