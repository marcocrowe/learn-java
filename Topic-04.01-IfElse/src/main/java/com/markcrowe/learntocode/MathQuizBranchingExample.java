/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import javax.swing.JOptionPane;

public class MathQuizBranchingExample
{
	public static void main(String[] args)
	{
		/* Get String Input from user */
		String number1Input = JOptionPane.showInputDialog("Enter a number");
		/* Parse input to Integer number */
		int number1 = Integer.parseInt(number1Input);
		/* Get String Input from user */
		String number2Input = JOptionPane.showInputDialog("Enter a number");
		/* Parse String Input to Integer number */
		int number2 = Integer.parseInt(number2Input);

		/* Get String Input from user */
		String userAnswerInput = JOptionPane.showInputDialog("What is " + number1 + " * " + number2 + " = ");
		/* Parse String Input to Integer number */
		int userAnswer = Integer.parseInt(userAnswerInput);

		/* Calculations */
		int answer = number1 * number2;
		/* if else example */
		if(userAnswer == answer)
			System.out.println("Correct: " + number1 + " * " + number2 + " = " + answer);
		else
			System.out.println(userAnswer + "is not Incorrect. The correct answer : " + number1 + " * " + number2 + " = " + answer);
	}
}
