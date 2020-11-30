package com.hz;

public class UselessCard extends Card {

    public UselessCard(Printer printer) {
        super(printer);
    }

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
