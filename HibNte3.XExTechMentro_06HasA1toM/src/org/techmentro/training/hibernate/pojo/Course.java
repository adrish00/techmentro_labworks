/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

import java.util.List;
/**
 * @author Adrish
 *
 */
public class Course {

	/**
	 * 
	 */
	int id;
	String name;
	int fee;
	List<String> topics;
	/**
	 * @param name
	 * @param fee
	 * @param topics
	 */
	public Course(String name, int fee, List<String> topics) {
		super();
		this.name = name;
		this.fee = fee;
		this.topics = topics;
	}
	
	public Course() {
		// TODO Auto-generated constructor stub
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
	 * @return the fee
	 */
	public int getFee() {
		return fee;
	}
	/**
	 * @param fee the fee to set
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}
	/**
	 * @return the topics
	 */
	public List<String> getTopics() {
		return topics;
	}
	/**
	 * @param topics the topics to set
	 */
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

}
