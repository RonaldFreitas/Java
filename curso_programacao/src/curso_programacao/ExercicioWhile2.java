package curso_programacao;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o x e o y:");
		
		double numero, numero2;
		numero = sc.nextDouble();
		numero2 = sc.nextDouble();
				
		while (numero != 0 && numero2 !=0) {
			if (numero > 0 && numero2 > 0) {
				System.out.println("Primeiro");
			} else if (numero < 0 && numero2 > 0){
				System.out.println("Segundo");
			} else  if (numero < 0 && numero2 < 0){
				System.out.println("Terceiro");
			} else if (numero > 0 && numero2 < 0){
				System.out.println("Quarto");
			} else{}
			numero = sc.nextDouble();
			numero2 = sc.nextDouble();
		}
		
		sc.close();
	}

}
