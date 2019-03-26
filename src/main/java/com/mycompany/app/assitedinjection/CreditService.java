package com.mycompany.app.assitedinjection;

public class CreditService {

	public Boolean verifyTransaction(String account, String amount) {
		System.out.println("Verifing if payment is possible, account:" + account + ", amount:" + amount);
		return new Boolean(true);
	}

	public Boolean processTransaction(String account, String amount) {
		System.out.println("Processing if payment is possible, account:" + account + ", amount:" + amount);
		return new Boolean(true);
	}
}
