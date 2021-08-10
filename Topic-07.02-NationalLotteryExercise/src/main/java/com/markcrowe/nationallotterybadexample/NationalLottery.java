/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.nationallotterybadexample;

import java.util.Random;

public class NationalLottery
{
	private static final int drawSize = 50000;
	public static void main(String[] args)
	{
		//  Step 1
		NationalLottery.CreateLottoTickets();
		//  Step 2
		NationalLottery.DisplayTickets();
		//  Step 4
		NationalLottery.NumberAnalysisRunAndPrint();
		//  Step 3
		NationalLottery.FindAndDisplayWinners();
	}
	public static void CreateLottoTickets()
	{
		int index = 0;
		//
		//  Test
		//
		//One Winner
		CreateWiningLottoTicket(index);
		index++;
		//  Many Winners
		//CreateWiningLottoTicket(index);
		//index++;
		//
		//  End Test
		//
		for(; index < drawSize; index++)
		{
			CreateLottoTicket(index);
		}
		Support.SortArrayRowNumbers(lottoTicketsNumbers);

	}
	private static void CreateLottoTicket(int index)
	{
		lottoTicketsCodes[index] = CreateLottoTicketCode();
		CreateLottoTicketNumbers(index);
	}
	public static String CreateLottoTicketCode()
	{
		String output = "";
		int digitNumber = 2;
		int characterNumber = 4;
		for(int index = 0; index < digitNumber; index++)
		{
			int candiateElement = (new Random()).nextInt(10);
			output += candiateElement;
		}
		for(int index = 0; index < characterNumber; index++)
		{
			int charIndex = new Random().nextInt(characterCode.length);
			String candiateElement = characterCode[charIndex];
			output += candiateElement;
		}
		return output;
	}
	public static void CreateLottoTicketNumbers(int rowIndex)
	{
		for(int index = 0; index < numberPickSize;)
		{
			int candiateElement = Support.RandomNextIntFrom(numberRangerLowerLimit, numberRangerUpperLimit);
			if(Support.ArrayElementsAreUnique(lottoTicketsNumbers, rowIndex, candiateElement, index))
			{
				lottoTicketsNumbers[rowIndex][index] = candiateElement;
				index++;
			}
		}
	}
	private static void CreateWiningLottoTicket(int rowIndex)
	{
		lottoTicketsCodes[rowIndex] = CreateLottoTicketCode();
		for(int index = 0; index < numberPickSize; index++)
		{
			int candiateElement = winningNumbers[index];
			lottoTicketsNumbers[rowIndex][index] = candiateElement;
		}
		/*
		 * //
		 * // Testing Unsorted Numbers can be sorted and win
		 * //
		 * int temp = lottoTicketsNumbers[rowIndex][2] ;
		 * lottoTicketsNumbers[rowIndex][2] = lottoTicketsNumbers[rowIndex][4];
		 * lottoTicketsNumbers[rowIndex][4] = temp;
		 */
	}
	public static void DisplayTickets()
	{
		System.out.println("Displaying Tickets");
		Support.ArraysToOut(lottoTicketsCodes, lottoTicketsNumbers, drawSize, numberPickSize);
		//System.out.print(Support.ArraysToString(lottoTicketsCodes, lottoTicketsNumbers, drawSize, numberPickSize));
		System.out.println();
	}
	public static void FindAndDisplayWinners()
	{
		String output = "";
		for(int index = 0; index < drawSize; index++)
		{
			if(TicketHasWon(index))
			{
				output += Support.ArraysDimension2ToString(lottoTicketsCodes, lottoTicketsNumbers, index, numberPickSize) + "\n";
			}
		}
		if(output.equals(""))
			output = "There are no winners" + "\n";
		else
			output = ("The following tickets have won" + "\n") + output;
		System.out.print(output);
		System.out.println();
	}
	public static boolean TicketHasWon(int rowIndex)
	{
		for(int index = 0; index < numberPickSize; index++)
		{
			if(lottoTicketsNumbers[rowIndex][index] != winningNumbers[index])
				return false;
		}
		return true;
	}
	public static void NumberAnalysis(int[] analysis)
	{
		for(int ticketIndex = 0; ticketIndex < drawSize; ticketIndex++)
		{
			for(int numberIndex = 0; numberIndex < numberPickSize; numberIndex++)
			{
				int number = lottoTicketsNumbers[ticketIndex][numberIndex];
				analysis[number - 1] += 1;
			}
		}
	}
	public static String NumberAnalysisPrint(int[] analysis)
	{
		String outString = "";
		for(int index = 0; index < analysis.length; index++)
		{
			outString += (index + 1) + " was drawn " + analysis[index] + " times" + "\n";
		}
		return outString;

	}
	public static void NumberAnalysisRunAndPrint()
	{
		int[] analysis = new int[numberRangerUpperLimit];
		NumberAnalysis(analysis);
		System.out.println("Number Analysis");
		System.out.print(NumberAnalysisPrint(analysis));
		System.out.println();

	}
	private static final int numberPickSize = 6;
	private static final int numberRangerLowerLimit = 1;
	private static final int numberRangerUpperLimit = 45;
	private static final String[] lottoTicketsCodes = new String[drawSize];
	private static final int[][] lottoTicketsNumbers = new int[drawSize][numberPickSize];
	private static final int[] winningNumbers =
	{
		4, 10, 23, 36, 40, 42
	};
	private static final String[] characterCode =
	{
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

}
