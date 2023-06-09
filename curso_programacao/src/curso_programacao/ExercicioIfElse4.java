package curso_programacao;

import java.util.Scanner;

public class ExercicioIfElse4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Horário inicial e final:");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if (numero1 < numero2) {
			int duracao = numero2 - numero1;
			System.out.println("O JOGO DUROU: " + duracao + " HORA(S)");
		} else {
			if (numero2 < numero1) {
				int duracao2 = 24 - numero1 + numero2;
				System.out.println("O JOGO DUROU: " + duracao2 + " HORA(S)");
			} else {
				System.out.println("O JOGO DUROU: 24 HORA(S)");
			}
		}
		sc.close();
	}


}
