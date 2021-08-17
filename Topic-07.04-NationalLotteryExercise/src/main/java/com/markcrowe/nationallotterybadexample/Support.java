/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.nationallotterybadexample;

import java.util.Arrays;
import java.util.Random;

public class Support
{
	public static String ArraysToString(String[] stringArray, int[][] array, int dimension1Length, int dimension2Length)
	{
		String outString = "";
		for(int index = 0; index < dimension1Length; index++)
		{
			outString += ArraysDimension2ToString(stringArray, array, index, dimension2Length) + "\n";
		}
		return outString;
	}
	public static String ArraysDimension2ToString(String[] stringArray, int[][] array, int dimension1, int dimension2Length)
	{
		String outString = "";
		outString += stringArray[dimension1] + "\t";
		for(int index = 0; index < dimension2Length; index++)
		{
			outString += array[dimension1][index] + "\t";
		}
		return outString;
	}
	public static void ArraysToOut(String[] stringArray, int[][] array, int dimension1Length, int dimension2Length)
	{
		for(int index = 0; index < dimension1Length; index++)
		{
			ArraysDimension2ToOut(stringArray, array, index, dimension2Length);
			System.out.println();
		}
	}
	public static void ArraysDimension2ToOut(String[] stringArray, int[][] array, int dimension1, int dimension2Length)
	{
		System.out.print(stringArray[dimension1] + "\t");
		for(int index = 0; index < dimension2Length; index++)
		{
			System.out.print(array[dimension1][index] + "\t");
		}
	}
	public static void SortArrayRowNumbers(int[][] array)
	{
		for(int[] row : array)
			Arrays.sort(row);
	}
	public static int RandomNextIntFrom(int minium, int maxium)
	{
		Random random = new Random();
		int number = random.nextInt(maxium) + minium;
		return number;
	}
	public static boolean ArrayElementsAreUnique(int[][] array, int rowIndex, int candidateElement, int upperLimit)
	{
		boolean result = true;
		for(int index = 0; index < upperLimit; index++)
		{
			if(candidateElement == array[rowIndex][index])
			{
				result = false;
				break;
			}
		}
		return result;
	}
}