package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product9;

public class Program9 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How much people will be type?");
		int n = sc.nextInt();
		Product9[] vectName = new Product9[n];
		Product9[] vectAge = new Product9[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Datas of person " + (i + 1) + ":");
			sc.nextLine();
			System.out.println("");
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Age:");
			int age = sc.nextInt();
			vectName[i] = new Product9(name);
			vectAge[i] = new Product9(age);
		}
		
		String oldestName = null;
		double oldest = vectAge[0].getAge();
	    

	    for (int i=1; i<n; i++) {
	        if (vectAge[i].getAge() > oldest) {
	            oldest = vectAge[i].getAge();
	            oldestName = vectName[i].getName();
	        }
	    }		
	    
	    System.out.println("The oldest person: " + oldestName);
		
		sc.close();
	}
}
