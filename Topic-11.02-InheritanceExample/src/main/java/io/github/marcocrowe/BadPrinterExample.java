package io.github.marcocrowe;

import java.util.Scanner;

public class BadPrinterExample {

    public static void main(String[] args) {
        // Simulate loading from a file by getting user input for printer selection
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Printer Type: 1 for PaperPrinter, 2 for PDFPrinter, 3 for CloudPrinter");
        int printerType = scanner.nextInt();

        if (printerType == 1) {
            // Paper Printer logic
            System.out.println("Enter Printer Name: ");
            String printerName = scanner.next();
            System.out.println("Print Colour or Black and White? (colour/bw): ");
            String mode = scanner.next();
            System.out.println("Number of pages: ");
            int pages = scanner.nextInt();

            // Hardcoded logic for PaperPrinter
            System.out.println("Printing " + pages + " pages in " + (mode.equals("bw") ? "Black and White" : "Colour") +
                    " on " + printerName);

        } else if (printerType == 2) {
            // PDF Printer logic
            System.out.println("Enter file path to save PDF: ");
            String filePath = scanner.next();
            System.out.println("Print Colour or Black and White? (colour/bw): ");
            String mode = scanner.next();

            // Hardcoded logic for PDFPrinter
            System.out.println("Saving PDF to " + filePath + " in " + (mode.equals("bw") ? "Black and White" : "Colour"));

        } else if (printerType == 3) {
            // Cloud Printer logic
            System.out.println("Enter Cloud Service Name (e.g., Google Cloud Print): ");
            String cloudService = scanner.next();
            System.out.println("Enter Print Quality (draft/normal/high): ");
            String quality = scanner.next();
            System.out.println("Number of pages: ");
            int pages = scanner.nextInt();

            // Hardcoded logic for CloudPrinter
            System.out.println("Sending " + pages + " pages to " + cloudService + " in " + quality + " quality mode");
        } else {
            System.out.println("Invalid printer selection");
        }

        scanner.close();
    }
}
