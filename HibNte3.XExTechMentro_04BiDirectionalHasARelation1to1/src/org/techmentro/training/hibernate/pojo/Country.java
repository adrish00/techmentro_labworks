/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

/**
 * @author Adrish
 *
 */
public class Country {
	int id;
	String name;
	HeadOfState hos;
	
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
	 * @return the hos
	 */
	public HeadOfState getHos() {
		return hos;
	}

	/**
	 * @param hos the hos to set
	 */
	public void setHos(HeadOfState hos) {
		this.hos = hos;
	}

	/**
	 * @param name
	 * @param hos
	 */
	public Country(String name, HeadOfState hos) {
		super();
		this.name = name;
		this.hos = hos;
	}

	/**
	 * 
	 */
	public Country() {
		// TODO Auto-generated constructor stub
	}

}
