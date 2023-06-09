package curso_programacao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		/*for (int i=0; i<=4; i++) {
			System.out.println("O valor de i é: " + i);
		}
		for (int i=4; i>=0 ; i--) {
			System.out.println("O valor de i é: " + i);
		}*/
		
		System.out.println(soma);
		
		sc.close();

	}

}
