/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

/**
 * @author Student
 *
 */
public class Student extends Person{
	String course;
	int fee;
	public Student(String name,String course, int fee) {
		super(name);
		this.course = course;
		this.fee = fee;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	/**
	 * 
	 */
	public Student() {
		super();
	}

}
