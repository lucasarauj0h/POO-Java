package logica;

import java.util.Locale;
import java.util.Scanner;

public class funcoes_matematica {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			int x = 25;
			int y = 3;
			double raiz = Math.sqrt(x); //variavel raiz recebe a raiz quadrada de X
			System.out.println(raiz);		
			double potencia = Math.pow(x,y); //variavel potencia recebe a potencia de x elevado a y
			System.out.println(potencia);		
			double abs = Math.abs(x); // variavel abs recebe o absoluto de X (como se fosse |módulo|)
			System.out.println(abs);			
			sc.close();

	}

}
