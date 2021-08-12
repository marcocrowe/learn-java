/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import java.util.Scanner;

public class ConsoleKeyboardExample3Words
{
	public static void main(String[] args)
	{
		/* variables */
		final String text1;
		final String text2;
		final String text3;
		/* input */
		try(final var consoleScanner = new Scanner(System.in))
		{
			System.out.println("Please enter three words?");
			text1 = consoleScanner.next();
			text2 = consoleScanner.next();
			text3 = consoleScanner.next();
		}
		/* output */
		System.out.println("THe first 3 words entered are {" + text1 + ", " + text2 + ", " + text3 + "}");
	}
}