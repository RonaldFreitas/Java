package curso_programacao;

import java.util.Locale;

import java.util.Scanner;

public class ExercicioFinal3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int diferenca = (A * B - C * D);
		System.out.println("DIFERENCA = " + diferenca);
		sc.close();
	}
}
