package org.techmentro.training.spring.beanpack;

public class DishonestConductor extends Conductor {
	private Ticket ticket;
	public DishonestConductor() {
		System.out.println("Dishonest Conductor is created");
	}

	@Override
	public Ticket getTicket() {
		return ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
		System.out.println("Ticket is provided to Conductor");
	}
}
