package org.LKMS.SpringBootJDBC.model;

public class CommentInfo {
	
	private String Content;
	private String CreateDate;
	private String MemberName;

	
	public CommentInfo(){
		
	}
	public CommentInfo(String Content,String CreateDate,String MemberName) {
		
		this.Content=Content;
		this.CreateDate=CreateDate;
		this.MemberName=MemberName;
		
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public String getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}


	
}
