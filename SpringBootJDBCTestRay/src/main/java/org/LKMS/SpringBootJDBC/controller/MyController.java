package org.LKMS.SpringBootJDBC.controller;

import java.util.List;

import org.LKMS.SpringBootJDBC.dao.MemberDAO;
import org.LKMS.SpringBootJDBC.dao.MenuDAO;
import org.LKMS.SpringBootJDBC.exception.BankTransactionException;
import org.LKMS.SpringBootJDBC.form.AddMemberForm;
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
	
	@Autowired
    private MemberDAO memberDAO;
	
//	取得資料庫資料渲染在頁面
	@RequestMapping(value = "/menutest", method = RequestMethod.GET)
	public String showBankAccounts(Model model) {

		List<MenuInfo> list = menuDAO.getMenu();
		model.addAttribute("menuInfos", list);

		return "menutest";
	}
//	新增商品頁面 預設值
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String viewtest1(Model model) {

//		新增商品    AddMenuForm取得頁面表單資料放入快取 也可給預設值 
		AddMenuForm menuform = new AddMenuForm(4L, "004", "純喫茶", "小", 20d, "飲料", "無糖綠茶");
		model.addAttribute("addMenuForm", menuform);

		return "test1";
	}
//	處理表單送來的資料
	@RequestMapping(value = "/test1", method = RequestMethod.POST)
	public String processAddMenu(Model model, @ModelAttribute("addMenuForm") AddMenuForm addMenuForm) {
		Long NewId = addMenuForm.getNewid();
		String NewProductCode = addMenuForm.getNewproductCode();
		String NewProductName = addMenuForm.getNewproductName();
		String NewProductSize = addMenuForm.getNewproductSize();
		Double NewProductPrice = addMenuForm.getNewproductPrice();
		String NewProductDescription = addMenuForm.getNewproductDescription();
		String NewProductCategory = addMenuForm.getNewproductCategory();
		System.out.println(NewId + "processAddMenu-----------");
//		新增商品    AddMenu取得addMenuForm快取裡的資料 並ADD到資料庫
		menuDAO.AddMenu(NewId, NewProductCode, NewProductName, NewProductSize, NewProductPrice, NewProductDescription,
				NewProductCategory);
		return "redirect:/menutest";  //送出後頁面挑轉到哪裡
	}
	
////	以下是我用我們的網頁測試 還沒成功 可以參考
////	取得資料庫資料渲染在頁面
//	@RequestMapping(value = "/store__management", method = RequestMethod.GET)
//	public String viewStoreManagement(Model model) {
//
////		MENU
//		List<MenuInfo> list = menuDAO.getMenu();
//		model.addAttribute("menuInfos", list);
////		新增商品    AddMenuForm取得頁面資料ADD到資料庫 也可給預設值 
//		AddMenuForm menuform = new AddMenuForm(1L, "004", "純喫茶", "小", 20d, "飲料", "無糖綠茶");
//		model.addAttribute("addMenuForm", menuform);
//
//		return "store__management";
//	}
////	處理送來的表單資料
//	@RequestMapping(value = "/store__management", method = RequestMethod.POST)
//	public String AddMenu(Model model, @ModelAttribute("addMenuForm") AddMenuForm addMenuForm) {
//
//		Long NewId = addMenuForm.getNewid();
//		String NewProductCode = addMenuForm.getNewproductCode();
//		String NewProductName = addMenuForm.getNewproductName();
//		String NewProductSize = addMenuForm.getNewproductSize();
//		Double NewProductPrice = addMenuForm.getNewproductPrice();
//		String NewProductDescription = addMenuForm.getNewproductDescription();
//		String NewProductCategory = addMenuForm.getNewproductCategory();
//		System.out.println(NewId + "AddMenu-----------");
//
//		menuDAO.AddMenu(NewId, NewProductCode, NewProductName, NewProductSize, NewProductPrice, NewProductDescription,
//				NewProductCategory);
//
//		return "redirect:/store__management";
//	}
	
//	以下是我們的網頁連結
	// frontpage--mytask--webplatform---------------------------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(value = "/webplatform_frontpage", method = RequestMethod.GET)
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
//  處理表單送來的資料
    @RequestMapping(value = "/memberCentre_regist", method = RequestMethod.POST)
    public String processAddMember(Model model, @ModelAttribute("addMemberForm") AddMemberForm addMemberForm) {
        
        String NewMemberName = addMemberForm.getNewmemberName();
        String NewMemberPassword = addMemberForm. getNewmemberPassword();
        String NewMemberEmail = addMemberForm.getNewmemberEmail();
 
        System.out.println(NewMemberName + "processAddMenu-----------");
//      新增商品    AddMember取得addMemberForm快取裡的資料 並ADD到資料庫
        memberDAO.AddMember(NewMemberName, NewMemberPassword, NewMemberEmail);

		return "redirect:/memberCentre_login";
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