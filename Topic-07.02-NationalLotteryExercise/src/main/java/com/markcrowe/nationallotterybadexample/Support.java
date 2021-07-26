/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.nationallotterybadexample;

import java.util.Arrays;
import java.util.Random;

public class Support
{
	public static String ArraysToString(String[] stringArray, int[][] array, int diminsion1Length, int diminsion2Length)
	{
		String outString = new String();

		for(int index = 0; index < diminsion1Length; index++)
		{
			outString += ArraysDiminsion2ToString(stringArray, array, index, diminsion2Length) + "\n";
		}

		return outString;
	}
	public static String ArraysDiminsion2ToString(String[] stringArray, int[][] array, int diminsion1, int diminsion2Length)
	{
		String outString = new String();

		outString += stringArray[diminsion1] + "\t";

		for(int index = 0; index < diminsion2Length; index++)
		{
			outString += array[diminsion1][index] + "\t";
		}

		return outString;
	}
	public static void ArraysToOut(String[] stringArray, int[][] array, int diminsion1Length, int diminsion2Length)
	{
		for(int index = 0; index < diminsion1Length; index++)
		{
			ArraysDiminsion2ToOut(stringArray, array, index, diminsion2Length);
			System.out.println();
		}
	}
	public static void ArraysDiminsion2ToOut(String[] stringArray, int[][] array, int diminsion1, int diminsion2Length)
	{

		System.out.print(stringArray[diminsion1] + "\t");

		for(int index = 0; index < diminsion2Length; index++)
		{
			System.out.print(array[diminsion1][index] + "\t");
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
	public static boolean ArrayElementsAreUnique(int[][] array, int rowIndex, int candiateElement, int upperLimit)
	{
		boolean result = true;
		for(int index = 0; index < upperLimit; index++)
		{
			if(candiateElement == array[rowIndex][index])
			{
				result = false;
				break;
			}
		}
		return result;
	}
}
