package org.LKMS.SpringBootJDBC.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;


import org.LKMS.SpringBootJDBC.model.MenuInfo;
import org.springframework.jdbc.core.RowMapper;

public class MenuMapper implements RowMapper<MenuInfo> {

    public static final String BASE_SQL //
    	="SELECT MN.ID, MN.shop, MN.meals, MN.score, MN.task, MN.date  From comment MN";
    @Override
    public MenuInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

    	String id = rs.getString("ID");
        String shop = rs.getString("shop");
        String meals  = rs.getString("meals");
        String score = rs.getString("score");
        String task = rs.getString("task");
        String date = rs.getString("date");

        return new MenuInfo(id,shop,meals,score,task,date);
    }

}