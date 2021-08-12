/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class DoWhileLoopExample
{
	public static void main(String[] args)
	{
		System.out.println("A do while loop example.");
		int counter = 1;
		do
		{
			System.out.println("Counter: " + counter);
			counter++;
		}
		while(counter <= 5);
	}
}