package org.LKMS.SpringBootJDBC.model;

public class MenuInfo {

    private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String shop;
    private String meals;
    private String score;
    private String task;
    private String date;

    public MenuInfo(String id, String shop,String meals,String score
    		,String task ,String date) {
        super();
        this.id = id;
        this.shop=shop;
        this.meals=meals;
        this.score=score;
        this.task=task;
        this.date=date;
        System.out.println("InFo");
        System.out.println(id +  " , "+shop +" , "+meals +" , "+ score+
        		" , "+task+ " , "+date );
      
    }
}
  
    
    