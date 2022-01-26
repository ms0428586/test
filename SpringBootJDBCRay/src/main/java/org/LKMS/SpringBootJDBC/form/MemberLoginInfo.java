package org.LKMS.SpringBootJDBC.form;

public class MemberLoginInfo {
	private String selectnewmemberAccount;
	private String selectnewmemberPassword;
	
	
	public MemberLoginInfo(String selectnewmemberAccount,String selectnewmemberPassword) {
        this.selectnewmemberAccount= selectnewmemberAccount;
        this.selectnewmemberPassword= selectnewmemberPassword;

       
        System.out.println("MemberLogin");

        System.out.printf(selectnewmemberAccount ,selectnewmemberPassword);  
    }
	public String getSelectnewmemberAccount() {
		return selectnewmemberAccount;
	}
	public void setSelectnewmemberAccount(String selectnewmemberAccount) {
		this.selectnewmemberAccount = selectnewmemberAccount;
	}
	public String getSelectnewmemberPassword() {
		return selectnewmemberPassword;
	}
	public void setSelectnewmemberPassword(String selectnewmemberPassword) {
		this.selectnewmemberPassword = selectnewmemberPassword;
	}
	
}
