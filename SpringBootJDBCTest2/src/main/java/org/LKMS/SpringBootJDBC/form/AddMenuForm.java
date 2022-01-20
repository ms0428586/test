package org.LKMS.SpringBootJDBC.form;

public class AddMenuForm {

    private String newid;
	private String newshop;
    private String newmeals;
    private String newscore;
    private String newtask;
    private String newdate;
    
    public String getNewid() {
		return newid;
	}
	public void setNewid(String newid) {
		this.newid = newid;
	}
	public String getNewshop() {
		return newshop;
	}
	public void setNewshop(String newshop) {
		this.newshop = newshop;
	}
	public String getNewmeals() {
		return newmeals;
	}
	public void setNewmeals(String newmeals) {
		this.newmeals = newmeals;
	}
	public String getNewscore() {
		return newscore;
	}
	public void setNewscore(String newscore) {
		this.newscore = newscore;
	}
	public String getNewtask() {
		return newtask;
	}
	public void setNewtask(String newtask) {
		this.newtask = newtask;
	}
	public String getNewdate() {
		return newdate;
	}
	public void setNewdate(String newdate) {
		this.newdate = newdate;
	}
    
    public AddMenuForm(String newid, String newshop,String newmeals,String newscore
    		,String newtask,String newdate ) {
        this.newid = newid;
        this.newshop=newshop;
        this.newmeals=newmeals;
        this.newscore=newscore;
        this.newtask=newtask;
        this.newdate=newdate;
        System.out.println("Form");

        System.out.println(newid + " , "+newshop +" , "+newmeals +" , "+ newscore+
        		" , "+newtask+ " , "+newdate );
      
    }
    
   

    
}