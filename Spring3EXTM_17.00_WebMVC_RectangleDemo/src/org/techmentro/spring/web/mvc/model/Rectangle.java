package org.techmentro.spring.web.mvc.model;

public class Rectangle {
	int length;
	int breadth;
	/**
	 * 
	 * @return
	 */
	public int area(){
		return length*breadth;
	}
	/**
	 * @param length
	 * @param breadth
	 */
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the breadth
	 */
	public int getBreadth() {
		return breadth;
	}
	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

}
