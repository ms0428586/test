package org.LKMS.SpringBootJDBC.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "restaurantphotolist")
public class RestaurantPhotoList {

	@Id
	@GeneratedValue()
	@Column(name = "id", nullable = false)
	private Long Id;

	@Column(name = "Restaurant_Id",insertable = false, nullable = false)
	private String RestaurantId;
	
	
	@Column(name = "Restaurant_Photo", nullable = false)
	private String RestaurantPhoto;


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
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
