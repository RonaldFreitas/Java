package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) { 
			System.out.println("Shape #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new LegalPerson(name, anualIncome, numberOfEmployees));
			} else {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PhysicalPerson(name, anualIncome, healthExpenditures));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(Person p : list) {
			System.out.println(p.toString());
		}
		
		double sum = 0.0;
		
		for(Person p : list) {
			sum += p.taxes();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: %.2f", sum);
		
		sc.close();
	}

}
