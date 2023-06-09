package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product6;

public class Program6 { // Esse é o exercicio 5
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much number will you type? ");
		int n = sc.nextInt();
		
		Product6 vect[] = new Product6[n];
		
		double number = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Type a number: ");
			number = sc.nextDouble();
			vect[i] = new Product6(number);
		}
		
		int position = 0;
		double higher = vect[0].getNumber();
	    

	    for (int i=1; i<n; i++) {
	        if (vect[i].getNumber() > higher) {
	            higher = vect[i].getNumber();
	            position = i;
	        }
	    }
	    
	    System.out.println("Higher value = " + higher);
	    System.out.println("Position of the value = " + position);
		
		sc.close();
	}

}
