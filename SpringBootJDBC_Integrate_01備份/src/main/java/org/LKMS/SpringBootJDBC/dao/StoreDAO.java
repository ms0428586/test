package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.mapper.StoreMapper;
import org.LKMS.SpringBootJDBC.mapper.SelectStoreMapper;
import org.LKMS.SpringBootJDBC.model.StoreInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class StoreDAO extends JdbcDaoSupport{
	@Autowired
	public StoreDAO (DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	public List<StoreInfo> getStore(String getCategory) {
		String sql = StoreMapper.BASE_SQL;
		Object[] params = new Object[] {};
		if (getCategory !=null ) {
			sql = SelectStoreMapper.BASE_SQL+"WHERE ST.STORE_CATEGORYS LIKE'%?%'";
			params = new Object[] {getCategory};
		}
		
		
		StoreMapper mapper = new StoreMapper();
		List<StoreInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
		return list;
	}
//	SELECT ST.STORE_CATEGORYS,ST.STORE_NAMES,ST.STORE_ADDRESS,ST.STORE_PHONE,ST.STORE_HOURS FROM store_test01 ST WHERE ST.STORE_CATEGORYS,ST.STORE_NAMES LIKE'%?%'
	public List<StoreInfo> SelectStore(String category) {
		String sql = SelectStoreMapper.BASE_SQL+"ST.STORE_CATEGORYS LIKE'%?%'";

		Object[] params = new Object[] {category};
		SelectStoreMapper mapper = new SelectStoreMapper();
		List<StoreInfo> list = this.getJdbcTemplate().query(sql, params, mapper);

		return list;
	}
}