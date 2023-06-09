package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double conta = x/y;
			
			if (y != 0) {
				System.out.printf("%.1f%n", conta);
			} else {
				System.out.println("divisão impossível");
			}
		}

		sc.close();

	}

}
