package com.mycompany.app;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CallTrackingService implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Before " + invocation.getMethod().getName());
		Object result = invocation.proceed();
		System.out.println("After " + invocation.getMethod().getName());
		return result;
	}
}
