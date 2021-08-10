package com.markcrowe;

import javax.swing.JOptionPane;

public class ChineseZodiacExercise
{
	public static void main(String[] args)
	{
		displayChineseZodiac(2001);
	}
	public static void displayChineseZodiac(int year)
	{
		int zodiac = year % 12;

		switch(zodiac)
		{
			case (0):
				JOptionPane.showMessageDialog(null, "The Year of the Monkey");
				break;
			case (1):
				JOptionPane.showMessageDialog(null, "The Year of the Rooster");
				break;
			case (2):
				JOptionPane.showMessageDialog(null, "The Year of the Dog");
				break;
			case (3):
				JOptionPane.showMessageDialog(null, "The Year of the Pig");
				break;
			case (4):
				JOptionPane.showMessageDialog(null, "The Year of the Rat");
				break;
			case (5):
				JOptionPane.showMessageDialog(null, "The Year of the Ox");
				break;
			case (6):
				JOptionPane.showMessageDialog(null, "The Year of the Tigger");
				break;
			case (7):
				JOptionPane.showMessageDialog(null, "The Year of the Rabbit");
				break;
			case (8):
				JOptionPane.showMessageDialog(null, "The Year of the Dragon");
				break;
			case (9):
				JOptionPane.showMessageDialog(null, "The Year of the Snake");
				break;
			case (10):
				JOptionPane.showMessageDialog(null, "The Year of the Horse");
				break;
			case (11):
				JOptionPane.showMessageDialog(null, "The Year of the Sheep");
				break;
			default:
				JOptionPane.showMessageDialog(null, "An Exception has occuered");
				break;
		}
	}
}
