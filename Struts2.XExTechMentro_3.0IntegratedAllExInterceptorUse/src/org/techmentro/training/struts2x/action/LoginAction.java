package org.techmentro.training.struts2x.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.techmentro.training.struts2x.dao.UserDao;
import org.techmentro.training.struts2x.model.User;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements SessionAware{

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	private User user;
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if(user.getMailId().length()==0){
			//addFieldError("user.mailId", "mailId can't be empty");
			addFieldError("user.mailId", getText("user.mailId.required"));
		}
		if(user.getPassword().length()==0){
			//addFieldError("user.password", "password can't be empty");
			addFieldError("user.password", getText("user.password.required"));
		}
	}
	private Map<String,User> map;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setSession(Map m) {
		map = m ;
	}
	
	public String execute() throws Exception{
		UserDao dao = new UserDao();
		if(dao.find(user)){
			map.put("user", user);
			return "success";
		}
		else{
			return "failure";
		}
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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

}
