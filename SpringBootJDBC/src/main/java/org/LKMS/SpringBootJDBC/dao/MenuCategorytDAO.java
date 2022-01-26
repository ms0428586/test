package org.LKMS.SpringBootJDBC.dao;


import java.util.List;

import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.exception.BankTransactionException;
import org.LKMS.SpringBootJDBC.mapper.BankAccountMapper;
import org.LKMS.SpringBootJDBC.mapper.MenuCategoryMapper;
import org.LKMS.SpringBootJDBC.model.BankAccountInfo;
import org.LKMS.SpringBootJDBC.model.MenuCategoryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ch.qos.logback.core.net.SyslogOutputStream;

@Repository
@Transactional
public class MenuCategorytDAO extends JdbcDaoSupport {

	@Autowired
	public MenuCategorytDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public List<MenuCategoryInfo> getMenuCategory() {
		// Select ba.Id, ba.Full_Name, ba.Balance From Bank_Account ba
		String sql = MenuCategoryMapper.BASE_SQL;

		Object[] params = new Object[] {};
		MenuCategoryMapper mapper = new MenuCategoryMapper();
		List<MenuCategoryInfo> list = this.getJdbcTemplate().query(sql, params, mapper);

		return list;
	}

	public MenuCategoryInfo findMenuCategory(Long id) {
		// Select ba.Id, ba.Full_Name, ba.Balance From Bank_Account ba
		// Where ba.Id = ?
		String sql = MenuCategoryMapper.BASE_SQL + " where ca.id = ? ";
		Object[] params = new Object[] { id };
		MenuCategoryMapper mapper = new MenuCategoryMapper();
		try {
			MenuCategoryInfo menuCategory = this.getJdbcTemplate().queryForObject(sql, params, mapper);
			return menuCategory;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	// MANDATORY: Transaction must be created before.
	@Transactional(propagation = Propagation.MANDATORY)
	public void adddescription(Long id ,String product_category, String description) {
		MenuCategoryInfo categoryInfo = this.findMenuCategory(id);

		// Update to DB
		String sqlUpdate = "Update menu_category set product_category = ? ,description = ? where id = ?";
		this.getJdbcTemplate().update(sqlUpdate, categoryInfo.getProdutCategory(),categoryInfo.getdescription(),categoryInfo.getId());
//		if (categoryInfo.getproductcategory() != null) {
//			
//			
//		}else {
//			System.out.println(product_category + "類別已存在");
//		}
		
	}
//	// Do not catch BankTransactionException in this method.

//		public void UpdateCategory(Long fromAccountId, Long toAccountId, double amount){
//			try {
//				adddescription(toAccountId, amount);
//				
//			}catch (BankTransactionException e) {
//				throw e;
//			}
//			
//		}

	
}