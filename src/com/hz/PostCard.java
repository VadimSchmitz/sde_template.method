package com.hz;

public class PostCard extends Card {

    public PostCard( ) {
        super();
    }


    @Override
    void printHeader() {
       printer.printLine("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    @Override
    void printMessage() {
        printer.printLine("Greetings from the netherlands!");
    }

    protected void printImage() {
            this.printer.printLine("        Art by Hayley Jane Wakenshaw");
            this.printer.printLine("");
            this.printer.printLine("             /)  (\\");
            this.printer.printLine("        .-._((,~~.))_.-,");
            this.printer.printLine("         `=.   99   ,='");
            this.printer.printLine("           / ,o~~o. \\");
            this.printer.printLine("          { { .__. } }");
            this.printer.printLine("           ) `~~~\' (");
            this.printer.printLine("          /`-._  _\\.-\\");
            this.printer.printLine("         /         )  \\");
            this.printer.printLine("       ,-X        #   X-.");
            this.printer.printLine("hjw   /   \\          /   \\");
            this.printer.printLine("     (     )| |  | |(     )");
            this.printer.printLine("      \\   / | |  | | \\   /");
            this.printer.printLine("       \\_(.-( )--( )-.)_/");
            this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
            this.printer.printLine("           /_,\\  /._\\");
    }

    @Override
    void printFooter() {
        printer.printLine("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
}
