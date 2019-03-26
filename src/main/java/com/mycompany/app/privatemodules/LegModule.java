package com.mycompany.app.privatemodules;

import java.lang.annotation.Annotation;

import com.google.inject.PrivateModule;

public abstract class LegModule<T extends Annotation> extends PrivateModule {

	private final Class<T> annotation;

	public LegModule(Class<T> annotation) {
		this.annotation = annotation;
	}

	@Override
	protected void configure() {
		bind(Leg.class).annotatedWith(annotation).to(Leg.class);
		expose(Leg.class).annotatedWith(annotation);
		bindFoot();
	}

	abstract void bindFoot();

}
