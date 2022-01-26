package org.LKMS.SpringBootJDBC.form;

public class updatePsw {
    private String updatePsw;

    
    public updatePsw(String updatePsw) {
        this.updatePsw=updatePsw;

        System.out.println("Form");
        System.out.println( updatePsw);
        
        
      }


    public String getUpdatePsw() {
        return updatePsw;
    }


    public void setUpdatePsw(String updatePsw) {
        this.updatePsw = updatePsw;
    }
}
