package org.LKMS.SpringBootJDBC.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue
	@Column(name = "restaurant_id", nullable = false)
	private Long restaurantId;

	@Column(name = "restaurant_category", length = 255, nullable = false)
	private String restaurantCategory;

	@Column(name = "restaurant_name", length = 255, nullable = false)
	private String restaurantName;
	
	@Column(name = "restaurant_address", length = 255, nullable = true)
	private String restaurantAddress;
	
	@Column(name = "restaurant_price", length = 255, nullable = false)
	private String restaurantPrice;
	
	@Column(name = "restaurant_phone", length = 255, nullable = false)
	private String restaurantPhone;
	
	@Column(name = "business_hours", length = 255, nullable = false)
	private String businessHours;
	
	@Column(name = "restaurant_web", length = 255, nullable = true)
	private String restaurantWeb;
	
	@Column(name = "restaurant_img", length = 255, nullable = true)
	private String restaurantImg;
	
	@Column(name = "restaurant_map", length = 255, nullable = true)
	private String restaurantMap;

	@Column(name = "restaurant_city", length = 255, nullable = true)
    private String restaurantCity;
	
	private String restaurantSearch;
	
	public String getRestaurantMap() {
		return restaurantMap;
	}

	public void setRestaurantMap(String restaurantMap) {
		this.restaurantMap = restaurantMap;
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

    
    public String getRestaurantSearch() {
        return restaurantSearch;
    }

    public void setRestaurantSearch(String restaurantSearch) {
        this.restaurantSearch = restaurantSearch;
    }

    @Override
    public String toString() {
        return this.getRestaurantCategory() + ", " + this.getRestaurantName()+", " + this.getRestaurantAddress()
        +", " + this.getBusinessHours()+", "+this.getRestaurantPhone()+", "+ this.getRestaurantPrice() 
        +", " + this.getRestaurantWeb() + ", " + this.getRestaurantImg();
    }
	

}
