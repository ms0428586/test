package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PathController {
	@ModelAttribute
	public void xxxx(Model model) {
		model.addAttribute("demoData", "");
	}
	@GetMapping({"/", "/Webplatform_frontpage.page"})
	public String method1() {
		
		return "/Webplatform_frontpage";
	}
	@GetMapping("memberCentre_login.page")
	public String method2() {
		return "/memberCentre_login";
	}
	@GetMapping("/pages/product.page")
	public String method3() {
		return "/pages/product";
	}
	@GetMapping("/pages/display.page")
	public String method4() {
		return "/pages/display";
	}
	@GetMapping("/secure/change_passwd.page")
	public String method5() {		
		return "/secure/change_passwd";
	}
	@GetMapping("/customer_order.page")
	public String method6() {		
		return "/customer_order";
		}
	@GetMapping("/secure/customer_regist.page")
	public String method7() {		
		return "/secure/customer_regist";
		}
	
}
