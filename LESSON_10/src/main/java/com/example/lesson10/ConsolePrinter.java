package com.example.lesson10;

import com.example.lesson10.Printer;

public class ConsolePrinter implements Printer {

    @Override
    public void doPrint() {
        System.out.println(" ... console ... ");
    }
}
