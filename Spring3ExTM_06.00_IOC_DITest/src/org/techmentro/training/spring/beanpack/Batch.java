package org.techmentro.training.spring.beanpack;

public class Batch {
	private String slot;
	private String topic;
	private String mode;
	public Batch() {
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return slot+"\t"+topic+"\t"+mode+"\t";
	}
	/**
	 * @param slot
	 * @param topic
	 * @param mode
	 */
	public Batch(String slot, String topic, String mode) {
		super();
		this.slot = slot;
		this.topic = topic;
		this.mode = mode;
		System.out.println("Batch created");
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
		System.out.println("slot injected");
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
		System.out.println("topic injected");
	}
	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
		System.out.println("mode injected");
	}

}
