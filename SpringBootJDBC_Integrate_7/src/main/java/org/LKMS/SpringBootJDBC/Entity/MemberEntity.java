package org.LKMS.SpringBootJDBC.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "memberinfo")
public class MemberEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",insertable = false, nullable = false)
	private Long Id;

	@Column(name = "account", length = 255, nullable = false)
	private String account;

	@Column(name = "name", length = 255, nullable = false)
	private String name;
	
	@Column(name = "password", length = 255, nullable = true)
	private String password;
	
	@Column(name = "email", length = 255, nullable = false)
	private String email;
	
	@Column(name = "phone", length = 255, nullable = false)
	private String phone;
	
	@Column(name = "photo", length = 255, nullable = false)
	private String photo;
//	@JsonManagedReference //解決物件中存在雙向引用導致的無限遞迴問題
//	@OneToMany(mappedBy = "memberEntity")  //一對多關聯至Comment entity 的 memberEntity
//	private Set<Comment> Comments ;
	


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
