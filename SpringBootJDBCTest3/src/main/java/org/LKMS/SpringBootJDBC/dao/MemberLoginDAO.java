package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.Exception.memberLoginException;
import org.LKMS.SpringBootJDBC.controller.MyController;
import org.LKMS.SpringBootJDBC.form.MemberLogin;
import org.LKMS.SpringBootJDBC.mapper.MemberLoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class MemberLoginDAO  extends JdbcDaoSupport{
	@Autowired
    public MemberLoginDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
//	public void findPassword(String findPassword) {
//        System.out.println("SQL-----------");
//        String sql="SELECT password FROM memberinfo WHERE account=?'";
//        this.getJdbcTemplate().query(sql,findPassword);
//        System.out.println("SQL-----------");
//    }
//	public List<MemberLogin> findByAccount(String newmemberAccount) {
//        System.out.println("SQL-----------");
//        String sql = MemberLoginMapper.BASE_SQL;
//
//		Object[] params = new Object[] { newmemberAccount };
//		MemberLoginMapper mapper = new MemberLoginMapper();
//		try {
//			List<MemberLogin>loginAccount = this.getJdbcTemplate().query(sql, params, mapper);
//			System.out.println("SQL-----------");
//			return loginAccount;
//		} catch (EmptyResultDataAccessException e) {
//			return null;
//		}
//    }
	public List<MemberLogin> findPassword(String newmemberAccount) {
        System.out.println("SQL-----------findPassword");
        String sql ="SELECT  account,password FROM memberinfo WHERE account=?";

		Object[] params = new Object[] {newmemberAccount };
		MemberLoginMapper mapper = new MemberLoginMapper();
		try {
			List<MemberLogin> loginAccount = this.getJdbcTemplate().query(sql, params, mapper);
			System.out.println("MemberLoginDAO");
			return loginAccount;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
    }
	public void login(String newmemberAccount,String newmemberPassword) throws memberLoginException {
		List<MemberLogin>  getLogin = this. findPassword(newmemberAccount);
		 System.out.println("getLogin");
        String loginpassword="";
        for(MemberLogin getpassword : getLogin) {
               loginpassword = getpassword.getNewmemberPassword();
        }   
        System.out.println(loginpassword);
        
        String gg= newmemberPassword;
        System.out.println(gg);
        
        	if (getLogin.isEmpty()){
        		throw new memberLoginException(
    					"帳號輸入錯誤 ");
        	}else {
        		if(gg.equals(loginpassword)) {
        			
        		}else {
        			throw new memberLoginException(
        					"密碼輸入錯誤 ");
        		}
        	}
        
        
	    }
	}

		
