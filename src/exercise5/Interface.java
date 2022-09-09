package exercise5;

import java.util.Locale;
import java.util.Scanner;

public class Interface {
	
	// Choose the geometric shap and calculate it's area
	
	public static void rectangle() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double base, height, area;
		
		System.out.print("Enter the rectangle's base: ");
		base = sc.nextDouble();
		
		System.out.print("Enter the rectangle's height: ");
		height = sc.nextDouble();
		
		area = base * height;
		
		System.out.printf("The are of this rectangle is: %.2f", area);
		
		sc.close();
	}
	
	public static void square() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double side, area;
		
		System.out.print("Enter the square's side: ");
		side = sc.nextDouble();
		
		area = side * side;
		
		System.out.printf("The are of this square is: %.2f", area);
		
		sc.close();
	}
	
	public static void triangle() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double base, height, area;
		
		System.out.print("Enter the triangle's base: ");
		base = sc.nextDouble();
		
		System.out.print("Enter the triangle's height: ");
		height = sc.nextDouble();
		
		area = base * height / 2;
		
		System.out.printf("The are of this triangle is: %.2f", area);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose which geometric shape you want to measure the area: \n"
				+ "1 - Rectangle\n"
				+ "2 - Square\n"
				+ "3 - Triangle\n"
				+ "Enter just the number.");
		int choice = sc.nextInt();
		
		if (choice == 1) {
			rectangle();
		}
		else if (choice == 2) {
			square();
		}
		else if (choice == 3) {
			triangle();
		}
		else {
			System.out.println("This number isn't configured. Try again");
		}
		
		sc.close();
	}

}
