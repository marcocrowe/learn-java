/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class NotExample
{
	public static void main(String[] args)
	{
		System.out.println("The 'NOT' operator Truth Table");
		System.out.println();
		System.out.println("In Java the 'NOT' operator is written as '!'");
		System.out.println();

		final boolean True = true;
		final boolean False = false;
		System.out.println("Input -> Result");
		System.out.println("!" + True + " -> " + !True);
		System.out.println("!" + False + " -> " + !False);
	}
}