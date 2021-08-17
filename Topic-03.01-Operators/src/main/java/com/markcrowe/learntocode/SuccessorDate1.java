package com.markcrowe.learntocode;

import javax.swing.JOptionPane;

public class SuccessorDate1
{
	public static void main(String[] args)
	{
		String inputDay = JOptionPane.showInputDialog("Enter Day");
		String inputMonth = JOptionPane.showInputDialog("Enter Month");
		String inputYear = JOptionPane.showInputDialog("Enter Year");

		int d = Integer.parseInt(inputDay);
		int m = Integer.parseInt(inputMonth);
		int y = Integer.parseInt(inputYear);

		int ndays;

		// generate sucessor date
		// set ndays equal to the number of days in m
		if(m == 4 || m == 6 || m == 9 || m == 11)
			ndays = 30;
		else if(m == 2)
		{
			if(y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
				ndays = 29;
			else
				ndays = 28;
		}
		else
			ndays = 31;
		// use ndays to find sucessor date
		if(d < ndays)
			d++;
		else
		{
			d = 1;
			// new month and possibly new year
			if(m < 12)
				m++;
			else
			{
				m = 1;
				y++;
			}
		}
		JOptionPane.showMessageDialog(null, "Sucessor Date is " + d + "\\" + m + "\\" + y);
	}
}
