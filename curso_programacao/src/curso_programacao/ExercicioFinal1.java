package curso_programacao;

import java.util.Scanner;

public class ExercicioFinal1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		int soma = x + y;
		System.out.println(x + " + " + y + " = " + soma);
		sc.close();
	}

}
