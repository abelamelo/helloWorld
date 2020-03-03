package day1;

import java.util.Scanner;

public class FirstAssignment {

	public static void main(String[] args) {
     
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = scanner.nextInt();
		
		System.out.println("enter second number");
		int num2 = scanner.nextInt();
		
		int total = addTwoNumbers(num1,num2); 
		System.out.println("sum of "+ num1 +" and " +num2 + " is " + total);
		
		
	}

	public static int addTwoNumbers(int num1, int num2) {
		return num1+num2;
		
		
	}

}
