package org.LKMS.SpringBootJDBC.controller;

import java.util.List;

import javax.print.DocFlavor.STRING;

import org.LKMS.SpringBootJDBC.dao.MenuDAO;
import org.LKMS.SpringBootJDBC.exception.BankTransactionException;
import org.LKMS.SpringBootJDBC.form.AddMenuForm;

import org.LKMS.SpringBootJDBC.model.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.standard.expression.Each;

@Controller
public class MyController {
	@Autowired
	private MenuDAO menuDAO;

//	取得資料庫資料渲染在頁面
	@RequestMapping(value = "/store__management", method = RequestMethod.GET)
	public String viewStoreManagement(Model model) {
//		MENU
		List<MenuInfo> list = menuDAO.getMenu();
		model.addAttribute("menuInfos", list);
//		新增商品    AddMenuForm取得頁面資料ADD到資料庫 也可給預設值 
		AddMenuForm menuform = new AddMenuForm("001", "純喫茶", "小", " ", " ", "無糖綠茶");
		model.addAttribute("addMenuForm", menuform);

		return "store__management";
	}
//	處理送來的表單資料
	@RequestMapping(value = "/store__management", method = RequestMethod.POST)
	public String AddMenu(Model model, @ModelAttribute("addMenuForm") AddMenuForm addMenuForm) {
		String NewId = addMenuForm.getNewid();
		String NewShop = addMenuForm.getNewshop();
		String NewMeals = addMenuForm.getNewmeals();
		String NewScore = addMenuForm.getNewscore();
		String NewTask = addMenuForm.getNewtask();
		String NewDate = addMenuForm.getNewdate();
		System.out.println(NewId + "AddMenu-----------");

		menuDAO.AddMenu(NewId, NewShop, NewMeals, NewScore,
				NewTask, NewDate);

		return "redirect:/store__management";
	}
	
//	TEST測試頁面
//取得資料庫資料渲染在頁面
@RequestMapping(value = "/menutest", method = RequestMethod.GET)
public String showBankAccounts(Model model) {

	List<MenuInfo> list = menuDAO.getMenu();
	model.addAttribute("menuInfos", list);

	return "menutest";
}
//新增商品頁面 預設值
@RequestMapping(value = "/test1", method = RequestMethod.GET)
public String viewtest1(Model model) {

//	新增商品    AddMenuForm取得頁面表單資料放入快取 也可給預設值 
	AddMenuForm menuform = new AddMenuForm("001", "純喫茶", "小", " ", "飲料", "無糖綠茶");
	model.addAttribute("addMenuForm", menuform);

	return "test1";
}
//處理表單送來的資料
@RequestMapping(value = "/test1", method = RequestMethod.POST)
public String processAddMenu(Model model, @ModelAttribute("addMenuForm") AddMenuForm addMenuForm) {
	String NewId = addMenuForm.getNewid();
	String NewShop = addMenuForm.getNewshop();
	String NewMeals = addMenuForm.getNewmeals();
	String NewScore = addMenuForm.getNewscore();
	String NewTask = addMenuForm.getNewtask();
	String NewDate = addMenuForm.getNewdate();
	System.out.println(NewId + "processAddMenu-----------");
//	新增商品    AddMenu取得addMenuForm快取裡的資料 並ADD到資料庫
	menuDAO.AddMenu(NewId, NewShop, NewMeals, NewScore, NewTask,
			NewDate);
	return "redirect:/menutest";  //送出後頁面挑轉到哪裡
}

	
//	以下是我們的網頁連結
	// frontpage--mytask--webplatform---------------------------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showfrontpage(Model model) {
        return "webplatform_frontpage";
    }
    
	@RequestMapping(value = "/mytask", method = RequestMethod.GET)
	public String viewmytask(Model model) {
		return "mytask";
	}

	@RequestMapping(value = "/webplatform_choose__store", method = RequestMethod.GET)
	public String viewwebplatform_choose__store(Model model) {
		return "webplatform_choose__store";
	}

	@RequestMapping(value = "/webplatform_choose__food", method = RequestMethod.GET)
	public String viewwebplatform_choose__food(Model model) {

		return "webplatform_choose__food";
	}

	@RequestMapping(value = "/call_center", method = RequestMethod.GET)
	public String viewcall_center(Model model) {

		return "call_center";
	}
//   member-------------------------------------------------------------------------------------------------------------------------------------------------------

	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String viewmember(Model model) {

		return "member";
	}

	@RequestMapping(value = "/memberCentre_login", method = RequestMethod.GET)
	public String viewmemberCentre_login(Model model) {

		return "memberCentre_login";
	}

	@RequestMapping(value = "/memberCentre_regist", method = RequestMethod.GET)
	public String viewmemberCentre_regist(Model model) {

		return "memberCentre_regist";
	}

//    store-------------------------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value = "/store_login", method = RequestMethod.GET)
	public String viewstore_login(Model model) {

		return "store_login";
	}

	@RequestMapping(value = "/store_regist", method = RequestMethod.GET)
	public String viewstore_regist(Model model) {

		return "store_regist";
	}

//    cart-------------------------------------------------------------------------------------------------------------------------------------------------------
	@RequestMapping(value = "/shopping_car", method = RequestMethod.GET)
	public String viewshopping_car(Model model) {

		return "shopping_car";
	}

//    ------------------------------------------------------------------------------------------------------------------------------------------------
//    @RequestMapping(value = "/aaa", method = RequestMethod.GET)
//    public String showMenuCategoryt(Model model) {
//        List<MenuCategoryInfo> list = menuCategorytDAO.getMenuCategory();
//       
//        model.addAttribute("categoryInfos", list);
//       
//
//        return "accountsPage2";
//    }

}