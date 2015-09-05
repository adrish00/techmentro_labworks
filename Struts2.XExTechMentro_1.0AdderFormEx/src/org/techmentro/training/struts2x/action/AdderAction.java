/**
 * 
 */
package org.techmentro.training.struts2x.action;

/**
 * @author Adrish
 *
 */
public class AdderAction {
	private int number_1;
	private int number_2;
	private int result;
	
	
	public String execute(){
		String sResult = "success";
		result = number_1 + number_2;
		return sResult;
	}
	/**
	 * @return the number_1
	 */
	public int getNumber_1() {
		return number_1;
	}
	/**
	 * @param number_1 the number_1 to set
	 */
	public void setNumber_1(int number_1) {
		this.number_1 = number_1;
	}
	/**
	 * @return the number_2
	 */
	public int getNumber_2() {
		return number_2;
	}
	/**
	 * @param number_2 the number_2 to set
	 */
	public void setNumber_2(int number_2) {
		this.number_2 = number_2;
	}
	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(int result) {
		this.result = result;
	}
	/**
	 * 
	 */
	public AdderAction() {
		// TODO Auto-generated constructor stub
	}

}
