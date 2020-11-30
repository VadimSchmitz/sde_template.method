package com.hz;

public class HighSchoolGraduationCard extends Card {

    public HighSchoolGraduationCard(Printer printer) {
        super(printer);
    }

    @Override
    void printHeader() {
        printer.printLine("--@--#--&----------------------&--#--@--");

    }

    @Override
    void printMessage() {
        printer.printLine("This calls for celebrating! Congratulations!");
    }

    protected void printImage() {
        this.printer.printLine("     ,_");
        this.printer.printLine("| `\"\"---..._____");
        this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
        this.printer.printLine("       \\   ```` ``\"---...__  |");
        this.printer.printLine("       |`              |   ``!");
        this.printer.printLine("       |               |     A");
        this.printer.printLine("       |               /\\   /#\\");
        this.printer.printLine("       /`--..______..-'  |  ###");
        this.printer.printLine("      |   /  `\\    /`--. |  ###");
        this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
        this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
        this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
        this.printer.printLine("   \\_,                 /_/");
        this.printer.printLine("       `\\              /");
        this.printer.printLine("         '.  '.__.'  .'");
        this.printer.printLine(" jgs      `-,____,-'");
        this.printer.printLine("           /\"\"\"I\"\"\\");
        this.printer.printLine("           /`---'--'\\");
    }

    @Override
    void printFooter() {
        printer.printLine("--@--#--&----------------------&--#--@--");
    }
}
