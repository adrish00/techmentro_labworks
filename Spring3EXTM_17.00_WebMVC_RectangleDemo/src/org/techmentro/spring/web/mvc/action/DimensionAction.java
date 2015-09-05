package org.techmentro.spring.web.mvc.action;


import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.techmentro.spring.web.mvc.model.Rectangle;

@Controller
public class DimensionAction {
	@Autowired
	HttpSession session;
	public DimensionAction() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/view.spring",method=RequestMethod.GET)
	public ModelAndView display(){
		Rectangle rect = (Rectangle)session.getAttribute("rect");
		ModelAndView mav = new ModelAndView("display");
		mav.addObject("rect",rect);
		return mav;
	}
	@RequestMapping(value="/area.spring",method=RequestMethod.GET)
	public ModelAndView area(){
		Rectangle rect = (Rectangle)session.getAttribute("rect");
		ModelAndView mav = new ModelAndView("area");
		mav.addObject("area",rect.area());
		return mav;
	}
	@RequestMapping (value="/exit.spring",method=RequestMethod.GET)
	public void exit(ServletResponse response){
		session.invalidate();
		response.setContentType("text/html");
		try{
			PrintWriter out = response.getWriter();
			out.println("Thank you for using Spring Rectanle App.");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
