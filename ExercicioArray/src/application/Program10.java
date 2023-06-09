package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product10;

public class Program10 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How much students will be type?");
		int n = sc.nextInt();
		Product10[] vectName = new Product10[n];
		Product10[] vectGrade = new Product10[n];
		Product10[] vectGrade2 = new Product10[n];
		Product10 p= new Product10();

		for (int i = 0; i < n; i++) {
			System.out.println("Type the name, the first and second grade of the " + (i + 1) + "º student: ");
			sc.nextLine();
			String name = sc.nextLine();
			double grade = sc.nextDouble();
			double grade2 = sc.nextDouble();
			vectName[i] = new Product10(name);
			vectGrade[i] = new Product10(grade);
			vectGrade2[i] = new Product10(grade2, 0);			
		}
		
		System.out.println("Alunos aprovados: ");
		
	    for (int i=0; i < n; i++) {
	    	double media = p.media(vectGrade[i].getGrade(), vectGrade2[i].getGrade2());
			if (media >= 6) {
	            System.out.println(vectName[i].getName());
	        }
	    }
		
		sc.close();
	}
}
