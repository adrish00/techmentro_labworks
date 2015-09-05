package org.techmentro.spring.web.mvc.action;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.techmentro.spring.web.mvc.model.Rectangle;

@Controller
public class RectangleAction {

	public RectangleAction() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value="/ceateRect.spring",method=RequestMethod.POST)
	public String create(@ModelAttribute Rectangle rect,HttpSession session){
		session.setAttribute("rect", rect);
		return "home";
	}
}
