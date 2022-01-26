package org.LKMS.SpringBootJDBC.form;


public class UpdateCategoryForm{
    
    private Long fromMenuId;
    private String fromProductCategory;
    private String description;
 
    public UpdateCategoryForm() {
 
    }
 
    public UpdateCategoryForm(Long fromMenuId, String fromProductCategory, String description) {
        this.fromMenuId = fromMenuId;
        this.fromProductCategory = fromProductCategory;
        this.description = description;
    }
 
    public Long getFromMenuId() {
        return fromMenuId;
    }
 
    public void setFromMenuId(Long fromMenuId) {
        this.fromMenuId = fromMenuId;
    }
 
    public String getFromProductCategory() {
        return fromProductCategory;
    }
 
    public void setFromProductCategoryd(String fromProductCategory) {
        this.fromProductCategory = fromProductCategory;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setdescription(String descriptionunt) {
        this.description = description;
    }
    
}