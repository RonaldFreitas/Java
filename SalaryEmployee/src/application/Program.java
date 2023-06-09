package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		Salary salary = new Salary();
		salary.Name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		salary.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		salary.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + salary);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		salary.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + salary);
		
		sc.close();
	}

}
