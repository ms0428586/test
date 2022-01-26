package org.LKMS.SpringBootJDBC.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class updatemenuDAO extends JdbcDaoSupport{
    
    @Autowired
    public updatemenuDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
    
    public void updateMenu(Long newId,String newproductCode ,String newproductName,String newproductSize,
            double newproductPrice,String newproductDescription) {
        System.out.println("SQL-----------");
        String sqlInsert ="UPDATE menu SET PRODUCTS_CODE=?,PRODUCTS_NAME=?, PRODUCTS_SIZE=?,PRODUCTS_PRICE=?,PRODUCTS_DESCRIPTION=?  WHERE id=?";
        this.getJdbcTemplate().update(sqlInsert,newproductCode,newproductName,newproductSize,newproductPrice,newproductDescription,newId);
        System.out.println("SQL-----------");
    }
}
