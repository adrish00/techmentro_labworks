package org.techmentro.training.spring.beanpack;
import java.util.*;
public class Trainer {
	String name;
	Set<Batch> batches;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		Iterator<Batch> itr = batches.iterator();
		str.append("Trainer Name:").append(name).append("\n");
		str.append("Batch Details\n");
		while(itr.hasNext()){
			str.append(itr.next()).append("\n");
		}
		return str.toString();
	}
	/**
	 * @param name
	 * @param batches
	 */
	public Trainer(String name, Set<Batch> batches) {
		super();
		this.name = name;
		this.batches = batches;
		System.out.println("Trainer created.Set of batches injects");
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
		System.out.println("name injected");
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
		System.out.println("set of batches injected");
	}
	public Trainer() {
		// TODO Auto-generated constructor stub
	}

}
