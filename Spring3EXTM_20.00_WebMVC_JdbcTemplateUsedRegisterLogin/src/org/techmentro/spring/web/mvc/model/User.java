package org.techmentro.spring.web.mvc.model;

public class User {
	int id;
	String name;
	String mailId;
	String password;
	/**
	 * @param name
	 * @param mailId
	 * @param password
	 */
	public User(String name, String mailId, String password) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.password = password;
	}
	/**
	 * @param id
	 * @param name
	 * @param mailId
	 * @param password
	 */
	public User(int id, String name, String mailId, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.password = password;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the mailId
	 */
	public String getMailId() {
		return mailId;
	}
	/**
	 * @param mailId the mailId to set
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}

}
