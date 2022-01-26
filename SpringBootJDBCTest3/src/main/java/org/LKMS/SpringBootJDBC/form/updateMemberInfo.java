package org.LKMS.SpringBootJDBC.form;

public class updateMemberInfo {
    
    private String updatememberName;
    private String updatememberEmail;
    private String updatememberPhone;
    
    public updateMemberInfo(String updatememberName,String updatememberEmail,String updatememberPhone) {
        this.updatememberName=updatememberName;
        this.updatememberEmail=updatememberEmail;
        this.updatememberPhone=updatememberPhone;
        
        System.out.println("Form");
        System.out.println( updatememberName+ " , "+updatememberEmail + " , "+updatememberPhone );
      }


    
    public String getUpdatememberName() {
        return updatememberName;
    }



    public void setUpdatememberName(String updatememberName) {
        this.updatememberName = updatememberName;
    }



    public String getUpdatememberEmail() {
        return updatememberEmail;
    }

    public void setUpdatememberEmail(String updatememberEmail) {
        this.updatememberEmail = updatememberEmail;
    }

    public String getUpdatememberPhone() {
        return updatememberPhone;
    }

    public void setUpdatememberPhone(String updatememberPhone) {
        this.updatememberPhone = updatememberPhone;
    }
    
    
}
