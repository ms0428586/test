package org.LKMS.SpringBootJDBC.model;

public class StoreInfo {

//	private String  storeId;
	private String	storeCategory;
	private String	storeName;	
	private String	storeAddress;
	private String	storePhone;
	private String	storeHours;

	public	StoreInfo (String storeCategory,String storeName,String storeAddress,String storePhone,String storeHours) {
		super();
		this.storeCategory=storeCategory;
		this.storeName=storeName;
		this.storeAddress=storeAddress;
		this.storePhone=storePhone;
		this.storeHours=storeHours;
		System.out.println("InFo");
        System.out.println( storeCategory +" , "+storeName +" , "+ storeAddress+", "+storePhone+ " , "+storeHours );
		
	}
//	public String getstoreId() {
//		return storeId;
//	}
//
//	public void setstoreId(String storeId) {
//		this.storeId = storeId;
//	}
       public String getstoreCategory() {
        return storeCategory;
    }
    public void setstoreCategory(String storeCategory) {
        this.storeCategory = storeCategory;
    }

    public String storeName() {
        return storeName;
    }
    public void setstoreName(String storeName) {
        this.storeName = storeName;
    }
    
    public String getstoreAddress() {
        return storeAddress;
    }
    public void setstoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getstorePhone() {
        return storePhone;
    }
    public void setstorePhone(String storePhone) {
		this.storePhone = storePhone;
	}
    public String getstoreHours() {
        return storeHours;
    }
    public void setstoreHours(String storeHours) {
        this.storeHours = storeHours;
    }
  
}
