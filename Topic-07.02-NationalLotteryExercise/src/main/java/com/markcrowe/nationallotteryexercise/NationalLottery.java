/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.nationallotteryexercise;

import java.util.Random;

public class NationalLottery
{
	public static void main(String[] args)
	{
		createLottoTickets();
		displayTickets();
		runAndPrintNumberAnalysis();
		findAndDisplayWinners();
	}
	/* Methods */
	public static String buildNumberAnalysisReport(int[] analysis)
	{
		StringBuilder builder = new StringBuilder();
		for(int index = 0; index < analysis.length; index++)
			builder.append(index + 1).append(" was drawn ").append(analysis[index]).append(" times\n");

		return builder.toString();
	}
	public static void createLottoTickets()
	{
		int index = 0;
		/* Begin Test */

		//One Winner
		createWiningLottoTicket(index);
		index++;

		//Many Winners
		//createWiningLottoTicket(index);
		//index++;

		/* End Test */
		for(; index < drawSize; index++)
			createLottoTicket(index);

		ArrayMethods.sortArrayRows(lottoTicketsNumbers);

	}
	public static void createLottoTicket(int index)
	{
		lottoTicketsCodes[index] = createLottoTicketCode();
		createLottoTicketNumbers(index);
	}
	public static String createLottoTicketCode()
	{
		StringBuilder builder = new StringBuilder();
		int digitNumber = 2;
		int characterNumber = 4;

		for(int index = 0; index < digitNumber; index++)
		{
			int candidateElement = (new Random()).nextInt(10);
			builder.append(candidateElement);
		}
		for(int index = 0; index < characterNumber; index++)
		{
			int charIndex = new Random().nextInt(characterCodes.length);

			String candidateElement = characterCodes[charIndex];
			builder.append(candidateElement);
		}
		return builder.toString();
	}
	public static void createLottoTicketNumbers(int rowIndex)
	{
		for(int index = 0; index < numberPickSize;)
		{
			int candidateElement = ArrayMethods.randomNextIntFrom(numberRangerLowerLimit, numberRangerUpperLimit);

			if(ArrayMethods.isElementUnique(lottoTicketsNumbers, rowIndex, candidateElement, index))
			{
				lottoTicketsNumbers[rowIndex][index] = candidateElement;
				index++;
			}
		}
	}
	public static void createWiningLottoTicket(int ticketIndex)
	{
		lottoTicketsCodes[ticketIndex] = createLottoTicketCode();

		for(int index = 0; index < numberPickSize; index++)
		{
			int candidateElement = winningNumbers[index];

			lottoTicketsNumbers[ticketIndex][index] = candidateElement;
		}
		/*
		 * Testing Unsorted Numbers can be sorted and win
		 *
		 * int temp = lottoTicketsNumbers[ticketIndex][2] ;
		 * lottoTicketsNumbers[ticketIndex][2] = lottoTicketsNumbers[ticketIndex][4];
		 * lottoTicketsNumbers[ticketIndex][4] = temp;
		 */
	}
	public static void displayTickets()
	{
		System.out.println("Displaying Tickets");
		ArrayMethods.toSystemOut(lottoTicketsCodes, lottoTicketsNumbers, drawSize, numberPickSize);
		//System.out.print(ArrayMethods.toString(lottoTicketsCodes, lottoTicketsNumbers, drawSize, numberPickSize));
		System.out.println();
	}
	public static void findAndDisplayWinners()
	{
		String output = "";

		for(int ticketIndex = 0; ticketIndex < drawSize; ticketIndex++)
		{
			if(isWinningTicket(ticketIndex))
				output += ArrayMethods.toString(lottoTicketsCodes, lottoTicketsNumbers[ticketIndex], ticketIndex, numberPickSize) + "\n";
		}

		if(output.equals(""))
			output = "There are no winners\n";
		else
			output = "The following tickets have won\n" + output;

		System.out.print(output);
		System.out.println();
	}
	public static boolean isWinningTicket(int ticketIndex)
	{
		for(int index = 0; index < numberPickSize; index++)
		{
			if(lottoTicketsNumbers[ticketIndex][index] != winningNumbers[index])
				return false;
		}
		return true;
	}
	public static void runAndPrintNumberAnalysis()
	{
		int[] analysis = new int[numberRangerUpperLimit];
		runNumberAnalysis(analysis);
		System.out.println("Number Analysis");
		System.out.print(buildNumberAnalysisReport(analysis));
		System.out.println();
	}
	public static void runNumberAnalysis(int[] analysis)
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
	/* Fields */
	private static final String[] characterCodes =
	{
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};
	private static final int drawSize = 50;//00;
	private static final int numberPickSize = 6;
	private static final String[] lottoTicketsCodes = new String[drawSize];
	private static final int[][] lottoTicketsNumbers = new int[drawSize][numberPickSize];
	private static final int numberRangerLowerLimit = 1;
	private static final int numberRangerUpperLimit = 45;
	private static final int[] winningNumbers =
	{
		4, 10, 23, 36, 40, 42
	};
}
