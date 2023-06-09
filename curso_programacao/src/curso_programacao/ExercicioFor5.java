package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 1;
		
		if (n != 0) {
			for (int i=1; i<=n; i++) {
				x =  x * i;
			}
		} else {
			System.out.println(1);
		}
		
		System.out.println(x);

		sc.close();

	}

}
