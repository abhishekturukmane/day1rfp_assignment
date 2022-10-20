package com.bridgelabz;

import java.util.Scanner;

public class Name_Of_User {

		public static void main(String[] args) {
			Scanner obj = new Scanner(System.in);
			
			String lastname;
			System.out.println("Enter your last name:");
			
			lastname= obj.next();
			
			System.out.println("Lastname:"+ lastname);
			
			obj.close();
		}
}
