package org.techmentro.training.spring.beanpack;

import org.springframework.beans.factory.BeanNameAware;

public class B implements BeanNameAware{
	private String name;
	public B() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setBeanName(String name) {
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
}
