package org.techmentro.training.spring.beanpack;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class HonestConductor extends Conductor implements BeanFactoryAware{
	private BeanFactory factory;
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.BeanFactoryAware#setBeanFactory(org.springframework.beans.factory.BeanFactory)
	 */
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		// TODO Auto-generated method stub
		this.factory = factory;
	}

	/* (non-Javadoc)
	 * @see org.techmentro.training.spring.beanpack.Conductor#getTicket()
	 */
	@Override
	public Ticket getTicket() {
		// TODO Auto-generated method stub
		return (Ticket)factory.getBean("tic");
	}

	public HonestConductor() {
		// TODO Auto-generated constructor stub
	}

}
