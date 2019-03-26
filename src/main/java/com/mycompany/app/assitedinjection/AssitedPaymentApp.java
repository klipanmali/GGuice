package com.mycompany.app.assitedinjection;

import java.util.Date;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class AssitedPaymentApp {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new AssisteedModule());
		Payment payment = injector.getInstance(RealPaymentAssisted.Factory.class).create(new Date(), "3245");
		payment.executeTransaction();
		payment = injector.getInstance(RealPaymentAssisted.Factory.class).createPayment("2245");
		payment.executeTransaction();

	}

}
