package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Vect5;

// colocar o nome correto na public class
public class Vetore5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quandos numeros você deseja digitar: ");
		int n = sc.nextInt();
		
		Vect5[] vect = new Vect5[n];
		double media = 0;
		double dadosIdade=0;
		for (int i=0;i<vect.length;i++) {
			System.out.println("Dados da " + (i+1) + " pessoa: ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Vect5(name, idade, altura);
			
			media += vect[i].getAltura();
			
			if (vect[i].getIdade() < 16) {
				dadosIdade += 1;
			}
			
		}
		System.out.println("Media: " + (media/n));
		double percentDadosIdade = (dadosIdade*100)/n;
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentDadosIdade);
		
		for (int i=0;i<vect.length;i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}

}