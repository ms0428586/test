package org.LKMS.SpringBootJDBC.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "comment")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long Id;

	@Column(name = "member_id", nullable = false)
	private Integer memberId;
	
	@Column(name = "restaurant_id", nullable = false)
	private Integer restaurantId;
	
	@Column(name = "content", length = 255, nullable = false)
	private String Content;
	
	@Column(name = "create_date")
	private String CreateDate;
	
//
//	@JsonBackReference //解決物件中存在雙向引用導致的無限遞迴問題
//	@ManyToOne(cascade = CascadeType.ALL)  //CascadeType.ALL 有所有關聯操作的權限
//	@JoinColumn(name ="member_id")	 //FK為member_id 關聯至MemberEntity的ID NAME當前表的欄位名稱 RFCN 對應表的欄位
//	private MemberEntity memberEntity;
//	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer i) {
		this.memberId = i;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
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

}
