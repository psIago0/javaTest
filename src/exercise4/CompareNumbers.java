package exercise4;

import java.util.Scanner;

public class CompareNumbers {
	
	// Compare if the number is greater, lower or equal

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Enter the first number: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter the second one: ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("The first number is greater");
		}
		else if(num1 < num2) {
			System.out.println("The second number is greater");
		}
		else {
			System.out.println("The numbers are the same");
		}
		
		sc.close();
	}

}
