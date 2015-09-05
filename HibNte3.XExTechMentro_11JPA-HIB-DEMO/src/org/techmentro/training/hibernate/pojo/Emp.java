/**
 * 
 */
package org.techmentro.training.hibernate.pojo;
import javax.persistence.*;
/**
 * @author Adrish
 *
 */
@Entity
@Table(name="Emp")
public class Emp {
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	public Emp(String name, String job, int salary) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
	
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

	
	public Emp(){
		super();
	}

	/**
	 * @param name
	 * @param job
	 * @param previliges
	 */
	public Emp(String name, String job) {
		super();
		this.name = name;
		this.job = job;
		
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
}