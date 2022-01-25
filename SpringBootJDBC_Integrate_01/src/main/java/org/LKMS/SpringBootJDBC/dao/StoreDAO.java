package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.sql.DataSource;

import org.LKMS.SpringBootJDBC.mapper.StoreMapper;
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
	@SuppressWarnings("deprecation")
	public List<StoreInfo> getStore() {

		String sql = StoreMapper.BASE_SQL;

		Object[] params = new Object[] {};
		StoreMapper mapper = new StoreMapper();
		List<StoreInfo> list = this.getJdbcTemplate().query(sql, params, mapper);

		return list;
	}
	SELECT ST.STORE_CATEGORYS,ST.STORE_NAMES,ST.STORE_ADDRESS,ST.STORE_PHONE,ST.STORE_HOURS FROM store_test01 ST WHERE ST.STORE_CATEGORYS,ST.STORE_NAMES LIKE'%?%'

}
