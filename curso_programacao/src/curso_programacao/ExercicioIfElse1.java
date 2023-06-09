package curso_programacao;

import java.util.Scanner;

public class ExercicioIfElse1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}


}
