package domain;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="USER")	

public class UserBean {
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column (name="account")
	private String account;
	
	@Column (name="passwd")
	private String passwd;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "verfycode")
	private String verfycode;
	
	public String toString() {
		return "CustomerBean [account=" + account + ", passwd=" + passwd + ", email=" + email + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getaccount() {
		return account;
	}
	public void setaccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return passwd;
	}
	public void setPassword(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
