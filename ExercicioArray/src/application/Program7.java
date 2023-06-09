package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product7;

public class Program7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much number will you type? ");
		int n = sc.nextInt();
		
		Product7 vect[] = new Product7[n];
		
		double number = 0;
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Type a number: ");
			number = sc.nextDouble();
			vect[i] = new Product7(number);
			sum += vect[i].getNumber();
		}
		
		double media = sum / vect.length;
		System.out.println("Media of the array = " + media);
		
		System.out.println("Elements under the media: ");
	    
	    for (int i = 0; i < vect.length; i++) {
			if(vect[i].getNumber() < media) {
				System.out.println(vect[i].getNumber());
			}
		}
		
		sc.close();
	}

}
