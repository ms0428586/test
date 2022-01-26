package org.LKMS.SpringBootJDBC.controller;
import java.util.List;

import org.LKMS.SpringBootJDBC.dao.BankAccountDAO;
import org.LKMS.SpringBootJDBC.dao.MenuCategorytDAO;
import org.LKMS.SpringBootJDBC.exception.BankTransactionException;
import org.LKMS.SpringBootJDBC.form.SendMoneyForm;
import org.LKMS.SpringBootJDBC.form.UpdateCategoryForm;
import org.LKMS.SpringBootJDBC.model.BankAccountInfo;
import org.LKMS.SpringBootJDBC.model.MenuCategoryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

    @Autowired
    private MenuCategorytDAO menuCategorytDAO;
    
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String showBankAccounts(Model model) {
//        List<MenuCategoryInfo> list = menuCategorytDAO.getMenuCategory();
//       
//        model.addAttribute("categoryInfos", list);
//
//        return "accountsPage";
//    }

    @RequestMapping(value = "/sendMoney", method = RequestMethod.GET)
    public String viewSendMoneyPage(Model model) {

        UpdateCategoryForm form = new UpdateCategoryForm(1L, "sss", "ccc");

        model.addAttribute("sendMoneyForm", form);

        return "sendMoneyPage";
    }
    @RequestMapping(value = "/sendMoney", method = RequestMethod.POST)
    public String processSendMoney(Model model, SendMoneyForm sendMoneyForm) {

        System.out.println("Send Money::" + sendMoneyForm.getAmount());

//        try {
//        	categorytDAO.sendMoney(sendMoneyForm.getFromAccountId(), //
//                    sendMoneyForm.getToAccountId(), //
//                    sendMoneyForm.getAmount());
//        } catch (BankTransactionException e) {
//            model.addAttribute("errorMessage", "Error: " + e.getMessage());
//            return "/sendMoneyPage";
//        }
        return "redirect:/";
    }
    
//    @RequestMapping(value = "/store__management", method = RequestMethod.POST)
//    public String processAddProduct(Model model, categoryForm categoryForm) {
//
//        System.out.println("CategoryName::" + categoryForm.getAmount());
//        try {
//        	categorytDAO.sendMoney(categoryForm.getFromAccountId(), //
//            		categoryForm.getToAccountId(), //
//            		categoryForm.getAmount());
//        } catch (BankTransactionException e) {
//            model.addAttribute("errorMessage", "Error: " + e.getMessage());
//            return "/sendMoneyPage";
//        }
//        return "redirect:/store__management";
//    }
    
    
    //frontpage--mytask--webplatform---------------------------------------------------------------------------------------------------------------------------------------------------
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
    
    @RequestMapping(value = "/store__management", method = RequestMethod.GET)
    public String viewstore__management(Model model) {


        return "store__management";
    }
    
//    cart-------------------------------------------------------------------------------------------------------------------------------------------------------
    @RequestMapping(value = "/shopping_car", method = RequestMethod.GET)
    public String viewshopping_car(Model model) {


        return "shopping_car";
    }


}