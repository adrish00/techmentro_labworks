/**
 * 
 */
package org.techmentro.training.spring.factorypack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author admin
 *
 */
public class MyFactory {

	/**
	 * 
	 */
	public MyFactory() {
		// TODO Auto-generated constructor stub
	}
	static BeanFactory factory;
	static {
		Resource r = new ClassPathResource("applicationContext.xml");
		factory = new XmlBeanFactory(r);
	}
	public static BeanFactory getBeanFactory(){
		return factory;
	}
}
