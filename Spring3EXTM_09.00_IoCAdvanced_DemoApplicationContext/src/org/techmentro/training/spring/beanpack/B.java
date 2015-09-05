package org.techmentro.training.spring.beanpack;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class B implements BeanNameAware,InitializingBean,DisposableBean{
	private String name;
	public B() {
		System.out.println("Bean B is created"); 
	}
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("Instrusive cleanup of "+name +" is completed");
	}
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Instrusive initialization of "+name +" is completed");
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
	
	public void preDestroy(){
		System.out.println("NON-Instrusive cleanup of "+name +" is completed");
	}
	public void postCreate(){
		System.out.println("NON-Instrusive initialization of "+name +" is completed");
	}
}
