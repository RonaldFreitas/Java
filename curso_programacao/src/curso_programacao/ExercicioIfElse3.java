package curso_programacao;

import java.util.Scanner;

public class ExercicioIfElse3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Digite dois números:");
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		
		if (numero1 % numero2 == 0) {
			System.out.println("SAO MULTIPLOS");
		} else {
			if (numero2 % numero1 == 0) {
				System.out.println("SAO MULTIPLOS");
			} else {
				System.out.println("NAO SAO MULTIPLOS");
			}
		}
		sc.close();
	}


}
