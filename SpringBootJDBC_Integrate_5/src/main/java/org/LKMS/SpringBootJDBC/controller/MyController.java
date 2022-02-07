package org.LKMS.SpringBootJDBC.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.LKMS.SpringBootJDBC.form.MemberLoginForm;
import org.LKMS.SpringBootJDBC.Entity.Comment;
import org.LKMS.SpringBootJDBC.Entity.Restaurant;
import org.LKMS.SpringBootJDBC.Exception.memberLoginException;
import org.LKMS.SpringBootJDBC.dao.CommentDAO;
import org.LKMS.SpringBootJDBC.dao.MemberDAO;
import org.LKMS.SpringBootJDBC.dao.MemberLoginDAO;
import org.LKMS.SpringBootJDBC.dao.RestaurantDAO;
import org.LKMS.SpringBootJDBC.form.AddMemberForm;
import org.LKMS.SpringBootJDBC.model.CommentInfo;
import org.LKMS.SpringBootJDBC.model.CommentRecordInfo;
import org.LKMS.SpringBootJDBC.model.MemberInfo;
import org.LKMS.SpringBootJDBC.model.PhotoListInfo;
import org.LKMS.SpringBootJDBC.model.RestaurantInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MyController {
	@Autowired
	private MemberDAO memberDAO;
	@Autowired
	private RestaurantDAO restaurantDAO;
	@Autowired
	private CommentDAO commentDAO;
	@Autowired
	private MemberLoginDAO memberLoginDAO;

	
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
	public String showRestaurant(Model model, @RequestParam(value = "City", defaultValue = "") String city) {

		// 抓取所有餐廳資料 渲染在頁面
		List<RestaurantInfo> list = restaurantDAO.listRestaurantInfo(city);
		model.addAttribute("RestaurantInfos", list);

		// 測試用
		System.out.println("--------------");
		for (RestaurantInfo getlist : list) {
			String NEWname = "";
			NEWname = getlist.getRestaurantName();
			System.out.println(NEWname);
		}
		System.out.println("--------------");

		return "RestaurantList";
	}
	@PostMapping("/RestaurantList")
	public String SearchRestaurant(Model model,String searchRestaurant) {
	    System.out.println(searchRestaurant);
	    
	    List<RestaurantInfo> SearchList = restaurantDAO.SearchRestaurant(searchRestaurant);
        model.addAttribute("RestaurantInfos", SearchList);
        
	    return "RestaurantList";
	    
	}
	@RequestMapping(value = "/Restaurant", method = RequestMethod.GET)
	public String showRestaurant(Model model, @RequestParam(value = "Id", defaultValue = "") Long id,@ModelAttribute("MemberInfos") MemberInfo userAccount) {
		System.out.println(id);

		// 帶入選擇店家ID 回傳給前端顯示店家
		List<RestaurantInfo> getRestaurantInfo = restaurantDAO.getRestaurantInfo(id);
		model.addAttribute("getRestaurantInfos", getRestaurantInfo);
		//店家照片
		List<PhotoListInfo> pohtoList = restaurantDAO.getpohtoListInfo(id);
		model.addAttribute("PhotoListInfos", pohtoList);

		// 查找評論
		List<CommentInfo> listCommentInfo = commentDAO.listCommentInfo(id);
		if (listCommentInfo.isEmpty()) {
			model.addAttribute("CommentInfos", null);
		} else {
			model.addAttribute("CommentInfos", listCommentInfo);
		}

		return "Restaurant";
	}
	@PostMapping("/Restaurant")
    public String addNewComment(Model model,String newComment,@ModelAttribute("MemberInfos") MemberInfo userAccount) {

        System.out.println(newComment);
        commentDAO.addComment(newComment);
        return "redirect:/Restaurant?Id=1";
    }
	@RequestMapping(value = "/CallCenter", method = RequestMethod.GET)
	public String viewCallCenter(Model model) {

		return "CallCenter";
	}
//   member-------------------------------------------------------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value = "/Member", method = RequestMethod.GET)
    public String showMemberInfo(Model model,@ModelAttribute("MemberInfos") MemberInfo userInfo,
    		RedirectAttributes redirectAttributes,@RequestParam(value = "RId", defaultValue = "") Long Rid,
    		@RequestParam(value = "MId", defaultValue = "") Long Mid) {
		model.addAttribute("MemberInfos", userInfo);
		System.out.println(userInfo.getMemberId()+"==========");

		if(Rid !=null) {
			System.out.println(Rid+Mid+"==========");
			commentDAO.deleteComment(Rid,Mid);

		}
//		try {
//			commentDAO.deleteComment(id,userInfo.getMemberId());
//			System.out.println("ok");
//		} catch (Exception e) {
//			System.out.println("fail");
//		}
		
		
		System.out.println(userInfo);		
		if (userInfo.getAccount() ==null) {
			return "redirect:/MemberCentreLogin";
		}else {
			List<CommentRecordInfo> FindCommentRecord = commentDAO.FindCommentRecordInfo(userInfo.getMemberId());
			System.out.println("FindCommentRecord  OK");
			model.addAttribute("CommentRecordInfos", FindCommentRecord);

			return "Member";
		}
		
    }
	
	@RequestMapping(value = "/MemberCentreLogin", method = RequestMethod.GET)
	public String viewmemberCentre_login(Model model, @ModelAttribute("MemberLoginForm") MemberLoginForm MemberLogin) {

		return "MemberCentreLogin";
	}

	@RequestMapping(value = "/MemberCentreLogin", method = RequestMethod.POST)
	public String processAddMember(Model model, @ModelAttribute("MemberLoginForm") MemberLoginForm MemberLogin,
			RedirectAttributes redirectAttributes) {
		
		String NewMemberAccount = MemberLogin.getNewmemberAccount();
		String NewMemberPassword = MemberLogin.getNewmemberPassword();

		System.out.println(NewMemberAccount + ":     controllerLogin-----------");
		try {
			memberLoginDAO.login(NewMemberAccount, NewMemberPassword);
			
		} catch (memberLoginException e) {
			model.addAttribute("errorMessage", "錯誤訊息: " + e.getMessage());
			return "MemberCentreLogin";
		}
		redirectAttributes.addFlashAttribute("getUser", NewMemberAccount);
		redirectAttributes.addFlashAttribute("MemberInfos", memberLoginDAO.FindMember(NewMemberAccount));
		
		return "redirect:/Member";
	}

	@RequestMapping(value = "/MemberCentreRegist", method = RequestMethod.GET)
	public String viewMemberCentreRegist(Model model, @ModelAttribute("addMemberForm") AddMemberForm addMemberForm) {
		
		return "MemberCentreRegist";
	}

//  處理表單送來的資料
	@RequestMapping(value ="/MemberCentreRegist", method = RequestMethod.POST)
	public String processAddMember(Model model, @ModelAttribute("addMemberForm") AddMemberForm addMemberForm) {

//      註冊    AddMember取得addMemberForm快取裡的資料 並ADD到資料庫
		 memberDAO.AddMember(addMemberForm.getNewmemberAccount(),addMemberForm.getNewmemberName(), addMemberForm.getNewmemberPassword(),addMemberForm.getNewmemberPhone(), addMemberForm.getNewmemberEmail());
		return "redirect:/MemberCentreLogin";
	}
	

}