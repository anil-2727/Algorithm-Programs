package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		String[] integerArray = utility.prime(1000);

		// printing the array
		for (String string : integerArray) {
			System.out.println(string);
		}
	}

}
