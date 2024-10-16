/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class AndExample
{
	public static void main(String[] args)
	{
		System.out.println("The 'AND' operator Truth Table");
		System.out.println();
		System.out.println("In Java the 'AND' operator is written as '&&'");
		System.out.println();

		System.out.println("  A   &&   B   -> Result");
		System.out.println(true + "  && " + true + "  -> " + (true && true));
		System.out.println(true + "  && " + false + " -> " + (true && false));
		System.out.println(false + " && " + true + "  -> " + (false && true));
		System.out.println(false + " && " + false + " -> " + (false && false));
	}
}
