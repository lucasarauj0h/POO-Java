package aprendendoString;

import java.util.Locale;
import java.util.Scanner;

// colocar o nome correto na public class
public class FuncaoString {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/* • Formatar: toLowerCase(), toUpperCase(), trim()
		• Recortar: substring(inicio), substring(inicio, fim)
		• Substituir: Replace(char, char), Replace(string, string)
		• Buscar: IndexOf, LastIndexOf
		• str.Split(" "
		*/
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String lowercase = original.toLowerCase();
		String maiuscula = original.toUpperCase();
		String trim = original.trim(); //elimina os espaços
		String substring = original.substring(2); //corta 2 caracteres (0 e 1)
		String substring2 = original.substring(2,9); //corta os caracteres do 2 ao 9
		String substituir = original.replace(' ','-'); //substitui oque está dentro dos parametros
		String substituir2 = original.replace("abc","x"); //substitui a string presente
		int contagemString = lowercase.indexOf("de"); // retorna a posição do valor "BC"
		int contagemLastString = lowercase.lastIndexOf("de");
		int contagemChar = original.indexOf('c'); //retorna a posição do char "c"
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println(".toLowerCase(); -" + lowercase + "-");
		System.out.println(".toUpperCase(): -" + maiuscula + "-");	
		System.out.println(".trim(): -" + trim + "-");
		
		System.out.println(".substring() inicio: -" + substring + "-"); //cortou a partir da 2 string
		System.out.println(".substring2() inicio e fim: -" + substring2 + "-"); //corta da string 2 até a 9
		System.out.println(".replace('a','x') char: -" + substituir + "-");//substitui o char
		System.out.println(".replace(aspas duplo para string) string: -" + substituir2 + "-");
		
		System.out.println("indexOf 'de': " + contagemString);
		System.out.println("indexOf 'c': " + contagemChar);
		System.out.println("lastIndexOf 'de': "+contagemLastString);
		
		
		//operação split separa em varias partes a frase, separado por algo que nos denfinimos no
		//parametro
		//essas partes ficam armazenadas em um vetor
		
		String s = "Lucas de Araujo Souza";
		String[] vect= s.split(" ");
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		String word4 = vect[3];
		
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		System.out.println(word4);
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}