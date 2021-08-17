/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

import javax.swing.JOptionPane;

/**
 * Fares for Bus Éireann Limerick city services
 * Standard cash fares for trips up to 7.5km
 * Adult: €2.40
 * Child: €1.40
 * @see https://www.limericktransport.info/2016/09/bus-fares-prices-tickets-where-to-buy-bus-tickets.html
 */
public class BusFaresAgeExample
{
	public static void main(String[] args)
	{
		String ageInput = JOptionPane.showInputDialog("What age are you?");
		int age = Integer.parseInt(ageInput);
		if(age >= 18)
			System.out.println("Your bus fair is: €2.40");
		else
			System.out.println("Your bus fair is: €1.40");
	}
}
