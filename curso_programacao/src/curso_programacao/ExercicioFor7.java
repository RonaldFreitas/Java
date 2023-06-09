package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			int x = i * i;
			int y = i * i * i;
			System.out.print(i + " ");
			System.out.print(x + " ");
			System.out.println(y + " ");
		}
		
		sc.close();
	}
}