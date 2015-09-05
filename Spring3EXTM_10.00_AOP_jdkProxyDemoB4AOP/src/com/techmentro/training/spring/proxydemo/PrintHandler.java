package com.techmentro.training.spring.proxydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PrintHandler implements InvocationHandler {
	Object target;
	public PrintHandler() {
		
	}

	/**
	 * @param target
	 */
	public PrintHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//Preprocessing Logic
		System.out.println("Call to "+ method.getName() +"() is invoked");
		//invoke the proxied method on target Object
		Object r = method.invoke(target, args);
		//Post processing logic if any
		System.out.println("interception of "+method.getName()+"() completed");
		return r;
	}
}
