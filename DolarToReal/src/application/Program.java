package application;

import java.util.Locale;
import java.util.Scanner;

import util.DolarConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DolarConverter reais = new DolarConverter();
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		DolarConverter.FinalPrice(price, quantity);
		
		System.out.println("Amount to be paid in reais: " + reais);
		
		sc.close();
	}

}
