package org.LKMS.SpringBootJDBC.form;

public class SearchStoreForm {
	 private String searchStore;
	 
	 public SearchStoreForm(String searchStore) {
		 this.searchStore=searchStore;
		 System.out.println("Form");
		 System.out.println("尋找"+searchStore);
		}

	public String getSearchStore() {
		return searchStore;
	}

	public void setSearchStore(String searchStore) {
		this.searchStore = searchStore;
	}

}
