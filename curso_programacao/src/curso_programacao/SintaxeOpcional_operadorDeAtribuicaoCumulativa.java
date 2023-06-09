package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class SintaxeOpcional_operadorDeAtribuicaoCumulativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor:");
		double minutos, conta;
		minutos = sc.nextDouble();
		conta = 50;
		if (minutos <= 100) {
			System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		} else {
			//conta = conta + (minutos - 100) * 2;
			conta += (minutos - 100) * 2;
			System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		}
		sc.close();
	
	}

}
