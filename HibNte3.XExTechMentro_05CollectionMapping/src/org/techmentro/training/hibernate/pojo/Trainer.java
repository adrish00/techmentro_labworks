/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

import java.util.Set;

/**
 * @author Adrish
 *
 */
public class Trainer {

	int id;
	String name;
	Set<Batch> batches;
	/**
	 * @param name
	 * @param batches
	 */
	public Trainer(String name, Set<Batch> batches) {
		super();
		this.name = name;
		this.batches = batches;
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
	 * @return the batches
	 */
	public Set<Batch> getBatches() {
		return batches;
	}
	/**
	 * @param batches the batches to set
	 */
	public void setBatches(Set<Batch> batches) {
		this.batches = batches;
	}
	/**
	 * 
	 */
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

}
