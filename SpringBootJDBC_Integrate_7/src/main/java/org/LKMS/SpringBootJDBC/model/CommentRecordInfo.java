package org.LKMS.SpringBootJDBC.model;

public class CommentRecordInfo {
	
	private String MemberImg;
	private String MemberName;
	private String Content;
	private String CreateDate;
	private String RestaurantName;
	private String RestaurantCategory;
	private String RestaurantImg;
	private Long RestaurantId;

	
	public CommentRecordInfo(){
		
	}
	public CommentRecordInfo(String MemberImg,String MemberName,String Content,String CreateDate,String RestaurantName,String RestaurantCategory
			,String RestaurantImg,Long RestaurantId) {
		
		this.MemberImg=MemberImg;
		this.MemberName=MemberName;
		this.Content=Content;
		this.CreateDate=CreateDate;
		this.RestaurantName=RestaurantName;
		this.RestaurantCategory=RestaurantCategory;
		this.RestaurantImg=RestaurantImg;
		this.RestaurantId=RestaurantId;
	
	}
	public String getMemberImg() {
		return MemberImg;
	}
	public void setMemberImg(String memberImg) {
		MemberImg = memberImg;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}
	public String getRestaurantName() {
		return RestaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}
	public String getRestaurantCategory() {
		return RestaurantCategory;
	}
	public void setRestaurantCategory(String restaurantCategory) {
		RestaurantCategory = restaurantCategory;
	}
	public String getRestaurantImg() {
		return RestaurantImg;
	}
	public void setRestaurantImg(String restaurantImg) {
		RestaurantImg = restaurantImg;
	}
	public Long getRestaurantId() {
		return RestaurantId;
	}
	public void setRestaurantId(Long restaurantId) {
		RestaurantId = restaurantId;
	}
	
	

	
}
