/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.nationallotteryexercise;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods
{

	/**
	 * Check the `array` for candidateElement from 0 to upperLimit
	 * @param array The array to check
	 * @param candidateElement The element to check for
	 * @param upperLimit The upper limit of the array
	 * @return `true` if the element is found in the array.
	 */
	public static boolean isElementUnique(int[] array, final int candidateElement, final int upperLimit)
	{
		for(int index = 0; index < upperLimit; index++)
		{
			if(candidateElement == array[index])
				return false;
		}
		return true;
	}
	public static int randomNextIntFrom(final int minimum, final int maximum)
	{
		Random random = new Random();
		return random.nextInt(maximum) + minimum;
	}
	public static void sortArrays(final int[][] arrays)
	{
		for(int[] array : arrays)
			Arrays.sort(array);
	}
	public static String toString(final String[] stringArray, final int[] array, final int dimension1, final int dimension2Length)
	{
		final var builder = new StringBuilder(stringArray[dimension1] + "\t");
		for(int index = 0; index < dimension2Length; index++)
			builder.append(array[index]).append("\t");
		return builder.toString();
	}
	public static String toString(final String[] stringArray, final int[][] array, final int dimension1Length, final int dimension2Length)
	{
		final var builder = new StringBuilder();
		for(int index = 0; index < dimension1Length; index++)
			builder.append(ArrayMethods.toString(stringArray, array[index], index, dimension2Length)).append("\n");
		return builder.toString();
	}
	public static void toSystemOut(final String[] stringArray, final int[] array, final int dimension1, final int dimension2Length)
	{
		System.out.print(stringArray[dimension1] + "\t");
		for(int index = 0; index < dimension2Length; index++)
			System.out.print(array[index] + "\t");
	}
	public static void toSystemOut(final String[] stringArray, final int[][] array, final int dimension1Length, final int dimension2Length)
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