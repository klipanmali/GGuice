package com.mycompany.app.multibindings;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class FlickrPluginModule extends AbstractModule {

	@Override
	protected void configure() {

		Multibinder<UriSummarizer> uriBinder = Multibinder.newSetBinder(binder(), UriSummarizer.class);
		uriBinder.addBinding().to(FlickrPhotoSummarizer.class);

		// ...other bindings
	}

}
