package org.LKMS.SpringBootJDBC.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UpdatePswDAO  extends JdbcDaoSupport{
    
    @Autowired
    public UpdatePswDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
    
    public void updatePsw(String updatePsw) {
        System.out.println("SQL-----------");
        String sqlInsert ="UPDATE memberinfo SET password=?  WHERE account='zootreekey'";
        this.getJdbcTemplate().update(sqlInsert,updatePsw);
        System.out.println("SQL-----------");
    }
}
