package com.mycompany.app;

import com.google.inject.ProvidedBy;

@ProvidedBy(UppercaseLetterTransformerProvider.class)
public interface LetterTransformer {

    String transfor(String toTransform);

}
