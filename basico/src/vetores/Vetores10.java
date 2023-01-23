package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect5;

// colocar o nome correto na public class
public class Vetores10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quandos numeros você deseja digitar: ");
		int n = sc.nextInt();
		
		Vect5[] vect = new Vect5[n];

		for (int i=0;i<vect.length;i++) {
			System.out.println("Dados da " + (i+1) + " pessoa: ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new Vect5(name, idade);
		}
		
		String nome = vect[0].getName();
		int maisVelho = vect[0].getIdade();
		for (int i=0;i<vect.length;i++) {
			if (vect[i].getIdade() > maisVelho) {
				maisVelho = vect[i].getIdade();
			}
			else {}
		}
		for (int i=0;i<vect.length;i++) {
			if (vect[i].getIdade() == maisVelho) {
				System.out.println(vect[i].getName());
			}
		}
			
		System.out.println("Pessoa mais velha: ");
		System.out.println(nome);
		sc.close();
	}

}