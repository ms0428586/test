package org.LKMS.SpringBootJDBC.model;

public class MenuInfo {

    private Long id;
    private String productCode;
    private String productName;
    private String productSize;
    private double productPrice;
    private String productCategory;
    private String productDescription;

    public MenuInfo(Long id, String productCode, String productName,String productSize,double productPrice
    		,String productCategory ,String productDescription) {
        super();
        this.id = id;
        this.productCode=productCode;
        this.productName=productName;
        this.productSize=productSize;
        this.productPrice=productPrice;
        this.productCategory=productCategory;
        this.productDescription=productDescription;
        System.out.println("InFo");
        System.out.println(id + " , " + productCode + " , "+productName +" , "+productSize +" , "+ productPrice+
        		" , "+productCategory+ " , "+productDescription );
      
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
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
    public void setProductSize(double productPrice) {
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