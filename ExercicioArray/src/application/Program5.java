package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product5;

public class Program5 { //esse é o exercicio 6
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How much number will you type? ");
		int n = sc.nextInt();
		
		Product5 vect[] = new Product5[n];
		Product5 vect2[] = new Product5[n];
		Product5 p = new Product5();
		
		
		System.out.println("Type the values of the array A: ");
		int number = 0;
		for (int i = 0; i < vect.length; i++) {
			number = sc.nextInt();
			vect[i] = new Product5(number);
		}
		
		System.out.println();
		System.out.println("Type the values of the array B: ");
		double number2 = 0;
		for (int i = 0; i < vect.length; i++) {
			number2 = sc.nextDouble();
			vect2[i] = new Product5(number2);
		}
		
		System.out.println();
		System.out.println("Vetor resultante: ");
		
		int sum = 0;
		for (int i = 0; i < vect.length; i++) {
				sum = p.sum(vect[i].getNumber(), vect2[i].getNumber2());
				System.out.println(sum);
		}
		
		sc.close();
	}
}
