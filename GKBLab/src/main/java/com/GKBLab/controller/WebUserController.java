package com.GKBLab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.GKBLab.dto.WebUser;
import com.GKBLab.service.WebUserService;

@Controller
public class WebUserController {

	@Autowired
	WebUserService service;

	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute WebUser user) {
		service.save(user);
		ModelAndView andView = new ModelAndView();
		andView.setViewName("WebForm.jsp");
		andView.addObject("message","Data Saved Successfully");

		return andView;
	}

	@RequestMapping("/getAll")
	public ModelAndView getAll() {
		List<WebUser> list = service.getAll();
		ModelAndView andView = new ModelAndView();
		
		if(list.size()>0) {
			andView.addObject("list",list);
			andView.setViewName("getAll.jsp");
			
		}
		return andView;

	}

}
