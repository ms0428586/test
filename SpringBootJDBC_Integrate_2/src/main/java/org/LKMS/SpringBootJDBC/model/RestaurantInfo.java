package org.LKMS.SpringBootJDBC.model;

public class RestaurantInfo {
	private Long restaurantId;
	private String restaurantCategory;
	private String restaurantName;
	private String restaurantAddress;
	private String restaurantPrice;
	private String restaurantPhone;
	private String businessHours;
	private String restaurantWeb;
	private String restaurantImg;
	private String restaurantMap;
	private String restaurantCity;
	
	public String getRestaurantMap() {
		return restaurantMap;
	}
	public void setRestaurantMap(String restaurantMap) {
		this.restaurantMap = restaurantMap;
	}
	public RestaurantInfo(){
		
	}
	public RestaurantInfo(Long restaurantId,String restaurantCategory,String restaurantName,
			String restaurantAddress,String restaurantPrice,String restaurantPhone,
			String businessHours,String restaurantWeb,String restaurantImg,String restaurantMap,String restaurantCity) {
		this.restaurantId=restaurantId;
		this.restaurantCategory=restaurantCategory;
		this.restaurantName=restaurantName;
		this.restaurantAddress=restaurantAddress;
		this.restaurantPrice=restaurantPrice;
		this.restaurantPhone=restaurantPhone;
		this.businessHours=businessHours;
		this.restaurantWeb=restaurantWeb;
		this.restaurantImg=restaurantImg;
		this.restaurantMap=restaurantMap;
		this. restaurantCity=restaurantCity;

		System.out.println("RInfo");
		System.out.println(restaurantId);
	}
	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantCategory() {
		return restaurantCategory;
	}
	public void setRestaurantCategory(String restaurantCategory) {
		this.restaurantCategory = restaurantCategory;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getRestaurantPrice() {
		return restaurantPrice;
	}
	public void setRestaurantPrice(String restaurantPrice) {
		this.restaurantPrice = restaurantPrice;
	}
	public String getRestaurantPhone() {
		return restaurantPhone;
	}
	public void setRestaurantPhone(String restaurantPhone) {
		this.restaurantPhone = restaurantPhone;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getRestaurantWeb() {
		return restaurantWeb;
	}
	public void setRestaurantWeb(String restaurantWeb) {
		this.restaurantWeb = restaurantWeb;
	}
	public String getRestaurantImg() {
		return restaurantImg;
	}
	public void setRestaurantImg(String restaurantImg) {
		this.restaurantImg = restaurantImg;
	}
    public String getRestaurantCity() {
        return restaurantCity;
    }
    public void setRestaurantCity(String restaurantCity) {
        this.restaurantCity = restaurantCity;
    }
	
	
}
