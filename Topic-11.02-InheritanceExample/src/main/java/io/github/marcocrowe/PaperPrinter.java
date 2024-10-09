package io.github.marcocrowe;

public class PaperPrinter extends PrintModePrinterBase implements Printer {

    private String printerName;
    private int numPages;

    public PaperPrinter(String printerName, String printMode, int numPages) {
        this.printerName = printerName;
        this.numPages = numPages;
        setPrintMode(printMode);
    }

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }


    public int getNumPages() {        return numPages;    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    @Override
    public void print() {
        System.out.println("Printing " + numPages + " pages in "
                + getPrintMode() + " on " + printerName);
    }
}
