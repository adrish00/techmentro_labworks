package org.techmentro.spring.web.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DemoInterceptor implements HandlerInterceptor{

	public DemoInterceptor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handlerChain, Exception ex)
			throws Exception {
		System.out.println("afterCompletion() of DemoInterceptor is invoked");
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object hc, ModelAndView mav) throws Exception {
		System.out.println("postHandle() of DemoInterceptor is invoked");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object hc) throws Exception {
		System.out.println("preHandle() of DemoInterceptor is invoked");
		return true;
	}

}
