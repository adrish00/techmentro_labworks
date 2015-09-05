package org.techmentro.spring.web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.techmentro.spring.web.mvc.dao.UserDao;
import org.techmentro.spring.web.mvc.model.User;

@Controller
public class SignupController {
	@Autowired
	UserDao dao;
	public SignupController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/register.ab_spr",method=RequestMethod.POST)
	public String register(@ModelAttribute User user){
		String msg = "notRegistered";
		try{
			int i = dao.save(user);
			if(i>0){
				msg = "registered";
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return msg;
	}
}
