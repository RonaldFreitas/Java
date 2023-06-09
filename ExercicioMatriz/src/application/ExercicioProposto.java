package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer m = sc.nextInt();
		Integer n = sc.nextInt();
		Integer[][] mat = new Integer[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		Integer x = sc.nextInt();
		
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position " + i + " , " + j);
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i < mat[i].length -1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					if(j < mat.length -1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
				}
			}
		}
		
		sc.close();
	}

}
