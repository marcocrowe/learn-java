package io.github.marcocrowe;

import java.util.Scanner;

public class PrinterApplication {

    public static void main(String[] args) {
        // Simulate loading a file or user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Printer Type: 1 for PaperPrinter, 2 for PDFPrinter, 3 for CloudPrinter");
        int printerType = scanner.nextInt();
        Printer printer = getPrinter(printerType, scanner);
        if (printer == null) return;

        printer.print();

        scanner.close();
    }

    private static Printer getPrinter(int printerType, Scanner scanner) {
        switch (printerType) {
            case 1:
                System.out.println("Enter Printer Name: ");
                String printerName = scanner.next();
                System.out.println("Print Colour or Black and White? (colour/bw): ");
                String paperMode = scanner.next();
                System.out.println("Number of pages: ");
                int pages = scanner.nextInt();
                return new PaperPrinter(printerName, paperMode.equals("bw") ? "Black and White" : "Colour", pages);
            case 2:
                System.out.println("Enter file path to save PDF: ");
                String filePath = scanner.next();
                System.out.println("Print Colour or Black and White? (colour/bw): ");
                String pdfMode = scanner.next();
                return new PdfPrinter(filePath, pdfMode.equals("bw") ? "Black and White" : "Colour");
            case 3:
                System.out.println("Enter Cloud Service Name (e.g., Google Cloud Print): ");
                String cloudServiceName = scanner.next();
                System.out.println("Enter Print Quality (draft/normal/high): ");
                String quality = scanner.next();
                System.out.println("Number of pages: ");
                int cloudPages = scanner.nextInt();
                return new CloudPrinter(cloudServiceName, quality, cloudPages);

            default:
                System.out.println("Invalid printer selection");
                return null;
        }
    }
}
