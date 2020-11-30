package com.hz;

public abstract class Card {
    protected Printer printer;

    public Card(Printer printer) {
        this.printer = printer;
    }

        abstract void printHeader ();
        abstract void printMessage ();
        abstract void printImage ();
        abstract void printFooter ();

        public void print(){
            printHeader();
            printMessage();
            printImage();
            printFooter();
        }


}
