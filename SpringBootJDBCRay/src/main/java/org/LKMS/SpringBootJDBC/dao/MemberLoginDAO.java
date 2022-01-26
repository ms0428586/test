package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.Exception.memberLoginException;
import org.LKMS.SpringBootJDBC.controller.MyController;
import org.LKMS.SpringBootJDBC.form.MemberLogin;
import org.LKMS.SpringBootJDBC.form.MemberLoginInfo;
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
	public MemberLoginInfo findPassword(String newmemberAccount) {
        System.out.println("SQL-----------findPassword");
        String sql ="SELECT account,password FROM memberinfo WHERE account=?";

		Object[] params = new Object[] {newmemberAccount };
		MemberLoginMapper mapper = new MemberLoginMapper();
		try {
			MemberLoginInfo loginAccount = this.getJdbcTemplate().queryForObject(sql, params, mapper);
			System.out.println("MemberLoginDAO");
			return loginAccount;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
    }
	public void login(String newmemberAccount,String newmemberPassword) throws memberLoginException {
		MemberLoginInfo  getLogin = this. findPassword(newmemberAccount);
		 System.out.println("getLogin");
//        String loginpassword="";
//        for(MemberLogin getpassword : getLogin) {
//               loginpassword = getpassword.getNewmemberPassword();
//        }   
        System.out.println(getLogin.getSelectnewmemberAccount());
        
        String gg= newmemberPassword;
        System.out.println(gg);
        
//        String str = "";
//        if(newmemberAccount!=null) {
//            if (getLogin !=null){
//              if(gg.equals(loginpassword)) {
//                  str = "redirect:/member";
//              }else {
//                  str = "redirect:/memberCentre_login";
//              }
//
//            }else {
//                str = "redirect:/memberCentre_login";
//            }
//        }else {
//            str = "redirect:/memberCentre_login";
//        }
//        return str;
        	if ( getLogin==null){
        		throw new memberLoginException(
    					"帳號輸入錯誤 ");
        	}else {
        		if(gg.equals(getLogin)) {
        			
        		}else {
        			throw new memberLoginException(
        					"密碼輸入錯誤 ");
        		}
        	}
        
        
	    }
	}

		
