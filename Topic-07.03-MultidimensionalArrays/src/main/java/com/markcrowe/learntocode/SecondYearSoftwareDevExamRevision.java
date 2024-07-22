/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import java.util.Arrays;

/**
 * Second Year Software Development Exam Revision ‎2019.‎11\‎Nov.‎04,
 */
public class SecondYearSoftwareDevExamRevision
{
	public static void main(String[] args)
	{
		examRevisionB();
		examRevisionH();
	}
	public static void examRevisionI()
	{
		int[][] arrays = new int[6][6];
		for(int j = 0; j < arrays.length; j++)
		{
			int[] row = arrays[j];

			int total = 0;
			for(int i = 0; i < row.length; i++)
			{
				total += row[i];
			}
			System.out.print("row total " + total);
		}
	}
	public static void examRevisionIa()
	{
		int[] arrays = new int[6];
		int total = 0;
		for(int i = 0; i < arrays.length; i++)
		{
			total += arrays[i];
		}
		System.out.print("row total " + total);
	}
	public static void examRevisionH()
	{
		int[][] a =
		{
			{
				1, 2, 3
			},
			{
				4,
				5, 6, 9
			},
			{
				7
			}
		};
		int[] row = a[1];
		System.out.println(Arrays.toString(a[0]));
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(row.length);
		System.out.println(a[2].length);
		System.out.println(Arrays.toString(a[2]));
		//System.out.println((a[2][1]));  // not such element
	}
	public static void examRevisionG()
	{
		int twoArray[][] = new int[3][4];
	}
	public static void examRevisionF()
	{
		int x = multiply(10, 25, 35);
		System.out.println(x);
	}
	public static int multiply(int x, int y, int z)
	{
		return x * y * z;
	}
	//E1 scope demo
	static int i = 1, j = 2;
	public static void examRevisionE1()
	{
		j = 5;
	}
	public static void examRevisionE()
	{
		int i = 1;
		int j = 2;
		int sum = i + j;
		//Reuse
		//encapsulation of responsibility, ideally one method is responsible for one task
		// single responsibility
		//scope and (isolation) protection of variables and data
	}

	public static void examRevisionB()
	{

		int[] numbers =
		{
			0, 1, 2, 3, 4, 5, 6
		};
		System.out.println(numbers.length);
		String array[] = new String[7];
		String days[] =
		{
			"MON", "TUE", "WED"
		};
		int[][] d2 =
		{
			{
				1, 2
			},
			{
				3, 4
			}
		};
		System.out.println(Arrays.toString(d2[0]));
		System.out.println(Arrays.toString(d2[1]));
		System.out.println(Arrays.toString(days));
	}
}