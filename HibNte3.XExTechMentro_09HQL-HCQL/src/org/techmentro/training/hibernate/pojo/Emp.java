/**
 * 
 */
package org.techmentro.training.hibernate.pojo;
import java.io.Serializable;
import java.util.*;
/**
 * @author Adrish
 *
 */
public class Emp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -525544630545054701L;
	/**
	 * 
	 */
	int id;
	String name;
	String job;
	int salary;
	/**
	 * @param name
	 * @param job
	 * @param salary
	 * @param previliges
	 */
	public Emp(String name, String job, int salary, Set<Previlige> previliges) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.previliges = previliges;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	Set <Previlige> previliges;
	
	public Emp(){
		super();
	}

	/**
	 * @param name
	 * @param job
	 * @param previliges
	 */
	public Emp(String name, String job, Set<Previlige> previliges) {
		super();
		this.name = name;
		this.job = job;
		this.previliges = previliges;
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
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the previliges
	 */
	public Set<Previlige> getPreviliges() {
		return previliges;
	}

	/**
	 * @param previliges the previliges to set
	 */
	public void setPreviliges(Set<Previlige> previliges) {
		this.previliges = previliges;
	}

	/**
	 * @param name
	 * @param job
	 */
	public Emp(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	
}