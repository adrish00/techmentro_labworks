package org.techmentro.spring.web.mvc.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloAction {

	public HelloAction() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/hello.spring",method=RequestMethod.POST)
	public ModelAndView execute(@RequestParam String name){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		mav.addObject("message","Hello "+name+"<br> Welcome to World of Spring Frammework.");
		return mav;
	}
}
