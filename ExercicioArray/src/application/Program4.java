package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product4;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		Product4 vect[] = new Product4[n];
		
		int number = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			number = sc.nextInt();
			vect[i] = new Product4(number);
		}
		
		System.out.println("Números pares: ");
		
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getNumber() % 2 == 0) {
				System.out.print(vect[i].getNumber() + " ");
				count++;
			}
		}
		
		System.out.println();
		System.out.print("Quantidade de pares = " + count);
		
		sc.close();
	}

}
