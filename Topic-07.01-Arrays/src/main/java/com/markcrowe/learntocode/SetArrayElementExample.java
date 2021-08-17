/*
 * Copyright (c) 2021 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package com.markcrowe.learntocode;

public class SetArrayElementExample
{
	public static void main(String[] args)
	{
		System.out.println("Set Array Element Example");
		//
		//	declare and Initialize array
		//
		String[] programmingLanguages = new String[5];

		programmingLanguages[0] = "C#";
		programmingLanguages[1] = "C++";
		programmingLanguages[2] = "Java";
		programmingLanguages[3] = "PHP";
		programmingLanguages[4] = "VB";

		for(int index = 0; index < 5; index++)
			System.out.println(programmingLanguages[index]);
	}
}