/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

/**
 * @author Adrish
 *
 */
public class Client {
	private int id;
	private String name;
	private String loc;
	/**
	 * @param name
	 * @param loc
	 */
	public Client(String name, String loc) {
		super();
		this.name = name;
		this.loc = loc;
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
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}
	/**
	 * @param loc the loc to set
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}
}
