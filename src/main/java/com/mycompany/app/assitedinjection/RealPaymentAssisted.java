package com.mycompany.app.assitedinjection;

import java.util.Date;

import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

public class RealPaymentAssisted implements Payment {

	private CreditService creditService;
	private AuthService authService;
	private Date transactionDate;
	private String amount;

	// @Inject
	@AssistedInject // in case of many methods in Factory class
	public RealPaymentAssisted(CreditService creditService, AuthService authService, @Assisted Date transactionDate,
			@Assisted String amount) {
		this.creditService = creditService;
		this.authService = authService;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}

	@AssistedInject
	public RealPaymentAssisted(CreditService creditService, AuthService authService, @Assisted String amount) {
		this.creditService = creditService;
		this.authService = authService;
		this.transactionDate = new Date();
		this.amount = amount;

	}

	// This is factory method that will be used by Factory, dynamically created by
	// Guice, to create FooView instance
	// actually create(..) method can be named as you like, createPayment(..) ...
	public static interface Factory {

		Payment create(Date transactionDate, String amount);

		Payment createPayment(String amount);
		// Factories can create an arbitrary number of objects, one per each method.
		// Each factory method can be configured using .implement
		// Shipment create(Customer customer, Item item);
		// Receipt create(Payment payment, Shipment shipment);
	}

	@Override
	public void executeTransaction() {
		System.out.println("Authenticating");
		authService.autenthicate("SomeUser", "pass1234");
		System.out.println(transactionDate + ": starting transaction");
		creditService.verifyTransaction("1234567890", amount);
	}
}
