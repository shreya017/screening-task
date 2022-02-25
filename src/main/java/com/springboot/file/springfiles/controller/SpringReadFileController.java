package com.springboot.file.springfiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.springboot.file.springfiles.model.User;
import com.springboot.file.springfiles.service.SpringReadFileService;

@Controller
public class SpringReadFileController {
	
	@Autowired private SpringReadFileService springReadFileService;
    
	public String home(Model model) {
		model.addAttribute("user",new User());
		List<User> users = springReadFileService.findAll();
		model.addAttribute("users", users);
		return "view/users";
	}
}
