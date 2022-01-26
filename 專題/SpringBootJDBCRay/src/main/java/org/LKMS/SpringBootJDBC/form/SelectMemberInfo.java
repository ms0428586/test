package org.LKMS.SpringBootJDBC.form;

public class SelectMemberInfo {
    
    private String newmemberName;
    private String newmemberEmail;
    private String newmemberPhone;
    
    public SelectMemberInfo(String newmemberName,String newmemberPhone,String newmemberEmail ) {
        this.newmemberName = newmemberName;
        this.newmemberEmail=newmemberEmail;
        this.newmemberPhone=newmemberPhone;
       
        System.out.println("Info");

        System.out.println(newmemberName + " , " + newmemberPhone+" , "+newmemberEmail  );
      
    }

    public String getNewmemberName() {
        return newmemberName;
    }

    public void setNewmemberName(String newmemberName) {
        this.newmemberName = newmemberName;
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
