package org.LKMS.SpringBootJDBC.dao;


import java.util.List;

import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.exception.BankTransactionException;
import org.LKMS.SpringBootJDBC.mapper.MenuMapper;
import org.LKMS.SpringBootJDBC.model.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MenuDAO extends JdbcDaoSupport {

	@Autowired
	public MenuDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public List<MenuInfo> getMenu() {
		
		String sql = MenuMapper.BASE_SQL;

		Object[] params = new Object[] {};
		MenuMapper mapper = new MenuMapper();
		List<MenuInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
	 
		return list;
	}
	
	public void AddMenu(String newId,String newshop,String newmeals,
			String newscore,String newtask,String newdate) {
		System.out.println("SQL-----------");
		String sqlInsert ="INSERT INTO comment(ID,shop,meals,score,task,date) VALUES (?,?,?,?,?,?)";
		this.getJdbcTemplate().update(sqlInsert,newId,newshop,newmeals,newscore,newtask,newdate);
		System.out.println("SQL-----------");
	}

	
	
}