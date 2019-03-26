package com.mycompany.app;

import java.lang.invoke.MethodHandles;

public class TransactionLogger {
	private static final String className = MethodHandles.lookup().lookupClass().getSimpleName();

	public TransactionLogger() {
		System.out.println("Simple " + className + " created");
	}

	public TransactionLogger(String someString) {
		System.out.println("Complex " + className + " created:" + someString);
	}

	void logTransaction(String pizza) {
		System.out.println(className + " logging somethog for " + pizza);
	}

}
