package com.mycompany.app.assitedinjection;

import java.util.Date;

public class RealPayment implements Payment {

	private CreditService creditService;
	private AuthService authService;
	private Date transactionDate;
	private String amount;

	public RealPayment(CreditService creditService, AuthService authService, Date transactionDate, String amount) {
		this.creditService = creditService;
		this.authService = authService;
		this.transactionDate = transactionDate;
		this.amount = amount;
	}

	@Override
	public void executeTransaction() {
		System.out.println("Authenticating");
		authService.autenthicate("SomeUser", "pass1234");
		System.out.println(transactionDate + ": starting transaction");
		creditService.verifyTransaction("1234567890", amount);
	}

}
