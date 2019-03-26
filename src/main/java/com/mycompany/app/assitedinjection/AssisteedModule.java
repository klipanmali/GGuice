package com.mycompany.app.assitedinjection;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class AssisteedModule extends AbstractModule {

	@Override
	protected void configure() {

		install(new FactoryModuleBuilder().implement(Payment.class, RealPaymentAssisted.class)
				// excluding .implement for Shipment means the implementation class
				// will be 'Shipment' itself, which is legal if it's not an interface.
				// .implement(Receipt.class, RealReceipt.class)
				.build(RealPaymentAssisted.Factory.class));

	}

}
