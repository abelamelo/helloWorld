package day1;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number");
		int num1 = scanner.nextInt();
		EvenOdd evenOdd = new EvenOdd();
		for(int i = 1; i<=num1; i++) {
			if(evenOdd.evenNumber(i))
			{
				System.out.println(i);	
			}
			
		}

	}

}
