package com.mycompany.app.customescope;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {

	@Override
	protected void configure() {
		SimpleMinuteScope scope = new SimpleMinuteScope();

		// bind annotation to the scope implementation
		bindScope(MinuteScope.class, scope);
		// bind SimpleMinuteScope, needed by ScopeControler
		bind(SimpleMinuteScope.class).toInstance(scope);

		bind(Accessorie.class).in(MinuteScope.class);
		bind(Uniform.class).in(MinuteScope.class);

	}

}
