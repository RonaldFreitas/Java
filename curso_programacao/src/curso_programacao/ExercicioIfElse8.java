package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class ExercicioIfElse8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor:");
		double numero;
		numero = sc.nextDouble();
		if (numero >= 0 && numero < 2000) {
			System.out.println("Isento");
		} else if (numero > 2000 && numero <= 3000){
			double calculo = (numero -2000) * 0.08;
			System.out.printf("R$ %.2f%n", calculo);
		} else  if (numero > 3000 && numero <= 4500){
			double calculo = (numero - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", calculo);
		} else if (numero > 4500){
			double calculo = (numero - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", calculo);
		} else{}
		sc.close();
	
	}

}