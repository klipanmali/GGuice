package com.mycompany.app;

import com.google.inject.Inject;
import com.google.inject.Provider;

//There is a built-in provider, so you don't need to create a special one

public class RealBillingService implements BillingService {
	private final Provider<CreditCardProcessor> processorProvider;
	private final Provider<TransactionLogger> loggerProvider;

	@Inject
	public RealBillingService(Provider<TransactionLogger> trancastionLoggerProvider,
			Provider<CreditCardProcessor> creditCardProcessorProvider) {
		processorProvider = creditCardProcessorProvider;
		loggerProvider = trancastionLoggerProvider;
	}

	@Override
	public void chargeOrder(String pizaOrder, String creditCard) {
		System.out.println(">>>> Injecting Provider");
		CreditCardProcessor processor = processorProvider.get();
		TransactionLogger logger = loggerProvider.get();
		logger.logTransaction(pizaOrder);
		System.out.println("Chraging order for " + pizaOrder + " pizza");
		processor.charge(creditCard);
		System.out.println("Order charged");
		logger.logTransaction(pizaOrder);

	}

}
