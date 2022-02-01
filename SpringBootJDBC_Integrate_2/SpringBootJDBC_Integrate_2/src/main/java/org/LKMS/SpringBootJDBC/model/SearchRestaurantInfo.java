package org.LKMS.SpringBootJDBC.model;

public class SearchRestaurantInfo {
    private String restaurantSearch;
    
    public SearchRestaurantInfo(String restaurantSearch) {
        this.restaurantSearch=restaurantSearch;
    }

    public String getRestaurantSearch() {
        return restaurantSearch;
    }

    public void setRestaurantSearch(String restaurantSearch) {
        this.restaurantSearch = restaurantSearch;
    }
    
    
    
}
