package com.zootreekey.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thymeleafController {
        
 
        @GetMapping("/zootreekey")
       public String webplatformFrontpage() {
           return "webplatformFrontpage";
       }
        
        @GetMapping("/webplatformFrontpage.html")
        public String webplatformFrontpage1() {
            return "webplatformFrontpage";
        }
}
