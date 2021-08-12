/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class XOrExample
{
	public static void main(String[] args)
	{
		System.out.println("The 'XOR' operator Truth Table");
		System.out.println();
		System.out.println("In Java the 'XOR' operator is written as '^'");
		System.out.println();

		final boolean True = true;
		final boolean False = false;
		System.out.println("InputA ^ InputB -> Result");
		System.out.println(True + " ^ " + True + " -> " + (True ^ True));
		System.out.println(True + " ^ " + False + " -> " + (True ^ False));
		System.out.println(False + " ^ " + True + " -> " + (False ^ True));
		System.out.println(False + " ^ " + False + " -> " + (False ^ False));
	}
}