package org.LKMS.SpringBootJDBC.model;

public class PhotoListInfo {

	
	
	private String RestaurantId;
	private String RestaurantPhoto;
	

	public PhotoListInfo(){
		
	}
	public PhotoListInfo(String RestaurantId,String RestaurantPhoto) {

		this.RestaurantId=RestaurantId;
		this.RestaurantPhoto=RestaurantPhoto;
		

	}
	public String getRestaurantId() {
		return RestaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		RestaurantId = restaurantId;
	}
	public String getRestaurantPhoto() {
		return RestaurantPhoto;
	}
	public void setRestaurantPhoto(String restaurantPhoto) {
		RestaurantPhoto = restaurantPhoto;
	}


}
