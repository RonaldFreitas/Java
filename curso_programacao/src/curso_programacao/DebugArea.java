package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class DebugArea {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("AREA = R$ %.2f%n", area);
		System.out.printf("PREÇO = R$ %.2f%n", preco);
		sc.close();
		
		/*
			 * control shift b = marcar toggle breakpoint
			 * botao direito na classe, debug as, java application
			 * para executar linha = F6
			 * para interromper debug clicar no quadrado vermelho
		*/

	}

}