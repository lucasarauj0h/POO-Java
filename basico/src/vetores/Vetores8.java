package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect6;


// colocar o nome correto na public class
public class Vetores8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quandos numeros você deseja digitar: ");
		int n = sc.nextInt();
		
		Vect6[] vect = new Vect6[n];
		
		double media=0;
		for (int i=0;i<n;i++) {
			System.out.print("Digite o " + i + "numero: ");
			int number = sc.nextInt();
			vect[i] = new Vect6(number);
			media += vect[i].getNumber();
		}
		media = media/n;
		System.out.printf("MEDIA DO VETOR = %.2f\n",media);
		System.out.println("Elementos abaixo da media: ");
		
		for (int i=0;i<n;i++) {
			if (vect[i].getNumber() < media ) {
				System.out.println(vect[i].getNumber());
			}
		}
		
		sc.close();
	}
}