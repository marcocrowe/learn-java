/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class ThePostIncrementOperator
{
	public static void main(String[] args)
	{
		System.out.println("The Post Increment Operator");

		int number1 = 1;
		System.out.println("number1=" + number1);
		System.out.println("execute: number1 = number1 + 1;");
		number1 = number1 + 1;
		System.out.println("number1=" + number1);

		int number2 = 1;
		System.out.println("number2=" + number2);
		System.out.println("execute: number2++;");
		number2++;
		System.out.println("number2=" + number2);
	}
}
