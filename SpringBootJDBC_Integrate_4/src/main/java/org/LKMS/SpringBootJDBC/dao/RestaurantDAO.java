package org.LKMS.SpringBootJDBC.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.LKMS.SpringBootJDBC.model.RestaurantInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.LKMS.SpringBootJDBC.Entity.Restaurant;


@Repository
public class RestaurantDAO {
	@Autowired
	private EntityManager entityManager;

	
	public RestaurantDAO(){
	
	}
	public List<RestaurantInfo> listRestaurantInfo(String city) {
	

		String sql = "Select new " + RestaurantInfo.class.getName() 
				+ "(R.restaurantId,R.restaurantCategory,R.restaurantName,R.restaurantAddress,"
				+ "R.restaurantPrice,R.restaurantPhone,R.businessHours,R.restaurantWeb,R.restaurantImg,R.restaurantMap,R.restaurantCity) " 
				+ " from " + Restaurant.class.getName() + " R WHERE restaurantCity LIKE  '%"+city+"%'";
		System.out.println("SQL");
		Query query = entityManager.createQuery(sql, RestaurantInfo.class);
		System.out.println("Query");

		return query.getResultList();
	}
	
	public List<RestaurantInfo> getRestaurantInfo(Long id) {
		System.out.println("getRestaurantInfo");
		
		String sql = "Select new " + RestaurantInfo.class.getName() 
				+ "(R.restaurantId,R.restaurantCategory,R.restaurantName,R.restaurantAddress,"
				+ "R.restaurantPrice,R.restaurantPhone,R.businessHours,R.restaurantWeb,R.restaurantImg,R.restaurantMap,R.restaurantCity) " 
				+ " from " + Restaurant.class.getName() + " R WHERE id=" +id;

		Query query = entityManager.createQuery(sql, RestaurantInfo.class);
		
	
		return query.getResultList();
	}
	
	public List<RestaurantInfo> SearchRestaurant(String searchRestaurant) {
        System.out.println("SearchSQL-1");
        System.out.println(searchRestaurant);

        String sql = "Select new " + RestaurantInfo.class.getName() 
                + "(R.restaurantId,R.restaurantCategory,R.restaurantName,R.restaurantAddress,"
                + "R.restaurantPrice,R.restaurantPhone,R.businessHours,R.restaurantWeb,R.restaurantImg,R.restaurantMap,R.restaurantCity) " 
                + " from " + Restaurant.class.getName() 
                + " R WHERE restaurantCategory LIKE '%"+searchRestaurant+"%'"
                +"OR restaurantName LIKE '%"+searchRestaurant+"%'"
                +"OR restaurantAddress LIKE '%"+searchRestaurant+"%'"
                +"OR restaurantCity LIKE '%"+searchRestaurant+"%'";
        
        System.out.println("SearchSQL-2");
        Query query = entityManager.createQuery(sql, RestaurantInfo.class);
        System.out.println("Search");

        return query.getResultList();
    }
	

}
