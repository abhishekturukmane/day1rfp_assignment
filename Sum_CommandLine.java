package com.bridgelabz;

//import java.util.Scanner;

public class Sum_CommandLine {

	public static void main(String[] args) {
		int sum=0;
		int count=0;
		System.out.println("Enter the numbers to do summation:");
	
		for(int i=0;i<args.length;i++)
		{
			try
			{
				System.out.println(args[i]);
				sum=sum +Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				count++;
			}
			
		}
		System.out.println("The sum of numbers :"+ sum);
		System.out.println("invalid Exception:"+count);
		
	}
}
