package org.LKMS.SpringBootJDBC.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;


import org.LKMS.SpringBootJDBC.model.MenuCategoryInfo;
import org.springframework.jdbc.core.RowMapper;

public class MenuCategoryMapper implements RowMapper<MenuCategoryInfo> {

    public static final String BASE_SQL //
            = "Select ca.id, ca.product_category, ca.description From menu_category ca ";

    @Override
    public MenuCategoryInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
    	
    	Long id = rs.getLong("id");
        String productCategory = rs.getString("product_category");
        String description = rs.getString("description");
      
        return new MenuCategoryInfo(id,productCategory, description);
    }

}