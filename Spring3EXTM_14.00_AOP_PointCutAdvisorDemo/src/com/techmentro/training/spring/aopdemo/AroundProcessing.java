package com.techmentro.training.spring.aopdemo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundProcessing implements MethodInterceptor{

	public AroundProcessing() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		//preprocessing
		String m = mi.getMethod().getName()+" ()";
		System.out.println("Around advice is applied on "+m);
		//get the proxied method invoked
		Object o = mi.proceed();
		//post processing
		if(o==null){
			System.out.println(m+" returned nothing.");
		}
		else{
			System.out.println(m+" returned "+o);
			if(o instanceof String){
				System.out.println("chaning value to failure");
				o = "failure";
				System.out.println("returned value changed.");
			}
		}
		System.out.println("Around advice completed.");
		return o;
	}

}
