package com.mycompany.app;

public class ScreenPrinter implements Printer {

    @Override
    public void print(String toPrint) {
	System.out.println(toPrint);
    }

}
