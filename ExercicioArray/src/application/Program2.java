package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product2;

public class Program2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you type?");
		int n = sc.nextInt();
		Product2[] vect = new Product2[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Type a number:");
			double number = sc.nextDouble();
			vect[i] = new Product2(number);
		}
		
		System.out.print("Values = ");	
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i].getNumber());	
		}
		System.out.println("");
		
		double sum = 0;
		System.out.print("Sum = ");
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getNumber();
		}
		System.out.printf(" %.2f ", sum);
		System.out.println("");
		
		System.out.print("Media = ");
		double media = sum / vect.length;
		System.out.printf(" %.2f ", media);
		System.out.println("");
		
		
		
		sc.close();
	}

}
