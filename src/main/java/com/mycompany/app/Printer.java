package com.mycompany.app;

import com.google.inject.ImplementedBy;

@ImplementedBy(ScreenPrinter.class)
public interface Printer {

    void print(String toPrint);

}
