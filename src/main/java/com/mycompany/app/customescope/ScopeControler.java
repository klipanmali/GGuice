package com.mycompany.app.customescope;

import com.google.inject.Inject;
import com.google.inject.Key;

public class ScopeControler implements Runnable {

	private SimpleMinuteScope scope;

	@Inject
	public ScopeControler(SimpleMinuteScope scope) {
		this.scope = scope;
	}

	@Override
	public void run() {

		try {
			scope.enter();
			Thread.sleep(60000);
			scope.enter();
			scope.seed(Key.get(Uniform.class), new Uniform(ClassColor.RED));
			scope.seed(Key.get(Accessorie.class), new Accessorie(ClassColor.RED));
			Thread.sleep(60000);
			scope.enter();
		} catch (InterruptedException e) {
			System.out.println("Scope controler interruppted");
			e.printStackTrace();
		}
	}

}
