package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product8;

public class Program8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much number will you type? ");
		int n = sc.nextInt();
		
		Product8 vect[] = new Product8[n];
		
		double number = 0;
		double sum = 0;
		double length = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Type a number: ");
			number = sc.nextDouble();
			vect[i] = new Product8(number);
			if (vect[i].getNumber() % 2 == 0) {
				sum += vect[i].getNumber();
				length ++;
			}
		}
		
		double media = sum / length;
	    
		if (sum != 0) {
					System.out.println("Media of the pair numbers = " + media);
		} else {
			System.out.println("Don't have pair numbers");
		}
	    
		
		sc.close();
	}

}
