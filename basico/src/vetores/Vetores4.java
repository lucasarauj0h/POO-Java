package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect3;

// colocar o nome correto na public class
public class Vetores4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quandos numeros você deseja digitar: ");
		int n = sc.nextInt();
		
		Vect3[] vect = new Vect3[n];
		int soma=0;
		for (int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = new Vect3(sc.nextInt());
			soma += vect[i].getNumber();
		}
		
		System.out.print("Values: ");
		for (int i=0;i<vect.length;i++) {
				System.out.print(vect[i].getNumber() + " ");
		}	
		double media = soma/vect.length;
		System.out.printf("\n4Soma: %d\nMedia: %.2f", soma, media);
		sc.close();
	}

}