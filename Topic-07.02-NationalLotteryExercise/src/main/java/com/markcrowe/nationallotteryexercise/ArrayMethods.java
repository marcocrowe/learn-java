/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.nationallotteryexercise;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods
{
	public static boolean isElementUnique(int[][] array, int rowIndex, int candidateElement, int upperLimit)
	{
		for(int index = 0; index < upperLimit; index++)
		{
			if(candidateElement == array[rowIndex][index])
				return false;
		}
		return true;
	}
	public static int randomNextIntFrom(int minimum, int maxim)
	{
		Random random = new Random();
		return random.nextInt(maxim) + minimum;
	}
	public static void sortArrayRows(int[][] array)
	{
		for(int[] row : array)
			Arrays.sort(row);
	}
	public static String toString(String[] stringArray, int[] array, int dimension1, int dimension2Length)
	{
		StringBuilder builder = new StringBuilder(stringArray[dimension1] + "\t");
		for(int index = 0; index < dimension2Length; index++)
			builder.append(array[index]).append("\t");
		return builder.toString();
	}
	public static String toString(String[] stringArray, int[][] array, int dimension1Length, int dimension2Length)
	{
		StringBuilder builder = new StringBuilder();
		for(int index = 0; index < dimension1Length; index++)
			builder.append(ArrayMethods.toString(stringArray, array[index], index, dimension2Length)).append("\n");
		return builder.toString();
	}
	public static void toSystemOut(String[] stringArray, int[] array, int dimension1, int dimension2Length)
	{
		System.out.print(stringArray[dimension1] + "\t");
		for(int index = 0; index < dimension2Length; index++)
			System.out.print(array[index] + "\t");
	}
	public static void toSystemOut(String[] stringArray, int[][] array, int dimension1Length, int dimension2Length)
	{
		for(int index = 0; index < dimension1Length; index++)
		{
			toSystemOut(stringArray, array[index], index, dimension2Length);
			System.out.println();
		}
	}
	/* Add a private constructor to hide the implicit public one for classes with only static members */
	private ArrayMethods()
	{
	}
}