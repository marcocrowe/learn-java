package io.github.marcocrowe;

public class PdfPrinter extends PrintModePrinterBase implements Printer {


    private String filePath;

    public PdfPrinter(String filePath, String printMode) {
        this.filePath = filePath;
        super.setPrintMode(printMode);
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void print() {
        System.out.println("Saving a PDF to " + filePath + " in " + getPrintMode());
    }

    @Override
    public void resetPaper()
    {
        super.resetPaper();
    }
}
