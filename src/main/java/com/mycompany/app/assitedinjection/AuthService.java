package com.mycompany.app.assitedinjection;

public class AuthService {

	public Boolean autenthicate(String userName, String pass) {
		System.out.println("Authenticating: " + userName + " , pass:" + pass);
		return true;
	}

}
