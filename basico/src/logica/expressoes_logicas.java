package logica;

import java.util.Locale;
import java.util.Scanner;

// colocar o nome correto na public class
public class expressoes_logicas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// logica "E" deve se usar o && por exemplo
		// x > 45 && x < 55
		// operador "ou" deve se usar o || por exemplo
		// x == 0 || x != 3

		// logica "não" o ¬(lili é baixa) da matematica
		// se x=5 então para usar o operdaor não fazemos
		// !(x==10), o valor é falso, porem o "não" - nesse caso "!()" - o torna
		// verdadeiro

		// ctrl + shift + f para fazer uma identação automatica

		int horas;

		System.out.println("Quantas horas são? ");
		horas = sc.nextInt();

		if (horas > 6 && horas <= 12) {
			System.out.println("Bom dia!");
		} else if (horas > 12 && horas <= 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		
		// estrutura switch case
		String dia;
		int x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça-feira";
			break;
		case 4:
			dia = "quarta-feira";
			break;
		case 5:
			dia = "quinta-feira";
			break;
		case 6:
			dia = "sexta-feira";
			break;
		case 7:
			dia = "sabádo";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.println("Hoje é dia: " + dia);
		
		
		//expresão condição ternária 
		//estrutura opicional ao if else quando se deseja decidir um VALOR com base em 1 condição
		
		double preco = sc.nextDouble();
		
		double desconto = (preco <= 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		
		//estrutura while - essa estrutura repete sua cadeia de comandos enquanto seu valor
		//for verdadeiro.
		
		int t = 5;
		int soma = 0;
		
		while (t != 0) {
			 
			x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		

		sc.close();
	}

}