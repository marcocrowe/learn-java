/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class AccessArrayElementExample
{
	public static void main(String[] args)
	{
		System.out.println("Access Array Element Example");
		/* declare and Initialize array */
		String[] programmingLanguages =
		{
			"C#", "C++", "Java", "PHP", "VB"
		};

		String element1 = programmingLanguages[0];
		String element4 = programmingLanguages[3];

		System.out.println("element 1: " + element1);
		System.out.println("element 4: " + element4);
	}
}