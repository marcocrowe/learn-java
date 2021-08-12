/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class WhileLoopExample
{
	public static void main(String[] args)
	{
		System.out.println("A while loop example.");

		int counter = 1;
		while(counter <= 5)
		{
			System.out.println("Counter: " + counter);
			counter++;
		}
	}
}