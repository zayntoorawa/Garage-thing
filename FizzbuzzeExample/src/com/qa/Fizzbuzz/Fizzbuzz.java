package com.qa.Fizzbuzz;

public class Fizzbuzz {

	public static void fizzbuzz(int num) {
		
		if (num % 3 == 0 && num % 5 ==0) {
			System.out.println("fizzbuzz");
		}
		
		else if (num % 3 == 0) {
			System.out.println("Fizz");
		}
		else if (num % 5 == 0) {
			System.out.println("Buzz");
			}
		else {
			System.out.println(num);
		}
			
		}
			
		
	}
	
