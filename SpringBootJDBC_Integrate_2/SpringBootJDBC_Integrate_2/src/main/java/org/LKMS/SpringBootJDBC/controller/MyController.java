package org.LKMS.SpringBootJDBC.controller;

import java.util.List;

import org.LKMS.SpringBootJDBC.Entity.Restaurant;
import org.LKMS.SpringBootJDBC.dao.CommentDAO;
import org.LKMS.SpringBootJDBC.dao.MemberDAO;
import org.LKMS.SpringBootJDBC.dao.RestaurantDAO;
import org.LKMS.SpringBootJDBC.form.AddMemberForm;
import org.LKMS.SpringBootJDBC.model.CommentInfo;
import org.LKMS.SpringBootJDBC.model.RestaurantInfo;
import org.LKMS.SpringBootJDBC.model.SearchRestaurantInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@Autowired
    private MemberDAO memberDAO;
	@Autowired
	private RestaurantDAO restaurantDAO;
	@Autowired
	private CommentDAO commentDAO;
//	以下是我們的網頁連結
	// frontpage--mytask--webplatform---------------------------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showfrontpage(Model model) {
    	
        return "WebplatformFrontpage";
    }

	@RequestMapping(value = "/Mytask", method = RequestMethod.GET)
	public String viewMytask(Model model) {

		return "Mytask";
	}

	@RequestMapping(value = "/RestaurantList", method = RequestMethod.GET)
	public String showRestaurant(Model model,
	        @RequestParam(value = "City", defaultValue = "") String city) {

		//抓取所有餐廳資料 渲染在頁面
		List<RestaurantInfo> list = restaurantDAO.listRestaurantInfo(city);
		model.addAttribute("RestaurantInfos", list);

		return "RestaurantList";
	}
//	@RequestMapping(value = "/RestaurantList/search", method = RequestMethod.POST)
//    public String searchRestaurant(String restaurantSearch) {
//	    System.out.println(restaurantSearch);
//	    return "redirect:/RestaurantList";
//	}
	
	@RequestMapping(value = "/Restaurant", method = RequestMethod.GET)
	public String showRestaurant(Model model,
			@RequestParam(value = "Id", defaultValue = "") Long id) {
		System.out.println(id);
		
		//帶入選擇店家ID 回傳給前端顯示店家
		List<RestaurantInfo> getRestaurantInfo = restaurantDAO.getRestaurantInfo(id);
		model.addAttribute("getRestaurantInfos", getRestaurantInfo);
		
		//測試用
		System.out.println("--------------");
		String NEWname="";
		Long NEWid=null;
		for (RestaurantInfo getname : getRestaurantInfo) {
			NEWname = getname.getRestaurantName();
			NEWid = getname.getRestaurantId();
		}
		System.out.println("--------------");
		
		//查找評論	
		List<CommentInfo> listCommentInfo = commentDAO.listCommentInfo(id);
		if (listCommentInfo.isEmpty() ) {
			model.addAttribute("CommentInfos", null);
		}else {
			model.addAttribute("CommentInfos", listCommentInfo);
		}

		return "Restaurant";
	}

	@RequestMapping(value = "/CallCenter", method = RequestMethod.GET)
	public String viewCallCenter(Model model) {

		return "CallCenter";
	}
//   member-------------------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping(value = "/Member", method = RequestMethod.GET)
	public String viewMember(Model model) {

		return "Member";
	}

	@RequestMapping(value = "/MemberCentreLogin", method = RequestMethod.GET)
	public String viewMemberCentreLogin(Model model) {

		return "MemberCentreLogin";
	}

	@RequestMapping(value = "/MemberCentreRegist", method = RequestMethod.GET)
	public String viewMemberCentreRegist(Model model,@ModelAttribute("addMemberForm") AddMemberForm addMemberForm) {
		
		
		return "MemberCentreRegist";
	}
	

//  處理表單送來的資料
    @RequestMapping(value = "/MemberCentreRegist", method = RequestMethod.POST)
    public String processAddMember(Model model, @ModelAttribute("addMemberForm") AddMemberForm addMemberForm) {
    	
        String NewMemberName = addMemberForm.getNewmemberName();
        String NewMemberPassword = addMemberForm. getNewmemberPassword();
        String NewMemberEmail = addMemberForm.getNewmemberEmail();
 
        System.out.println(NewMemberName + "processAddMenu-----------");
//      新增商品    AddMember取得addMemberForm快取裡的資料 並ADD到資料庫
        memberDAO.AddMember(NewMemberName, NewMemberPassword, NewMemberEmail);

		return "redirect:/MemberCentreLogin";
	}




}