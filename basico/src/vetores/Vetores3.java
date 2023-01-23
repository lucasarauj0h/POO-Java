package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect3;

// colocar o nome correto na public class
public class Vetores3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quandos numeros você deseja digitar: ");
		int n = sc.nextInt();
		
		Vect3[] vect = new Vect3[n];
		
		for (int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = new Vect3(sc.nextInt());
		}
		
		System.out.print("negatives: \n");
		for (int i=0;i<vect.length;i++) {
			if (vect[i].getNumber() < 0) {
				System.out.println(vect[i].getNumber());
			}
			else {}
		}	
		sc.close();
	}

}