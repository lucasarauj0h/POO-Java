package logica;

import java.util.Locale;
import java.util.Scanner;

// colocar o nome correto na public class
public class laco_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * for (int i = 0; i<10; i++) { System.out.println(i);
		 * 
		 * }
		 */
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius\n");

			double c = sc.nextDouble();
			double f = ((9 * c) / 5) + 32;
			
			System.out.printf("Temperatura em Fahrenheit = %.2f\n", f);
			System.out.println("Dejesa repetir? s/n\n");
			
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
			System.out.println("Fim do programa.");
		sc.close();
	}

}