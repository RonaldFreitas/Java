package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BoardingHouse;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		BoardingHouse[] vect = new BoardingHouse[10];
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			vect[room] = new BoardingHouse(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		sc.close();
	}
}