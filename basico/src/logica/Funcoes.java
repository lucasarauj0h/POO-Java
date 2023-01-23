package logica;

import java.util.Locale;
import java.util.Scanner;

// colocar o nome correto na public class
public class Funcoes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		
		int a = sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		/* if (a > b && a > c) {
			System.out.printf("Higher = %d", a);
		} 
		else if (b > a && b > c) {
			System.out.printf("Higher = %d", b);
		} 
		else {
			System.out.printf("Higher = %d", c);
		} */
		
		int higher = max(a,b,c);
		showResult(higher);
		
		sc.close();
	}
	//as variaveis declaradas dentro do "max" existirão apenas durante a execução da função
	// assim como a variavel aux
	public static int max(int x, int y, int z) { 
		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} 
		else if (y > x && y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	// É CRIADA UMA VARIAVEL "VALUE", ESSA RECEBE UM PARAMETRO NA CHAMADA DA FUNÇÃO
	// E ESSE VALOR INSERIDO NO PARAMETRO FICA ALOCADO NA INT VALUE, QUANDO ELA É CHAMDA NA FUNÇÃO
	// E COMPLEMENTA A CHAMADA DE SYSTEM OUT, O VOID RETORNA TODO O COMANDO 
	
	public static void showResult(int value) {
		
		System.out.println("Higher : " + value);
	}

}