package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product3;

public class Program3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How much people will be type?");
		int n = sc.nextInt();
		Product3[] vectName = new Product3[n];
		Product3[] vectAge = new Product3[n];
		Product3[] vectHeight = new Product3[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Datas of person " + (i + 1) + ":");
			sc.nextLine();
			System.out.println("");
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Age:");
			int age = sc.nextInt();
			System.out.print("Height:");
			double height = sc.nextDouble();
			vectName[i] = new Product3(name);
			vectAge[i] = new Product3(age);
			vectHeight[i] = new Product3(height);
		}
		
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vectHeight[i].getHeight();
		}
		double media = sum / n;
		System.out.println("Media of height:" + media);
		
		int underAge = 0;
		for (int i = 0; i < n; i++) {
			if(vectAge[i].getAge() < 16) {
				underAge ++;
			}
		}
		double percentualMinor = ((double)underAge / n) * 100.0;
		System.out.println("People with minus than 16 year old: " + percentualMinor + "%");
		
		for (int i = 0; i < n; i++) {
			if(vectAge[i].getAge() < 16) {
				System.out.println(vectName[i].getName());
			}
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
