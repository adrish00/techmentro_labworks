/**
 * 
 */
package com.techmentro.training.spring.aopdemo;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author Adrish
 *
 */
public class IncaseOfError implements ThrowsAdvice {

	public IncaseOfError() {
		// TODO Auto-generated constructor stub
	}
	//Either of the handler methods is used
	//HandlerMethod
	/*public void afterThrowing(Exception e){
		System.out.println("ThrowsAdviceApplied because of"+e);
	}*/
	//Another version of HandlerMethod
	public void afterThrowing(Method m,Object args,Object target,Exception e){
		System.out.println("ThrowsAdvice applied because of "+e+" occured in "+m.getName()+ " () method");
	}
}
