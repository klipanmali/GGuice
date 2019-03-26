package com.mycompany.app.assitedinjection;

import java.util.Date;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class PaymentApp {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FactoryModule());
		RealPaymentFactory paymentFactory = injector.getInstance(RealPaymentFactory.class);
		Payment payment = paymentFactory.create(new Date(), "1234");
		payment.executeTransaction();

	}

}
