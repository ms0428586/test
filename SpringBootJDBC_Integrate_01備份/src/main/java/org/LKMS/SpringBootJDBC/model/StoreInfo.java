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

	public String getStoreCategory() {
		return storeCategory;
	}

	public void setStoreCategory(String storeCategory) {
		this.storeCategory = storeCategory;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStorePhone() {
		return storePhone;
	}

	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

	public String getStoreHours() {
		return storeHours;
	}

	public void setStoreHours(String storeHours) {
		this.storeHours = storeHours;
	}

}
