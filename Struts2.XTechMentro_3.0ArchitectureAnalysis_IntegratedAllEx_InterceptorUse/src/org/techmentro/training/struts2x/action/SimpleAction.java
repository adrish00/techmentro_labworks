/**
 * 
 */
package org.techmentro.training.struts2x.action;

/**
 * @author Adrish
 *
 */
public class SimpleAction {
	private String message;
	private String status = "Action is not invoked";
	
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	public String execute(){
		status = "Action is invoked ";
		return "success";
	}
	
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}


	public SimpleAction() {
		// TODO Auto-generated constructor stub
	}

}
