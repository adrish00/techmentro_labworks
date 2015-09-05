package org.techmentro.training.struts2x.action;
import java.util.Set;

import org.techmentro.training.struts2x.dao.UserDao;
import org.techmentro.training.struts2x.model.User;

public class UserAction {
	private Set<User> users;
	
	public String execute() throws Exception{
		UserDao dao = new UserDao();
		users = dao.getAllUsers();
		return "success";
	}
	
	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
}
