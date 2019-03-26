package com.mycompany.app;

import com.google.inject.Provider;

public class UppercaseLetterTransformerProvider implements Provider<UppercaseLetterTransformer> {

    @Override
    public UppercaseLetterTransformer get() {
	return new UppercaseLetterTransformer();
    }

}
