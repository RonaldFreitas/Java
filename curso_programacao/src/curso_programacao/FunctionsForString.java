package curso_programacao;

public class FunctionsForString {

	public static void main(String[] args) {
		
		String original = "abc ABC def DEF    ";
		
		//Formatar
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		
		//Recortar
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		
		//Substituir
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");
		
		//Buscar
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		//Recortar String para vetor "array"
		String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		
		
		//Formatar
		System.out.println("original: -" + original + "-");
		System.out.println("tolowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		
		//Recortar
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		
		//Substituir
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xyz'): -" + s07 + "-");
		
		//Buscar
		System.out.println("indeOf('bc'): -" + i + "-");
		System.out.println("lastIndeOf('bc'): -" + j + "-");
				
		//Recortar String para vetor "array"
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
	}

}
