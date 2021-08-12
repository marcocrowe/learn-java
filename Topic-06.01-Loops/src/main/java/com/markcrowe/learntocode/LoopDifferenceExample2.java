/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class LoopDifferenceExample2
{
	public static void main(String[] args)
	{
		System.out.println("Loop Difference Example 2:");

		System.out.println("Loop 1: (using a for loop)");
		int counter;
		for(counter = 1; counter <= 5; counter++)
		{
			System.out.println("Counter: " + counter);
		}

		System.out.println("Loop 2: (using a while loop)");
		counter = 1;
		while(counter <= 5)
		{
			System.out.println("Counter: " + counter);
			counter = counter + 1;
		}

		System.out.println("Loop 3: (using a while loop)");
		counter = 1;
		while(counter <= 5)
		{
			System.out.println("Counter: " + counter);
			counter = counter + 1;
		}
	}
}