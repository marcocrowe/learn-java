/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import java.util.Scanner;

public class CalculateAverageExample
{
	public static void main(String[] args)
	{
		System.out.println("Take a number of inputs and calculate the average.");

		var scanner = new Scanner(System.in);
		System.out.println("How many numbers do you have to input?");
		int totalNumberInputs = scanner.nextInt();
		double averageOfInputs=0;
		double sumOfInputs = 0;
		for(int input = 1; input <= totalNumberInputs; input = input + 1)
		{
			System.out.println("Please input number " + input);
			int number = scanner.nextInt();
			sumOfInputs = sumOfInputs + number;
		}
		scanner.close();

		averageOfInputs = sumOfInputs / totalNumberInputs;
		System.out.println("The average of your inputs is " + averageOfInputs);
	}
}