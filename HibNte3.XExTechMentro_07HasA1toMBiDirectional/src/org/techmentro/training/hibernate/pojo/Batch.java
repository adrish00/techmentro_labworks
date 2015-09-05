/**
 * 
 */
package org.techmentro.training.hibernate.pojo;

/**
 * @author Adrish
 *
 */
public class Batch {

	/**
	 * 
	 */
	int id;
	String slot;
	String topic;
	Trainer trainer;
	/**
	 * @param slot
	 * @param topic
	 */
	public Batch(String slot, String topic) {
		super();
		this.slot = slot;
		this.topic = topic;
	}
	/**
	 * @param slot
	 * @param topic
	 * @param trainer
	 */
	public Batch(String slot, String topic, Trainer trainer) {
		super();
		this.slot = slot;
		this.topic = topic;
		this.trainer = trainer;
	}
	/**
	 * @return the trainer
	 */
	public Trainer getTrainer() {
		return trainer;
	}
	/**
	 * @param trainer the trainer to set
	 */
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
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
	 * @return the slot
	 */
	public String getSlot() {
		return slot;
	}
	/**
	 * @param slot the slot to set
	 */
	public void setSlot(String slot) {
		this.slot = slot;
	}
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public Batch() {
		// TODO Auto-generated constructor stub
	}

}
