package com.bridgelabz;

public class Static_var {
	
	static int a= 20;
	
	static void run() {
		System.out.println("Running is a static method");
	}
	public static void main(String[] args) {
		
		//Static_var ob = new Static_var();
		Static_var.run(); //static method can be called using class name
		System.out.println("The value of static variable is :" + a);
	}
	
	
}
