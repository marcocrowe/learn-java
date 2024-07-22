//Create and initialise a two-dimensional int array with 10 rows and 15 columns. Each element in
//the array is to be initialised to a random value in the range 1 – 100. However, you must ensure
//the following.
// All elements in row 2 must be multiples of 2.
// All elements in row 3 must be multiples of 3.
// All elements in row 4 must be multiples of 4 etc..
//There is no restriction on the values that can be stored in row 0 or row 1. You can just
//initialise the elements in these rows to values in the range 1 – 100.
package com.markcrowe;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayAssignment1
{

	public static void main(String[] args)
	{

		int[][] initializeArray = initArray(10, 15);

		print(initializeArray);
		printAdjacentSum(20, initializeArray);

	}

	private static int[][] initArray(int row, int col)
	{
		int min = 1;
		int max = 100;
		int randomNum = 0;

		int[][] table = new int[row][col];
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{

				randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

				table[i][j] = randomNum;
			}

		}
		return table;

	}

	public static void print(int[][] array)
	{
		for(int[] array1 : array)
		{
			for(int j = 0; j < array.length; j++)
			{
				System.out.print(array1[j] + "\t");
			}
			System.out.println();
		}
	}
	//attempt
	private static void printAdjacentSum(int x, int[][] array)
	{

		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length; j++)
			{
				if(array[i][j] == x)
				{
					System.out.println("Print indexes" + array[i][j]);
				}

			}
		}
	}
}
