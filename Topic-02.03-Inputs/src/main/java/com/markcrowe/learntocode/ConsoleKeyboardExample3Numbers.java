/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import java.util.Scanner;

public class ConsoleKeyboardExample3Numbers
{
	public static void main(String[] args)
	{
		/* variables */
		final int number1;
		final int number2;
		final int number3;
		/* input */
		final var consoleScanner = new Scanner(System.in);
		System.out.println("Please enter three numbers?");
		number1 = consoleScanner.nextInt();
		number2 = consoleScanner.nextInt();
		number3 = consoleScanner.nextInt();
		consoleScanner.close();
		/* work */
		final int sum = number1 + number2 + number3;
		/* output */
		System.out.println("The sum of " + number1 + " + " + number2 + " + " + number3 + " + is " + sum);
	}
}