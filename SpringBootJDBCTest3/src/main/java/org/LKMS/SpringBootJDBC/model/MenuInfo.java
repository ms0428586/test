package org.LKMS.SpringBootJDBC.model;

public class MenuInfo {

    private String id;
	private String productName;
    private String productSize;
    private double productPrice;
    private String productCategory;
    private String productDescription;

    public MenuInfo(String id, String productName,String productSize,double productPrice
    		,String productCategory ,String productDescription) {
        super();
        this.id = id;
        this.productName=productName;
        this.productSize=productSize;
        this.productPrice=productPrice;
        this.productCategory=productCategory;
        this.productDescription=productDescription;
        System.out.println("InFo");
        System.out.println(id +  " , "+productName +" , "+productSize +" , "+ productPrice+
        		" , "+productCategory+ " , "+productDescription );
      
    }

  
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
   

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public String getProductSize() {
        return productSize;
    }
    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
    public String getProductCategory() {
        return productCategory;
    }
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    
}