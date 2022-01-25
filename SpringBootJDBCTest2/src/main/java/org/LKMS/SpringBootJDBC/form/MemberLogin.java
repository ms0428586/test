package org.LKMS.SpringBootJDBC.form;


public class MemberLogin {

	private String newmemberAccount;
    public String newmemberPassword;
    
    public MemberLogin(String newmemberAccount, String newmemberPassword) {
        this.newmemberAccount = newmemberAccount;
        this.newmemberPassword=newmemberPassword;
       
        System.out.println("MemberLogin");

        System.out.println(newmemberAccount + " , " + newmemberPassword);
    }

	public String getNewmemberAccount() {
		return newmemberAccount;
	}

	public void setNewmemberAccount(String newmemberAccount) {
		this.newmemberAccount = newmemberAccount;
	}

	public String getNewmemberPassword() {
		return newmemberPassword;
	}

	public void setNewmemberPassword(String newmemberPassword) {
		this.newmemberPassword = newmemberPassword;
	}
    
    
}
