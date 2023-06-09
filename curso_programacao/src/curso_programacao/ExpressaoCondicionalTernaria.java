package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor:");
		double preco = sc.nextDouble();
		double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
		/*double desconto;
		if (preco < 20.00) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}*/
		
		
		System.out.printf("%.2f%n",desconto);
		sc.close();
	
	}

}

