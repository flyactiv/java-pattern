package com.example.lesson10;

import com.example.lesson10.Printer;

public class FilePrinter implements Printer {

    @Override
    public void doPrint() {
        System.out.println(" ... file ... ");
    }
}
