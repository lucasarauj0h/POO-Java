package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect6;

// colocar o nome correto na public class
public class Vetores9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quandos numeros você deseja digitar: ");
		int n = sc.nextInt();
		
		Vect6[] vect = new Vect6[n];
		
		for (int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = new Vect6(number);
		}
		int soma=0;
		if (soma > 0) {
			System.out.println((soma/n));
		}
		else {
			System.out.println("Nenhum numero par.");
		}
		/* System.out.printf("\nTotal de pares: %d", soma);
		
		int maior=vect[0].getNumber();
		int indiceMaior=vect[0].getNumber();
		for (int i=0;i<vect.length;i++) {
			if (vect[i].getNumber() > maior) {
				maior = vect[i].getNumber();
				indiceMaior = i;
			}
			else {}
		}
		System.out.printf("\nMaior valor: %d\nIndice do valor: %d", maior, indiceMaior);
		*/

		sc.close();
	}
}