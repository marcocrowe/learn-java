/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class ComputeChange
{
	public static void main(final String[] args)
	{
		var computeChange = new ComputeChange();
		computeChange.output(computeChange.computer(788));
	}
	/**
	 * coin Denominations sorted in descending order
	 */
	private final int[] coinDenominations = new int[]
	{
		200, 100, 50, 20, 10, 5, 2, 1
	};

	public int[] computer(int amountCents)
	{
		final int[] coinsCount = new int[coinDenominations.length];

		for(int index = 0; index < this.coinDenominations.length; index++)
		{
			coinsCount[index] = amountCents / coinDenominations[index];
			// amountCents = amountCents - (coinsCount[index]*coinDenominations[index]);
			amountCents = amountCents % coinDenominations[index];
		}
		return coinsCount;

	}

	public void output(final int[] coinsCount)
	{
		for(int index = 0; index < coinsCount.length; index++)
		{
			if(index < 2)
				System.out.println(coinsCount[index] + " €" + (coinDenominations[index] / 100) + "coins");
			else
				System.out.println(coinsCount[index] + " " + (coinDenominations[index]) + "cent coins");
		}
	}
}
