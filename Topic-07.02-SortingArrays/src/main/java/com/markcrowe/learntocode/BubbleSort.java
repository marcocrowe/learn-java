/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int array[] =
		{
			2, 15, 8, 4, 3, 1
		};
		System.out.println("Array before sort:" + Arrays.toString(array));
		bubbleSort(array);
		System.out.println("Array after sort: " + Arrays.toString(array));
	}
	private static void bubbleSort(int[] array)
	{
		for(int pass = 1; pass < array.length; pass++)
		{
			for(int index = 1; index <= array.length - pass; index++)
			{
				if(array[index - 1] > array[index])
					swapArrayElements(array, index - 1, index);
			}
		}
	}
	private static void swapArrayElements(int[] array, int lhsIndex, int rhsIndex)
	{
		int lhsElementCopy = array[lhsIndex];
		array[lhsIndex] = array[rhsIndex];
		array[rhsIndex] = lhsElementCopy;
	}
}
