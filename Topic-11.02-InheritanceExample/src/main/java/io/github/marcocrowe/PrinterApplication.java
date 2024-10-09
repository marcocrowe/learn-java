package io.github.marcocrowe;

import java.util.Scanner;

public class PrinterApplication {

    public static void main(String[] args) {
        // Simulate loading a file or user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Printer Type: 1 for PaperPrinter, 2 for PDFPrinter, 3 for CloudPrinter");
        int printerType = scanner.nextInt();
        Printer printer = null;

        printer = getPrinter(printerType, scanner);
        if (printer == null) return;

        // Print using the selected printer
        if (printer != null) {
            printer.print();
        }

        scanner.close();
    }

    private static Printer getPrinter(int printerType, Scanner scanner) {
        Printer printer;
        switch (printerType) {
            case 1:
                System.out.println("Enter Printer Name: ");
                String printerName = scanner.next();
                System.out.println("Print Colour or Black and White? (colour/bw): ");
                String paperMode = scanner.next();
                System.out.println("Number of pages: ");
                int pages = scanner.nextInt();
                printer = new PaperPrinter(printerName, paperMode.equals("bw") ? "Black and White" : "Colour", pages);
                break;
            case 2:
                System.out.println("Enter file path to save PDF: ");
                String filePath = scanner.next();
                System.out.println("Print Colour or Black and White? (colour/bw): ");
                String pdfMode = scanner.next();
                printer = new PdfPrinter(filePath, pdfMode.equals("bw") ? "Black and White" : "Colour");
                break;
            case 3:
                System.out.println("Enter Cloud Service Name (e.g., Google Cloud Print): ");
                String cloudServiceName = scanner.next();
                System.out.println("Enter Print Quality (draft/normal/high): ");
                String quality = scanner.next();
                System.out.println("Number of pages: ");
                int cloudPages = scanner.nextInt();
                printer = new CloudPrinter(cloudServiceName, quality, cloudPages);
                break;
            default:
                System.out.println("Invalid printer selection");
                return null;
        }
        return printer;
    }
}
