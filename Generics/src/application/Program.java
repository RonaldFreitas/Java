package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		Integer x = (Integer)ps.first();
		
		ps.print();
		System.out.println("First: " + x);
		
		sc.close();
	}

}
