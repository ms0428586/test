package org.LKMS.SpringBootJDBC.form;

public class updateMenuForm {
    
    private Long newid;
    private String newproductCode;
    private String newproductName;
    private String newproductSize;
    private double newproductPrice;
    private String newproductDescription;
    
    public updateMenuForm() {
        
    }
    public updateMenuForm(Long newid, String newproductCode, String newproductName,String newproductSize,double newproductPrice
            ,String newproductDescription,String newproductCategory ) {
        this.newid = newid;
        this.newproductCode=newproductCode;
        this.newproductName=newproductName;
        this.newproductSize=newproductSize;
        this.newproductPrice=newproductPrice;
        this.newproductDescription=newproductDescription;
        System.out.println("Form");

        System.out.println(newid + " , " + newproductCode + " , "+newproductName +" , "+newproductSize +" , "+ newproductPrice+
                " , "+newproductDescription );
      
    }
    public Long getNewid() {
        return newid;
    }
    public void setNewid(Long newid) {
        this.newid = newid;
    }
    public String getNewproductCode() {
        return newproductCode;
    }
    public void setNewproductCode(String newproductCode) {
        this.newproductCode = newproductCode;
    }
    public String getNewproductName() {
        return newproductName;
    }
    public void setNewproductName(String newproductName) {
        this.newproductName = newproductName;
    }
    public String getNewproductSize() {
        return newproductSize;
    }
    public void setNewproductSize(String newproductSize) {
        this.newproductSize = newproductSize;
    }
    public double getNewproductPrice() {
        return newproductPrice;
    }
    public void setNewproductPrice(double newproductPrice) {
        this.newproductPrice = newproductPrice;
    }
    public String getNewproductDescription() {
        return newproductDescription;
    }
    public void setNewproductDescription(String newproductDescription) {
        this.newproductDescription = newproductDescription;
    }
    
    
}
