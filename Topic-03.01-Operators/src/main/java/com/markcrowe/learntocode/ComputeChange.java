package com.markcrowe.learntocode;

import java.util.Scanner;
// ComputeChange.java: Break down an amount into smaller units
import javax.swing.*;

public class ComputeChange {

  private static final int TWO_EURO = 200;
  private static final int ONE_EURO = 100;
  private static final int FIFTY_CENT = 50;
  private static final int TWENTY_CENT = 20;
  private static final int TEN_CENT = 10;
  private static final int FIVE_CENT = 5;
  private static final int TWO_CENT = 2;
  private static final int ONE_CENT = 1;

  public static void main(String[] args) {
    try (var consoleScanner = new Scanner(System.in);) {
      // Receive the amount entered from the keyboard
      String input = JOptionPane.showInputDialog("Please enter your amount");
      double amount = Double.parseDouble(input);

      int remainingAmount = (int) (amount * 100);

      // Calculate the number of each coin
      int numOfTwoEuro = remainingAmount / TWO_EURO;
      remainingAmount %= TWO_EURO;

      int numOfOneEuro = remainingAmount / ONE_EURO;
      remainingAmount %= ONE_EURO;

      int numOf50 = remainingAmount / FIFTY_CENT;
      remainingAmount %= FIFTY_CENT;

      int numOf20 = remainingAmount / TWENTY_CENT;
      remainingAmount %= TWENTY_CENT;

      int numOf10 = remainingAmount / TEN_CENT;
      remainingAmount %= TEN_CENT;

      int numOf5 = remainingAmount / FIVE_CENT;
      remainingAmount %= FIVE_CENT;

      int numOf2 = remainingAmount / TWO_CENT;
      remainingAmount %= TWO_CENT;

      int numOf1 = remainingAmount;

      // Display results
      String output = "Your amount " + amount + " consists of ";
      output += "\n" + numOfTwoEuro + "    2 Euro pieces";
      output += "\n" + numOfOneEuro + "    1 Euro pieces";
      output += "\n" + numOf50 + "    50 cent pieces";
      output += "\n" + numOf20 + "    20 cent pieces";
      output += "\n" + numOf10 + "    10 cent pieces";
      output += "\n" + numOf5 + "     5 cent pieces";
      output += "\n" + numOf2 + "     2 cent pieces";
      output += "\n" + numOf1 + "     1 cent pieces";

      System.out.println(output);
    }
  }
}
