package com.dang.springboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dang.springboot.pojo.StaffInfo;
import com.dang.springboot.service.StaffService;

@Controller
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	@RequestMapping("/login")
	public String login(String userId, String passWord,HttpSession session) {
		StaffInfo sf = staffService.selectByIdAndPwd(userId,passWord);
		session.setAttribute("staffInfo", sf);
		return "redirect:/index";
	}
	
	
}
