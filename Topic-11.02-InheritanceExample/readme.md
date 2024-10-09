
# Assignment: Demonstrating Inheritance with Printers

## Objective

In this assignment, you will demonstrate your understanding of **inheritance** in Java by implementing a simple application that allows users to select between different types of printers. Each printer will have specific options that users can configure before printing. Your task is to create a program that implements a `Printer` interface, with at least three different types of printers.

## Instructions

1. **Create the `Printer` Interface:**
    - Define an interface called `Printer` with a method `print()`. This method should be implemented by different printer classes.

2. **Load a Configuration File:**
    - The program should load a configuration file that contains the user’s preferences for the printer (e.g., printer type, settings) and initialize the appropriate printer based on these preferences.
    - The configuration file will not be provided. You can create a simple text or JSON file with sample settings for testing.

3. **Implement the Printers:**
    - Implement the following classes, each representing a type of printer:

   ### 1. **PaperPrinter**
       - **Options:** 
         - Printer Name (e.g., "HP LaserJet")
         - Print Mode: "Colour" or "Black and White"
         - Number of Pages to print
       - The `print()` method should output something like:
         ```
         Printing 10 pages in Black and White on HP LaserJet
         ```

   ### 2. **PDFPrinter**
       - **Options:**
         - File Path (e.g., "/path/to/output.pdf")
         - Print Mode: "Colour" or "Black and White"
       - The `print()` method should output something like:
         ```
         Saving a PDF to /path/to/output.pdf in Colour
         ```

   ### 3. **CloudPrinter** (Third Example)
       - **Options:**
         - Cloud Service Name (e.g., "Google Cloud Print")
         - Print Quality: "Draft", "Normal", or "High"
         - Pages to Print
       - The `print()` method should output something like:
         ```
         Sending 5 pages to Google Cloud Print in High quality mode
         ```

4. **Implement the Main Class:**
    - Your `Main` class should load the configuration file, select the appropriate printer, and call the `print()` method based on the user's preferences.

5. **Program Structure:**
    - Ensure that your program uses inheritance to structure the different types of printers.
    - The `PaperPrinter`, `PDFPrinter`, and `CloudPrinter` classes should implement the `Printer` interface.

## Bonus (Optional)

Add functionality to allow users to input their printer selection and options via the command line if no configuration file is provided.

## Example Configuration (for Testing)

You can create a simple configuration file in JSON format, e.g.,:

```json
{
  "printerType": "PaperPrinter",
  "options": {
    "printerName": "HP LaserJet",
    "mode": "Black and White",
    "pages": 10
  }
}
```

## Submission Guidelines

- Submit a ZIP file with your code, including the configuration file and any instructions for running the program.
- Ensure your code is well-documented, and provide comments where necessary to explain your design.

---

This assignment introduces inheritance, interface implementation, and practical object-oriented design. You can modify the instructions and examples as needed, but it should be a good start for your student!