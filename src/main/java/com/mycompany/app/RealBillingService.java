package com.mycompany.app;

import com.google.inject.Inject;
import com.google.inject.Provider;

//There is a built-in provider, so you don't need to create a special one

public class RealBillingService implements BillingService {
	private final Provider<CreditCardProcessor> processorProvider;

	@Inject
	public RealBillingService(Provider<CreditCardProcessor> creditCardProcessorProvider) {
		processorProvider = creditCardProcessorProvider;
	}

	@Override
	public void chargeOrder(String pizaOrder, String creditCard) {
		System.out.println(">>>> Injecting Provider");
		CreditCardProcessor processor = processorProvider.get();
		System.out.println("Chraging order for " + pizaOrder + " pizza");
		processor.charge(creditCard);
		System.out.println("Order charged");

	}

}
