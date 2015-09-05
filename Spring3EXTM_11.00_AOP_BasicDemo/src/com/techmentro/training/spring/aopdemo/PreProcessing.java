package com.techmentro.training.spring.aopdemo;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class PreProcessing implements MethodBeforeAdvice {

	public PreProcessing() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void before(Method m, Object[] args, Object target)
			throws Throwable {
		System.out.println("Before advise is applied on" +m.getName()+" () method");
	}

}
