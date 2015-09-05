/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

/**
 * @author Adrish
 *
 */
public class HeadOfState {
	int id;
	String title;
	String name;
	/**
	 * @param title
	 * @param name
	 */
	public HeadOfState(String title, String name) {
		super();
		
		this.title = title;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public HeadOfState() {
		
	}

}
