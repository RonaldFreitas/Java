package curso_programacao;

import java.util.Locale;

import java.util.Scanner;

public class ExercicioFinal5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peca1, quantidade1, peca2, quantidade2;
		double valor1, valor2;
		
		peca1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		valor1 = sc.nextDouble();
		peca2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		valor2 = sc.nextDouble();
		double pagar = (quantidade1 * valor1) + (quantidade2 * valor2);
		System.out.printf("Valor a pagar = R$%.2f%n", pagar, peca1, peca2);
		sc.close();
	}
}