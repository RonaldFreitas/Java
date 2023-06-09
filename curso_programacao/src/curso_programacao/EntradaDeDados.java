package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		*/
		/*int x;
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		*/
		/*double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.1f %n", x);
		
		sc.close();
		*/
		/*char x;
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		
		sc.close();
		*/
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
