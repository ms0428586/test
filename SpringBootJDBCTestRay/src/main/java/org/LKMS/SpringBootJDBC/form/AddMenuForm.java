package org.LKMS.SpringBootJDBC.form;

public class AddMenuForm {

    private Long newid;
    private String newproductCode;
    private String newproductName;
    private String newproductSize;
    private double newproductPrice;
    private String newproductCategory;
    private String newproductDescription;
    
    public AddMenuForm() {
    	
    }
    public AddMenuForm(Long newid, String newproductCode, String newproductName,String newproductSize,double newproductPrice
    		,String newproductDescription,String newproductCategory ) {
        this.newid = newid;
        this.newproductCode=newproductCode;
        this.newproductName=newproductName;
        this.newproductSize=newproductSize;
        this.newproductPrice=newproductPrice;
        this.newproductCategory=newproductCategory;
        this.newproductDescription=newproductDescription;
        System.out.println("Form");

        System.out.println(newid + " , " + newproductCode + " , "+newproductName +" , "+newproductSize +" , "+ newproductPrice+
        		" , "+newproductCategory+ " , "+newproductDescription );
      
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
	public String getNewproductCategory() {
		return newproductCategory;
	}
	public void setNewproductCategory(String newproductCategory) {
		this.newproductCategory = newproductCategory;
	}
	public String getNewproductDescription() {
		return newproductDescription;
	}
	public void setNewproductDescription(String newproductDescription) {
		this.newproductDescription = newproductDescription;
	}
	

    
}