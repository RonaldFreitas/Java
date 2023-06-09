package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class ExercicioIfElse5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo, quantidade;
		System.out.println("Digite o código e a quantidade:");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		if (codigo <= 5 && codigo >= 1) {
			if (codigo == 1) {
				double preco = 4.00 * quantidade;
				System.out.printf("Total: R$%.2f%n", preco);
			} else if (codigo == 2) {
				double preco = 4.50 * quantidade;
				System.out.printf("Total: R$%.2f%n", preco);
			} else if (codigo == 3) {
				double preco = 5.00 * quantidade;
				System.out.printf("Total: R$%.2f%n", preco);
			} else if (codigo == 4) {
				double preco = 2.00 * quantidade;
				System.out.printf("Total: R$%.2f%n", preco);
			} else if (codigo == 5) {
				double preco = 1.50 * quantidade;
				System.out.printf("Total: R$%.2f%n", preco);
			} else {}
		} else {
			System.out.println("Digite o codigo entre 1 e 5!");
		}
		
		sc.close();
	
	}

}
