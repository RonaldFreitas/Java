package curso_programacao;

import java.util.Locale;

import java.util.Scanner;

public class ExercicioFinal2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y, pi;
		
		x = sc.nextDouble();
		y = 2.0;
		pi = 3.14159;
		double potencia = Math.pow(x,y);
		double area = pi * potencia;
		System.out.printf("A = %.4f%n", area);
		sc.close();
	}
}
