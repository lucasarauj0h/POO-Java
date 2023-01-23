package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect6;


// colocar o nome correto na public class
public class Vetores7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quandos numeros você deseja digitar: ");
		int n = sc.nextInt();
		
		Vect6[] vectA = new Vect6[n];
		Vect6[] vectB = new Vect6[n];
		
		for (int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vectA[i] = new Vect6(number);
		}
		for (int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vectB[i] = new Vect6(number);
		}
		int[] vect = new int[n];
			for (int i=0;i<n;i++) {
				vect[i] = vectA[i].getNumber() + vectB[i].getNumber();
				System.out.println(vect[i]);
			}

		sc.close();
	}
}