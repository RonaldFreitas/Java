package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Courses;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		Set<Courses> set = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			number = sc.nextInt();
			set.add(new Courses(number));
		}
	
		System.out.print("How many students for course B?");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			number = sc.nextInt();
			set.add(new Courses(number));
		}
	
		System.out.print("How many students for course C?");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			number = sc.nextInt();
			set.add(new Courses(number));
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
