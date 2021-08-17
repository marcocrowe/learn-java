/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class MultiplicationTable
{
	public static void main(String[] args)
	{
		int startNumber = 1;
		int multiplicationFactor = 1;
		printMultiplicationTables(multiplicationFactor, 9, startNumber, 10);
		System.out.println("Main\t" + multiplicationFactor);
		printMultiplicationTables(multiplicationFactor, 4, startNumber, 9);
	}
	public static void mainOld()
	{
		/* nine times tables */
		String output = "";
		for(int multiplicationFactor = 1; multiplicationFactor <= 9; multiplicationFactor++)
		{
			for(int number = 1; number <= 9; number++)
				output += (number * multiplicationFactor) + "\t";
			output += "\n";
		}
		System.out.println(output);
		/* 10 to 19 */
		System.out.println("\n");

		for(int multiplicationFactor = 1; multiplicationFactor <= 4; multiplicationFactor++)
		{
			for(int number = 1; number <= 9; number++)
				output += (number * multiplicationFactor) + "\t";
			output += "\n";
		}
		System.out.println(output);
	}
	public static void main1(String[] args)
	{
		String output = "";
		for(int multiplicationFactor = 1; multiplicationFactor <= 9; multiplicationFactor++)
		{
			for(int number = 1; number <= 9; number++)
				output += (number * multiplicationFactor) + "\t";
			output += "\n";
		}
		System.out.println(output);
	}
	public static void printMultiplicationTables1()
	{
		for(int multiplicationFactor = 1; multiplicationFactor <= 9; multiplicationFactor++)
		{
			String output = "";
			for(int number = 1; number <= 9; number++)
				output += (number * multiplicationFactor) + "\t";
			System.out.println(output);
		}
	}
	public static void printMultiplicationTables(int multiplicationFactor, int multiplicationLimit, int startNumber, int endNumber)
	{
		for(; multiplicationFactor <= multiplicationLimit; multiplicationFactor++)
		{
			String output = "";
			for(int number = startNumber; number <= endNumber; number++)
				output += (number * multiplicationFactor) + "\t";
			System.out.println(output);
		}
		System.out.println("printMultiplicationTables" + multiplicationFactor);
	}
}