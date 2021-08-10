package com.markcrowe;

import javax.swing.JOptionPane;

public class SucessorDate2
{
	public static int getDaysInMonth(int month, int year)
	{
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else if (month == 2)
		{
			if (isLeapYear(year))
				return 29;
			else
				return 28;
		}
		else
			return 31;
	}
	public static boolean isLeapYear(int year)
	{
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
	public static void main(String[] args)
	{
		int day = Integer.parseInt(JOptionPane.showInputDialog("Enter Day"));
		int month = Integer.parseInt(JOptionPane.showInputDialog("Enter Month"));
		int year = Integer.parseInt(JOptionPane.showInputDialog("Enter Year"));

		int daysInMonth = getDaysInMonth(month , year);

		if (day < daysInMonth)
			day++;
		else {
			day = 1;
			if (month < 12)
				month++;
			else {
				month = 1;
				year++;
			}
		}
		JOptionPane.showMessageDialog(null, "Sucessor Date is " + day + "\\" + month + "\\" + year);
	}
}