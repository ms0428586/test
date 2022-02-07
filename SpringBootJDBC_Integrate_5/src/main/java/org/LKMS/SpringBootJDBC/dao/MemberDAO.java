package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.persistence.Query;
import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.Entity.MemberEntity;
import org.LKMS.SpringBootJDBC.model.MemberInfo;
import org.LKMS.SpringBootJDBC.model.RestaurantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO extends JdbcDaoSupport{

//	private MemberInfo memberInfo;
    @Autowired
    public MemberDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public void AddMember(String newmemberAccount ,String newmemberName,String newmemberPassword,String newmemberPhone,String newmemberEmail) {

        String sqlInsert ="INSERT INTO memberinfo(account,name,password,phone,email) VALUES (?,?,?,?,?)";
        this.getJdbcTemplate().update(sqlInsert,newmemberAccount,newmemberName,newmemberPassword,newmemberPhone,newmemberEmail);

    }
    
//    
}
