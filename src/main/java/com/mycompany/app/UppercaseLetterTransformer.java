package com.mycompany.app;

public class UppercaseLetterTransformer implements LetterTransformer {

    @Override
    public String transfor(String toTransform) {
	return toTransform.toUpperCase();
    }

}
