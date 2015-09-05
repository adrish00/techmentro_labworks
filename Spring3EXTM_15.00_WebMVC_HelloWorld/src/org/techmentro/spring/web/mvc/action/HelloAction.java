package org.techmentro.spring.web.mvc.action;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloAction {

	public HelloAction() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/hello.spring",method=RequestMethod.POST)
	public ModelAndView execute(ServletRequest request){
		ModelAndView mav = new ModelAndView();
		String user = request.getParameter("name");
		mav.setViewName("home");
		mav.addObject("message","Hello "+user+"<br> Welcome to World of Spring Frammework.");
		return mav;
	}
}
