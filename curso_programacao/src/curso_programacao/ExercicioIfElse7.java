package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class ExercicioIfElse7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o x e o y:");
		double numero, numero2;
		numero = sc.nextDouble();
		numero2 = sc.nextDouble();
		if (numero != 0 && numero2 != 0) {
			if (numero > 0 && numero2 > 0) {
				System.out.println("Q1");
			} else if (numero < 0 && numero2 > 0){
				System.out.println("Q2");
			} else  if (numero < 0 && numero2 < 0){
				System.out.println("Q3");
			} else if (numero > 0 && numero2 < 0){
				System.out.println("Q4");
			} else{}
		}
		else {
			System.out.println("Origem");
		}
		
		sc.close();
	
	}

}