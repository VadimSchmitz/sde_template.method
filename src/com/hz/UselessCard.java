package com.hz;

public class UselessCard extends Card {


    @Override
    void printHeader() {
        printer.printLine("1");
    }

    @Override
    void printMessage() {
        printer.printLine("1");
    }

    @Override
    void printImage() {
        printer.printLine("1");
    }

    @Override
    void printFooter() {
        printer.printLine("1");
    }
}
