package org.techmentro.training.struts2x.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class LogoutAction implements SessionAware {

	SessionMap map;
	public void setSession(@SuppressWarnings("rawtypes") Map m) {
		map = (SessionMap)m;
	}
	public String execute() throws Exception{
		map.invalidate();
		return "success";
	}
}
