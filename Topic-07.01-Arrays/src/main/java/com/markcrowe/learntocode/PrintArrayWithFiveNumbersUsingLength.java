/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class PrintArrayWithFiveNumbersUsingLength
{
	public static void main(String[] args)
	{
		System.out.println("Print Array With Five Numbers using Array.Length field");
		/* declare and Initialize array */
		int[] numbers =
		{
			10, 20, 30, 40, 50
		};
		for(int index = 0; index < numbers.length; index++)
			System.out.println(numbers[index]);
	}
}