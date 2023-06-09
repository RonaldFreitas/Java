package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class ExercicioIfElse6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		double numero;
		numero = sc.nextDouble();
		if (numero > 0 && numero < 100) {
			if (numero >= 0 && numero <= 25) {
				System.out.println("Intervalo (0,25)");
			} else if (numero >= 25 && numero <= 50) {
				System.out.println("Intervalo (25,50)");
			} else if (numero >= 50 && numero <= 75) {
				System.out.println("Intervalo (50,75)");
			} else if (numero >= 75 && numero <= 100) {
				System.out.println("Intervalo (75,100)");
			} else {}
		} else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	
	}

}