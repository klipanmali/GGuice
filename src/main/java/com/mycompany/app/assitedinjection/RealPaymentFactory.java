package com.mycompany.app.assitedinjection;

import java.util.Date;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class RealPaymentFactory {

	private final Provider<CreditService> creditServiceProvider;
	private final Provider<AuthService> authServiceProvider;

	@Inject
	public RealPaymentFactory(Provider<CreditService> creditService, Provider<AuthService> authService) {
		this.creditServiceProvider = creditService;
		this.authServiceProvider = authService;
	}

	public Payment create(Date transactionDate, String amount) {
		return new RealPayment(creditServiceProvider.get(), authServiceProvider.get(), transactionDate, amount);
	}

}
