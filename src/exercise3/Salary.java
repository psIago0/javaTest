package exercise3;

import java.util.Scanner;

public class Salary {
	
	// Enter the salary and the readjustment
	
	public static double readjustment(double salary, double percentage) {
		double newSalary;
		
		percentage /= 100;
		
		newSalary = (salary * percentage) + salary;
		
		return newSalary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary, percentage, newSalary;
		
		System.out.print("Enter the employee's salary amount: ");
		salary = sc.nextDouble();
		
		System.out.print("Enter salary readjustment in percentage: ");
		percentage = sc.nextDouble();
		
		newSalary = readjustment(salary, percentage);
		
		System.out.printf("The adjusted salary is: R$%.2f", newSalary);
		
		sc.close();
	}

}
