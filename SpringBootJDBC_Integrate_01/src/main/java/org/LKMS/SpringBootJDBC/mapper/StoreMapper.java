package org.LKMS.SpringBootJDBC.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.LKMS.SpringBootJDBC.model.MenuInfo;
import org.LKMS.SpringBootJDBC.model.StoreInfo;
import org.springframework.jdbc.core.RowMapper;

public class StoreMapper implements RowMapper<StoreInfo> {

	public static  String BASE_SQL
	="SELECT ST.STORE_ID,ST.STORE_CATEGORYS ,ST.STORE_NAMES ,ST.STORE_ADDRESS ,ST.STORE_PHONE ,ST.STORE_HOURS FROM store_test01 ST";
	public StoreInfo mapRow(ResultSet rs, int rowNum) throws SQLException{
		String storeId = rs.getString("STORE_ID");
        String storeCategory = rs.getString("STORE_CATEGORYS");
        String storeName = rs.getString("STORE_NAMES");
        String storeAddress = rs.getString("STORE_ADDRESS");
        String storePhone = rs.getString("STORE_PHONE");
        String storeHours = rs.getString("STORE_HOURS");

        return new StoreInfo(storeId, storeCategory, storeName, storeAddress, storePhone, storeHours);
		
		}
}
