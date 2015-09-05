package org.techmentro.spring.web.mvc.controller;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.techmentro.spring.web.mvc.dao.UserDao;
import org.techmentro.spring.web.mvc.model.User;

@Controller
public class SignInController {
	@Autowired
	UserDao dao;
	public SignInController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/login.ab_spr",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String mailId,@RequestParam String password){
		ModelAndView mav = new ModelAndView();
		try{
			User user = dao.login(mailId, password);
			if(user!=null){
				mav.setViewName("profile");
				mav.addObject("user",user);
			}
			else{
				mav.setViewName("invalidLogin");
				mav.addObject("msg", "Invalid Username and Password");
			}
			//Exception Tester throw new Exception("Controlled: Exception Tester");
		}
		catch(Exception ex){
			mav.setViewName("error");
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			// stack trace as a string sw.toString();
			mav.addObject("errorMessage",sw.toString());
			ex.printStackTrace();
		}
		return mav;
	}
}
