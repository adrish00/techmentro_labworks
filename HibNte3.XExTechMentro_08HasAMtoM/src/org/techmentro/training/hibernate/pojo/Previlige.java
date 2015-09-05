/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

import java.util.Set;

/**
 * @author Adrish
 *
 */
public class Previlige {
	int id;
	String name;
	int annualCost;
	Set <Emp> employees;
	
	public Previlige(){
		super();
	}
	
	/**
	 * @param name
	 * @param annualCost
	 */
	public Previlige(String name, int annualCost) {
		super();
		this.name = name;
		this.annualCost = annualCost;
	}

	/**
	 * @param name
	 * @param annualCost
	 * @param employees
	 */
	public Previlige(String name, int annualCost, Set<Emp> employees) {
		super();
		this.name = name;
		this.annualCost = annualCost;
		this.employees = employees;
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
	 * @return the annualCost
	 */
	public int getAnnualCost() {
		return annualCost;
	}
	/**
	 * @param annualCost the annualCost to set
	 */
	public void setAnnualCost(int annualCost) {
		this.annualCost = annualCost;
	}
	/**
	 * @return the employees
	 */
	public Set<Emp> getEmployees() {
		return employees;
	}
	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set<Emp> employees) {
		this.employees = employees;
	}
}
