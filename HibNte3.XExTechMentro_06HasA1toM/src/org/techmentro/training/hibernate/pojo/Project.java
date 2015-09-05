/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

/**
 * @author Adrish
 *
 */
public class Project {

	/**
	 * 
	 */
	int id;
	String name;
	int teamSize;
	/**
	 * @param name
	 * @param teamSize
	 */
	public Project(String name, int teamSize) {
		super();
		this.name = name;
		this.teamSize = teamSize;
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
	 * @return the teamSize
	 */
	public int getTeamSize() {
		return teamSize;
	}
	/**
	 * @param teamSize the teamSize to set
	 */
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public Project() {
		// TODO Auto-generated constructor stub
	}

}
