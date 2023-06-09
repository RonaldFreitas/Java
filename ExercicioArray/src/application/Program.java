package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you type?");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Type a number:");
			double number = sc.nextDouble();
			vect[i] = new Product(number);
		}
		
		System.out.println("Negative numbers:");	
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getNumber() < 0) {
			System.out.println(vect[i].getNumber());	
			}
		}
		
		sc.close();
	}

}
