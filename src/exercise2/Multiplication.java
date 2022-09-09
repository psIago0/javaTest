package exercise2;

import java.util.Scanner;

public class Multiplication {
	
	// Show the multiplication table of the chosen number
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int multiplication, number, i;
		
		System.out.print("Choose a number to see its multiplication table: ");
		number = sc.nextInt();
		sc.close();
		
		System.out.printf("\nThis is the multiplication table for number %d:\n", number);
		
		for(i=0; i!=10; i++) {
			multiplication = number * i;
			System.out.printf("%d x %d = %d\n", number, i, multiplication);
		}
		
	}

}
