package io.github.marcocrowe;

public abstract class PrintModePrinterBase {
    private String printMode; // "Colour" or "Black and White"

    public String getPrintMode() {return printMode;}

    public void setPrintMode(String printMode) {this.printMode = printMode;}

    public void resetPaper()
    {
        //important
    }
}
