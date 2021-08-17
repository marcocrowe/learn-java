/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import javax.swing.JOptionPane;

public class BubbleSortLectureExample
{
	public static void main(String args[])
	{
		int array[] = { 2, 15, 8, 3, 4, 1 };
		String output = "Data items in original order\n";
		// append original array values to String output
		for(int counter = 0; counter < array.length; counter++)
			output += "   " + array[counter];
		bubbleSort(array);  // sort array     (method call)
		output += "\n\nData items in ascending order\n";
		// append sorted\ array values to String output
		for(int counter = 0; counter < array.length; counter++)
			output += "   " + array[counter];
		JOptionPane.showMessageDialog(null, output);
	}
	// sort elements of array with bubble sort
	public static void bubbleSort(int array2[])
	{
		// loop to control number of passes
		for(int pass = 1; pass < array2.length; pass++)
		{
			// loop to control number of comparisons
			for(int element = 0; element < array2.length - 1; element++)
			{
				// compare side-by-side elements and swap them if
				// first element is greater than second element
				if(array2[element] > array2[element + 1])
					swap(array2, element, element + 1);//     (method call to swap method)
			}  // end loop to control comparisons
		}  // end loop to control passes
	}  // end method bubbleSort
	// swap two elements of an array
	public static void swap(int array3[], int first, int second)
	{
		int hold;  // temporary holding area for swap
		hold = array3[first];
		array3[first] = array3[second];
		array3[second] = hold;
	}
}  // end class BubbleSort