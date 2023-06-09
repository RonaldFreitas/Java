package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Grade;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		Grade grade = new Grade();
		grade.Name = sc.nextLine();
		
		System.out.print("Grade 1: ");
		grade.Grade1 = sc.nextDouble();
		
		System.out.print("Grade 2: ");
		grade.Grade2 = sc.nextDouble();
		
		System.out.print("Grade 3: ");
		grade.Grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(grade);
		
		sc.close();
	}	

}
