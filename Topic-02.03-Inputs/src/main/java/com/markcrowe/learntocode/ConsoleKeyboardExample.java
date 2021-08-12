/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import java.util.Scanner;

public class ConsoleKeyboardExample
{
	public static void main(String[] args)
	{
		/* variables */
		final String name;
		final int text;
		/* input */
		final var consoleScanner = new Scanner(System.in);
		System.out.println("Please enter a line of text?");
		name = consoleScanner.nextLine();
		System.out.println("Please enter a number?");
		text = consoleScanner.nextInt();
		consoleScanner.close();
		/* output */
		System.out.println("Text: " + name);
		System.out.println("Number: " + text);
	}
}