package com.bridgelabz;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a year: ");
		
		long year=s.nextLong();
		if(year % 400 == 0 || (year % 4 ==0 && year % 100 != 0))
		{
			System.out.println("leap Year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}
		
		s.close();
	}
}
