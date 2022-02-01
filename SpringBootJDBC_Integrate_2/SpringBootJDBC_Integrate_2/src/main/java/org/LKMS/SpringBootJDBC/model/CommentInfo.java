package org.LKMS.SpringBootJDBC.model;

public class CommentInfo {
	private Long Id;
	private Long customerId	;
	private Long restaurantId;
	private String Content;

	
	public CommentInfo(){
		
	}
	public CommentInfo(Long Id,Long customerId,Long restaurantId,String Content) {
		this.Id=Id;
		this.customerId=customerId;
		this.restaurantId=restaurantId;
		this.Content=Content;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}

	
}
