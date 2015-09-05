package org.techmentro.training.struts2x.action;

public class DivideAction {
	int num1;
	int num2;
	int result;
	/**
	 * 
	 */
	public DivideAction() {
		super();
	}
	public String execute() throws ArithmeticException{
		result = num1/num2;
		return "success";
	}
	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
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
}
