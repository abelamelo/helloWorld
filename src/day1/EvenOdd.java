package day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = scanner.nextInt();
		boolean val = evenNumber(num1);
		if(val)
		{
			System.out.println("the number is even");
		}else {
			System.out.println("the number is odd");
		}
		FirstAssignment assignment = new FirstAssignment();
		System.out.println(assignment.addTwoNumbers(num1, num1));
	}
   public static boolean evenNumber(int x) {
	   if(x%2 == 0) {
		   return true;
	   }
	return false;
	
	
}
}
