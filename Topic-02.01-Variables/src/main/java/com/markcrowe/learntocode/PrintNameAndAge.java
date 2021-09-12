/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class PrintNameAndAge
{
	public static void main(String[] args)
	{
		int age = 35;
		String name = "Homer";
		int years = 5;

		int futureAge = age + years;

		/* Way 1 */
		System.out.println("My name is " + name
				+ ". My age is " + age
				+ ". In " + years + " years I will be " + futureAge + ".");
		/* Way 2 */
		String outputText = "My name is " + name
				+ ". My age is " + age
				+ ". In " + years + " years I will be " + futureAge + ".";
		System.out.println(outputText);
	}
}