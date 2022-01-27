package org.LKMS.SpringBootJDBC.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;


import org.LKMS.SpringBootJDBC.model.MenuInfo;
import org.springframework.jdbc.core.RowMapper;

public class MenuMapper implements RowMapper<MenuInfo> {

    public static String BASE_SQL //
    	="SELECT MN.ID, MN.PRODUCTS_NAME, MN.PRODUCTS_SIZE, MN.PRODUCTS_PRICE, MN.PRODUCTS_CATEGORY, MN.PRODUCTS_DESCRIPTION From menu_test01 MN";
    @Override
    public MenuInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

    	String id = rs.getString("ID");
        String productName = rs.getString("PRODUCTS_NAME");
        String productSize = rs.getString("PRODUCTS_SIZE");
        double productPrice = rs.getDouble("PRODUCTS_PRICE");
        String productCategory = rs.getString("PRODUCTS_CATEGORY");
        String productDescription = rs.getString("PRODUCTS_DESCRIPTION");

        return new MenuInfo(id, productName,productSize,productPrice,productCategory,productDescription);
    }

}