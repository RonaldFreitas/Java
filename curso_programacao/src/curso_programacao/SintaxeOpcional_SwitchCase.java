package curso_programacao;

import java.util.Scanner;

import java.util.Locale;

public class SintaxeOpcional_SwitchCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor:");
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		 case 1:
			 dia = "domingo";
			 break;
		 case 2:
			 dia = "segunda";
			 break;
		 case 3:
			 dia = "terça";
			 break;
		 case 4:
			 dia = "quarta";
			 break;
		 case 5:
			 dia = "quinta";
			 break;
		 case 6:
			 dia = "sexta";
			 break;
		 case 7:
			 dia = "sábado";
			 break;
		default:
			dia = ("Valor inválido");
			break;
		}
		
		System.out.println("Dia da semana: " + dia);

		/*if(x == 1) {
			dia = "domingo";
		} else if(x == 2) {
			dia = "segunda";
		} else if(x == 3) {
			dia = "terça";
		} else if(x == 4) {
			dia = "quarta";
		} else if(x == 5) {
			dia = "quinta";
		} else if(x == 6) {
			dia = "sexta";
		} else if(x == 7) {
			dia = "sábado";
		} else {
			dia = "valor inválido";
		}*/
		
		sc.close();
	
	}

}