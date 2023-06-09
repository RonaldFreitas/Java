package curso_programacao;

import java.util.Locale;

import java.util.Scanner;

public class ExercicioFinal6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		double triangulo = (A * C)/2;
		System.out.printf("Triângulo: %.3f%n", triangulo);
		double pi = 3.14159;
		double circulo = Math.pow(C, 2) * pi;
		System.out.printf("Círculo: %.3f%n", circulo);
		double trapezio = ((A + B)* C)/2;
		System.out.printf("Trapézio: %.3f%n", trapezio);
		double quadrado = B * B;
		System.out.printf("Quadrado: %.3f%n", quadrado);
		double retangulo = A * B;
		System.out.printf("Retângulo: %.3f%n", retangulo);
		sc.close();
	}
}