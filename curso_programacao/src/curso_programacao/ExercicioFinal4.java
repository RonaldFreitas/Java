package curso_programacao;

import java.util.Scanner;

public class ExercicioFinal4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		double horas, receber;
		
		numero = sc.nextInt();
		horas = sc.nextDouble();
		receber = sc.nextDouble();
		double salario = horas * receber;
		System.out.println("Número do funcionário = " + numero);
		System.out.printf("Salário do funcionário = R$%.2f%n", salario);
		sc.close();
	}
}