package org.techmentro.training.struts2x.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.techmentro.training.struts2x.dao.UserDao;
import org.techmentro.training.struts2x.model.User;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport implements SessionAware{
	private User user;
	private Map<String,User> map;
	
	public String execute () throws Exception{
		UserDao dao = new UserDao();
		dao.save(user);
		map.put("user", user);
		return "success";
	}
	/**
	 * @return the map
	 */
	public Map<String, User> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, User> map) {
		this.map = map;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setSession(Map m) {
		map = m;	
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
}
