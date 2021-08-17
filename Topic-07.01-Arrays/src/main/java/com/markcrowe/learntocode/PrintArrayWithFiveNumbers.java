/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class PrintArrayWithFiveNumbers
{
	public static void main(String[] args)
	{
		System.out.println("Print Array With Five Numbers");
		/* declare and Initialize array */
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int index = 0; index < 5; index++)
			System.out.println(numbers[index]);
	}
}