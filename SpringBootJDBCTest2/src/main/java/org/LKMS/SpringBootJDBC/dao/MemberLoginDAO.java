package org.LKMS.SpringBootJDBC.dao;



import java.util.List;

import javax.sql.DataSource;

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
	
	public List<MemberLogin> findByAccount(String newmemberAccount) {
        System.out.println("SQL-----------");
        String sql = MemberLoginMapper.BASE_SQL;

		Object[] params = new Object[] { newmemberAccount };
		MemberLoginMapper mapper = new MemberLoginMapper();
		try {
			List<MemberLogin> bankAccount = this.getJdbcTemplate().query(sql, params, mapper);
			System.out.println("SQL-----------");
			return bankAccount;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
    }
	public List<MemberLogin> findPassword(String newmemberPassword) {
        System.out.println("SQL-----------findPassword");
        String sql = MemberLoginMapper.BASE_SQL;

		Object[] params = new Object[] {newmemberPassword };
		MemberLoginMapper mapper = new MemberLoginMapper();
		try {
			List<MemberLogin> bankAccount = this.getJdbcTemplate().query(sql, params, mapper);
			System.out.println("SQL-----------newmemberPassword");
			return bankAccount;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
    }
}
