package org.LKMS.SpringBootJDBC.model;

public class MyCommentInfo {

	private Long memberId;
	private String account;
	private String name;
	private String password;
	private String email;
	private int phone;

	public MyCommentInfo() {

	}

	public MyCommentInfo(Long memberId,String account,String name,String password,String email,int phone) {
		this.memberId=memberId;
		this.account=account;
		this.name=name;
		this.password=password;
		this.email=email;
		this.phone=phone;
		
		System.out.println("MemberInfo");

        System.out.println(account + " , " + name);
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String toString() {
		return memberId+"，"+account+"，"+name+"，"+password+"，"+email+"，"+ phone;
	}
}
