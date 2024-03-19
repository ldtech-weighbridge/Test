package com.ld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/get")
	public String getPage() {
		return "index";
		
	}
	
	@GetMapping("/getAdmin")
	public String getAdmin() {
		return "admin-page";
		
	}
	
	@GetMapping("/addUser")
	public String addUser() {
		return "add_user_dashboard";
		
	}
}
