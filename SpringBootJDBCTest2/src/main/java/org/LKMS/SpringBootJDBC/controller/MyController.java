package org.LKMS.SpringBootJDBC.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.LKMS.SpringBootJDBC.Exception.memberLoginException;
import org.LKMS.SpringBootJDBC.dao.MemberDAO;
import org.LKMS.SpringBootJDBC.dao.MemberLoginDAO;
import org.LKMS.SpringBootJDBC.dao.MenuDAO;
import org.LKMS.SpringBootJDBC.dao.SelectMemberDAO;
import org.LKMS.SpringBootJDBC.dao.UpdatePswDAO;
import org.LKMS.SpringBootJDBC.dao.updateMemberInfoDAO;
import org.LKMS.SpringBootJDBC.dao.updatemenuDAO;
import org.LKMS.SpringBootJDBC.form.AddMemberForm;
import org.LKMS.SpringBootJDBC.form.AddMenuForm;
import org.LKMS.SpringBootJDBC.form.MemberLogin;
import org.LKMS.SpringBootJDBC.form.SelectMemberInfo;
import org.LKMS.SpringBootJDBC.form.updateMemberInfo;
import org.LKMS.SpringBootJDBC.form.updateMenuForm;
import org.LKMS.SpringBootJDBC.form.updatePsw;
import org.LKMS.SpringBootJDBC.mapper.MemberLoginMapper;
import org.LKMS.SpringBootJDBC.model.MenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.thymeleaf.standard.expression.Each;
@EntityScan(basePackages={"org.LKMS.SpringBootJDBC.dao"})
@Controller
public class MyController {
	@Autowired
	private MenuDAO menuDAO;
	@Autowired
    private MemberDAO memberDAO;  
	@Autowired
	private updatemenuDAO updatemenuDAO;
	@Autowired
	private SelectMemberDAO selectMemberDAO;
	@Autowired
	private updateMemberInfoDAO  updateMemberInfoDAO;
	@Autowired
	private UpdatePswDAO updatePswDAO;
	@Autowired
	private MemberLoginDAO memberLoginDAO;
	
//	取得資料庫資料渲染在頁面
	@RequestMapping(value = "/menutest", method = RequestMethod.GET)
	public String showBankAccounts(Model model, @ModelAttribute("updateMenuForm") updateMenuForm updateMenuForm) {

		List<MenuInfo> list = menuDAO.getMenu();
		model.addAttribute("menuInfos", list);

		return "menutest";
	}
	//新增商品頁面 預設值
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
//  處理表單送來的資料
    @RequestMapping(value = "/menutest/updateFrom", method = RequestMethod.POST)
    public String processupdateMenu(Model model, @ModelAttribute("updateMenuForm") updateMenuForm updateMenuForm) {
        
        Long NewId = updateMenuForm.getNewid();
        String NewProductCode = updateMenuForm.getNewproductCode();
        String NewProductName = updateMenuForm.getNewproductName();
        String NewProductSize = updateMenuForm.getNewproductSize();
        Double NewProductPrice = updateMenuForm.getNewproductPrice();
        String NewProductDescription = updateMenuForm.getNewproductDescription();
        
 
        System.out.println(NewId + "processAddMenu-----------");
//      新增商品    AddMember取得addMemberForm快取裡的資料 並ADD到資料庫
        updatemenuDAO.updateMenu(NewId, NewProductCode, NewProductName, NewProductSize, NewProductPrice, NewProductDescription
                );

        return "redirect:/menutest";
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

	// 取得資料庫資料渲染在頁面
    @RequestMapping(value = "/member", method = RequestMethod.GET)
    public String showMemberInfo(Model model, @ModelAttribute("updateMemberInfo") updateMemberInfo updateMemberInfo,@ModelAttribute("updatePsw") updatePsw updatePsw) {

        List<SelectMemberInfo> list = selectMemberDAO.getMemberInfo();
        model.addAttribute("SelectMemberInfo", list);

        return "member";
    }
//    @RequestMapping(value = "/member/updateMember", method = RequestMethod.GET)
//    public String showupdateMember(Model model, @ModelAttribute("updateMemberInfo") updateMemberInfo updateMemberInfo) {
//
//        return "member";
//    }
//    @RequestMapping(value = "/member/updateMember", method = RequestMethod.GET)
//    public String viewupdateMember(Model model) {
//
////      新增商品    AddMenuForm取得頁面表單資料放入快取 也可給預設值 
//        updateMemberInfo menuform = new updateMemberInfo("004", "純喫茶", "小");
//        model.addAttribute("updateMemberInfo", menuform);
//
//        return "member";
//    }
//  處理表單送來的資料
    @RequestMapping(value = "/member/updateMember", method = RequestMethod.POST)
    public String processupdateMember(Model model, @ModelAttribute("updateMemberInfo") updateMemberInfo updateMemberInfo) {
        
        updateMemberInfo menuform = new updateMemberInfo("004", "純喫茶", "小");
        model.addAttribute("updateMemberInfo", menuform);
 
        String UpdateMemberName = updateMemberInfo.getUpdatememberName();
        String UpdateMemberEmail = updateMemberInfo.getUpdatememberEmail();
        String UpdateMemberPhone = updateMemberInfo.getUpdatememberPhone();
 
        System.out.println(updateMemberInfo + "processAddMenu-----------");
//      新增商品    AddMember取得addMemberForm快取裡的資料 並ADD到資料庫
        updateMemberInfoDAO.updateMember( UpdateMemberName,UpdateMemberEmail, UpdateMemberPhone );

        return "redirect:/member";
    }
    @RequestMapping(value = "/member/updatePsw", method = RequestMethod.POST)
    public String processupdatePsw(Model model, @ModelAttribute("updatePsw") updatePsw updatePsw) {
        
        String UpdatePsw = updatePsw.getUpdatePsw();
 
        System.out.println(updatePsw + "processAddMenu-----------");
//      新增商品    AddMember取得addMemberForm快取裡的資料 並ADD到資料庫
        updatePswDAO.updatePsw( UpdatePsw );

        return "redirect:/member";
    }

	@RequestMapping(value ="/memberCentre_login", method = RequestMethod.GET)
	public String viewmemberCentre_login(Model model,@ModelAttribute("MemberLogin") MemberLogin MemberLogin) {

		return "memberCentre_login";
	}

	@RequestMapping(value ="/memberCentre_login/login", method = RequestMethod.POST)
    public String processAddMember(Model model,@ModelAttribute("MemberLogin") MemberLogin MemberLogin)throws memberLoginException {
        
        String NewMemberAccount = MemberLogin.getNewmemberAccount();
        String NewMemberPassword = MemberLogin. getNewmemberPassword();
 
        System.out.println(NewMemberAccount   + ":     controllerLogin-----------");
        //加入DAO的account跟password再去做判斷
//      新增商品    AddMember取得addMemberForm快取裡的資料 並ADD到資料庫
        List<MemberLogin>  getLogin = memberLoginDAO. findPassword(NewMemberAccount);
        model.addAttribute("MemberLogin", getLogin);
        String loginpassword="";
        for(MemberLogin getpassword : getLogin) {
               loginpassword = getpassword.getNewmemberPassword();
        }   
        System.out.println(loginpassword);
        
        String gg= MemberLogin.newmemberPassword;
        System.out.println(gg);
        
        String str = "";
        if(NewMemberAccount!=null) {
            if (getLogin !=null){
              if(loginpassword==gg) {
                  str = "redirect:/member";
              }else {
                  str = "redirect:/memberCentre_login";
              }

            }else {
                str = "redirect:/memberCentre_login";
            }
        }else {
            str = "redirect:/memberCentre_login";
        }
        return str;
	    }

	@RequestMapping(value = "/memberCentre_regist")
    public String viewmemberCentre_regist(Model model) {
	    
        return "memberCentre_regist";
    }
	 @RequestMapping(value = "/memberCentre_regist", method = RequestMethod.GET)
  public String viewmemberForm(Model model,@ModelAttribute("addMemberForm") AddMemberForm addMemberForm ) {

//        新增商品    AddMenuForm取得頁面表單資料放入快取 也可給預設
      return "memberCentre_regist";
	 }
//  處理表單送來的資料
    @RequestMapping(value = "/memberCentre_regist", method = RequestMethod.POST)
    public String processAddMember(Model model, @ModelAttribute("addMemberForm") AddMemberForm addMemberForm) {
        
        String NewMemberName = addMemberForm.getNewmemberName();
        String NewMemberPassword = addMemberForm. getNewmemberPassword();
        String NewMemberEmail = addMemberForm.getNewmemberEmail();
        String NewMemberPhone = addMemberForm.getNewmemberPhone();
 
        System.out.println(NewMemberName + "processAddMenu-----------");
//      新增商品    AddMember取得addMemberForm快取裡的資料 並ADD到資料庫
        memberDAO.AddMember(NewMemberName, NewMemberPassword,NewMemberPhone, NewMemberEmail);

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