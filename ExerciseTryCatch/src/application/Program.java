package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Account data: ");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			Account ac = new Account(number, holder, balance, withdrawLimit);
			ac.withdraw(amount);
			
			System.out.println("New balance: " + String.format("%.2f",ac.getBalance()));
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
