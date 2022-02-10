package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.Entity.Comment;
import org.LKMS.SpringBootJDBC.Entity.MemberEntity;
import org.LKMS.SpringBootJDBC.Exception.memberLoginException;
import org.LKMS.SpringBootJDBC.controller.MyController;
import org.LKMS.SpringBootJDBC.form.MemberLoginForm;
import org.LKMS.SpringBootJDBC.model.CommentInfo;
import org.LKMS.SpringBootJDBC.model.MemberInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class MemberLoginDAO {
	@Autowired
	private EntityManager entityManager;
	
	
	public void login(String newmemberAccount,String newmemberPassword) throws memberLoginException {
		if (newmemberAccount !="") {  //判斷是否有輸入帳號
			System.out.println("帳號欄位輸入 OK");
			if(newmemberPassword !="") { //判斷是否有輸入密碼
				System.out.println("密碼欄位輸入 OK");
				List<MemberInfo> findMember = FindMember(newmemberAccount);
				if (findMember.isEmpty() ) {   //判斷是不是會員 if findMember沒有元素 則回傳true
					throw new memberLoginException("查無此帳號");
				}else {
					System.out.println("會員存在 OK");
					if(findMember.get(0).getPassword().equals(newmemberPassword)) {
						System.out.println("PSW OK");
						
					}else {
						System.out.println("PSW not found");
						throw new memberLoginException("密碼錯誤!");
					}
				}
			}else {throw new memberLoginException("請輸入密碼!");
			}
			}else {throw new memberLoginException("請輸入帳號!");
		}
	}
	
	public List<MemberInfo> FindMember(String NewAccount) {
		String sql = "Select new " + MemberInfo.class.getName() + "(MB.Id,MB.account,MB.name,MB.password,MB.email,MB.phone)"
				+ " from " + MemberEntity.class.getName() + " MB "
				+ "WHERE account='"+ NewAccount+"'";
		System.out.println("SQL:"+sql);
		try {
			Query query = entityManager.createQuery(sql, MemberInfo.class);
			return query.getResultList();
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
    }

}
		
