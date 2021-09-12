/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import java.util.Scanner;

public class WhatDoesThisCodeDo
{
	public static void main(String[] args)
	{
		System.out.println("What does this code do?");

		final var sc = new Scanner(System.in);
		System.out.println("No Clues?");
		int c = sc.nextInt();
		double a = 0;
		double s = 0;
		for(int i = 1; i <= c; i = i + 1)
		{
			System.out.println("No Clues " + i);
			int n = sc.nextInt();
			s = s + n;
		}
		sc.close();
		a = s / c;
		System.out.println("NO CLUES! " + a);
	}
}