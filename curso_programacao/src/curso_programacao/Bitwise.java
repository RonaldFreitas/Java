package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);*/
		
		System.out.println("Type a number:");
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if((n & mask)!= 0) {
			System.out.println("The sixth bit is true!");
		} else {
			System.out.println("The sixth bit is false!");
		}
		
		sc.close();
	}
}