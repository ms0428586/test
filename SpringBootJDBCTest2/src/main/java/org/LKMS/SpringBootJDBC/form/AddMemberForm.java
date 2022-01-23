package org.LKMS.SpringBootJDBC.form;

public class AddMemberForm {

    private String newmemberName;
    private String newmemberPassword;
    private String newmemberEmail;
    private String newmemberPhone;
    
    public AddMemberForm(String newmemberName, String newmemberPassword,String newmemberPhone,String newmemberEmail ) {
        this.newmemberName = newmemberName;
        this.newmemberPassword=newmemberPassword;
        this.newmemberEmail=newmemberEmail;
        this.newmemberPhone=newmemberPhone;
       
        System.out.println("Form");

        System.out.println(newmemberName + " , " + newmemberPassword + " , "+newmemberPhone+" , "+newmemberEmail  );
      
    }

    public String getNewmemberName() {
        return newmemberName;
    }

    public void setNewmemberName(String newmemberName) {
        this.newmemberName = newmemberName;
    }

    public String getNewmemberPassword() {
        return newmemberPassword;
    }

    public void setNewmemberPassword(String newmemberPassword) {
        this.newmemberPassword = newmemberPassword;
    }

    public String getNewmemberEmail() {
        return newmemberEmail;
    }

    public void setNewmemberEmail(String newmemberEmail) {
        this.newmemberEmail = newmemberEmail;
    }

    public String getNewmemberPhone() {
        return newmemberPhone;
    }

    public void setNewmemberPhone(String newmemberPhone) {
        this.newmemberPhone = newmemberPhone;
    }

    
}
