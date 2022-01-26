package org.LKMS.SpringBootJDBC.model;

public class MenuCategoryInfo {
	
	private Long id;
    private String productCategory;
    private String description;

    public MenuCategoryInfo(Long id,String productCategory, String description	) {
        super();
        this.id = id;
        this.productCategory = productCategory;
        this.description = description;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getProdutCategory() {
        return productCategory;
    }

    public void setProductCategory(String produtCategory) {
        this.productCategory = productCategory;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }
    
}