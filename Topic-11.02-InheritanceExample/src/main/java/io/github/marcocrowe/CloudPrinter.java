package io.github.marcocrowe;

public class CloudPrinter implements Printer {
    private String cloudServiceName;
    private String printQuality; // "Draft", "Normal", or "High"
    private int numPages;

    public CloudPrinter(String cloudServiceName, String printQuality, int numPages) {
        this.cloudServiceName = cloudServiceName;
        this.printQuality = printQuality;
        this.numPages = numPages;
    }

    public String getCloudServiceName() {
        return cloudServiceName;
    }

    public void setCloudServiceName(String cloudServiceName) {
        this.cloudServiceName = cloudServiceName;
    }

    public String getPrintQuality() {
        return printQuality;
    }

    public void setPrintQuality(String printQuality) {
        this.printQuality = printQuality;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public void print() {
        System.out.println("Sending " + numPages + " pages to "
                + cloudServiceName + " in " + printQuality + " quality mode");
    }
}