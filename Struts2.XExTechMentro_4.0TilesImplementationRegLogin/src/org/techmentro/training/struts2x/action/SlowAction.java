package org.techmentro.training.struts2x.action;

public class SlowAction {
	String message;
	public String execute () throws Exception{
		//System.out.println("before");
		Thread.sleep(5000);
		//System.out.println("after");
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

	/**
	 * 
	 */
	public SlowAction() {
		super();
	}
}
