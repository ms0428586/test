package org.LKMS.SpringBootJDBC.form;

public class AddMenuForm {

    private String newid;
   
	private String newproductName;
    private String newproductSize;
    private double newproductPrice;
    private String newproductCategory;
    private String newproductDescription;
    
    public AddMenuForm() {
    	
    }
    public AddMenuForm(String newid, String newproductName,String newproductSize,double newproductPrice
    		,String newproductCategory,String newproductDescription ) {
        this.newid = newid;
        this.newproductName=newproductName;
        this.newproductSize=newproductSize;
        this.newproductPrice=newproductPrice;
        this.newproductCategory=newproductCategory;
        this.newproductDescription=newproductDescription;
        System.out.println("Form");

        System.out.println(newid + " , "+newproductName +" , "+newproductSize +" , "+ newproductPrice+
        		" , "+newproductCategory+ " , "+newproductDescription );
      
    }
    public String getNewid() {
		return newid;
	}
	public void setNewid(String newid) {
		this.newid = newid;
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