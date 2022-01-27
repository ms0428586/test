package org.LKMS.SpringBootJDBC.form;

public class SearchStoreForm {
	 private String searchStore;
	 
//		private String searchStoreCategory;
//	    private String searchStoreName ;
//	    private String searchStoreAddress;
//	    private String searchStorePhone;
//	    private String searchStoreHours;
	    
	 
	 public SearchStoreForm(String searchStore) {
//		 (String searchStoreCategory, String searchStoreName,
//				 String searchStoreAddress,String searchStorePhone,String searchStoreHours)
		 this.searchStore=searchStore;
		 
//		 this.searchStoreCategory=searchStoreCategory;
//	     this.searchStoreName=searchStoreName;
//	     this.searchStoreAddress=searchStoreAddress;
//	     this.searchStorePhone=searchStorePhone;
//	     this.searchStoreHours=searchStoreHours;
	     
		 System.out.println("Form");
		 System.out.println("尋找"+searchStore);
		}
//	 +";"+ searchStoreCategory+" , "+searchStoreName+
//	 " , "+searchStoreAddress+ " , "+searchStorePhone+ " , "+searchStoreHours
//	public String getSearchStoreCategory() {
//		return searchStoreCategory;
//	}
//
//	public void setSearchStoreCategory(String searchStoreCategory) {
//		this.searchStoreCategory = searchStoreCategory;
//	}
//
//	public String getSearchStoreName() {
//		return searchStoreName;
//	}
//
//	public void setSearchStoreName(String searchStoreName) {
//		this.searchStoreName = searchStoreName;
//	}
//
//	public String getSearchStoreAddress() {
//		return searchStoreAddress;
//	}
//
//	public void setSearchStoreAddress(String searchStoreAddress) {
//		this.searchStoreAddress = searchStoreAddress;
//	}
//
//	public String getSearchStorePhone() {
//		return searchStorePhone;
//	}
//
//	public void setSearchStorePhone(String searchStorePhone) {
//		this.searchStorePhone = searchStorePhone;
//	}
//
//	public String getSearchStoreHours() {
//		return searchStoreHours;
//	}
//
//	public void setSearchStoreHours(String searchStoreHours) {
//		this.searchStoreHours = searchStoreHours;
//	}

	public String getSearchStore() {
		return searchStore;
	}

	public void setSearchStore(String searchStore) {
		this.searchStore = searchStore;
	}

}
