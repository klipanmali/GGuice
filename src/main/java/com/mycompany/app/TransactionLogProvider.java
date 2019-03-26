package com.mycompany.app;

import com.google.inject.Provider;

// this provider is not injected in RealBillingService automatically
public class TransactionLogProvider implements Provider<TransactionLogger> {

	@Override
	public TransactionLogger get() {
		return new TransactionLogger("ItHappend");
	}

}
