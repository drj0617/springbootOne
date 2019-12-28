package com.dang.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowController {

	@RequestMapping(path = {"/","/index"})
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}

}