package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.DatasBank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter account number:");
		int accountNumber = sc.nextInt();	
		
		System.out.print("Enter account holder:");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)?");
		char choose = sc.next().charAt(0);
		
		double balance;
		
		if(choose == 'y') {
			System.out.print("Enter initial deposit value:");
			balance = sc.nextDouble();
		} else {
			balance = 0;
		}
		
		DatasBank bank = new DatasBank(accountNumber, accountHolder, balance);
		System.out.println();
		System.out.println("Account data: \r\n" + bank);
		
		System.out.println();
		System.out.print("Enter a deposit value:");
		double deposit = sc.nextDouble();
		bank.deposit(deposit);
		System.out.println("Updated account data: \r\n" + bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		System.out.println("Updated account data: \\r\\n" + bank);
		
		sc.close();
	}

}
