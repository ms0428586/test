package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.UserBean;
import service.UserRepositortyService;

@Controller
public class UserController {
	@Autowired
	private UserRepositortyService UserService;
	
	@RequestMapping(
			path = {"/login.controller"}
			)
	public String handleMethod(Model model,
			String account, String passwd, HttpSession session) {
//接收資料
//驗證資料
		System.out.println("urlcontroller");
		Map<String, String> errors = new HashMap<String, String>();
		model.addAttribute("errors", errors);
		
		if(account==null || account.length()==0) {
			errors.put("useraccount", "");
		}
		if(passwd==null || passwd.length()==0) {
			errors.put("userpasswd", "");
		}
		
		if(errors!=null && !errors.isEmpty()) {
			return "/memberCentre_login";
		}
		
		
		
//呼叫model
		UserBean bean = UserService.login(account,passwd);
		
//根據model執行結果，導向view
		if(bean==null) {
			errors.put("passwd", "");
			return "/memberCentre_login";
		} else {
			session.setAttribute("user", bean);
			return "/Webplatform_frontpage";
		}
	}
}
