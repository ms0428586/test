package org.LKMS.SpringBootJDBC.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;


import org.LKMS.SpringBootJDBC.model.MenuInfo;
import org.springframework.jdbc.core.RowMapper;

public class MenuMapper implements RowMapper<MenuInfo> {

    public static final String BASE_SQL //
    	="SELECT MN.ID, MN.PRODUCTS_CODE, MN.PRODUCTS_NAME, MN.PRODUCTS_SIZE, MN.PRODUCTS_PRICE, MN.PRODUCTS_CATEGORY, MN.PRODUCTS_DESCRIPTION From MENU MN";
    @Override
    public MenuInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

        Long id = rs.getLong("ID");
        String productCode = rs.getString("PRODUCTS_CODE");
        String productName = rs.getString("PRODUCTS_NAME");
        String productSize = rs.getString("PRODUCTS_SIZE");
        double productPrice = rs.getDouble("PRODUCTS_PRICE");
        String productCategory = rs.getString("PRODUCTS_CATEGORY");
        String productDescription = rs.getString("PRODUCTS_DESCRIPTION");

        return new MenuInfo(id, productCode, productName,productSize,productPrice,productCategory,productDescription);
    }

}