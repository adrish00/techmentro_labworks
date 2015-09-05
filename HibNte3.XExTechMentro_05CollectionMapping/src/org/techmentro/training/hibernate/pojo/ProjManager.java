/**
 * 
 */
package org.techmentro.training.hibernate.pojo;
import java.util.Map;
/**
 * @author Adrish
 *
 */
public class ProjManager {
	int id;
	String name;
	Map <Client,Project> projects;
	/**
	 * @param args
	 */
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
	 * @return the projects
	 */
	public Map<Client, Project> getProjects() {
		return projects;
	}
	/**
	 * @param projects the projects to set
	 */
	public void setProjects(Map<Client, Project> projects) {
		this.projects = projects;
	}
	/**
	 * @param name
	 * @param projects
	 */
	public ProjManager(String name, Map<Client, Project> projects) {
		super();
		this.name = name;
		this.projects = projects;
	}
	

}
