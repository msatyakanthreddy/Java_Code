package com.satyakanth.lc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControler {
	@RequestMapping("/test")
   public String sayHello()
   {
	   return "myHome";
   }
}
