package aprendendoString;

import java.util.Locale;
import java.util.Scanner;


public class entrada_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		String x;
		System.out.println("Digite uma frase");
		x= sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		System.out.println("Digite um int");
		y= sc.nextInt();
		System.out.printf("Você digitou o numero: %d", y);
		
		double p;
		System.out.println("Digite um float");
		p= sc.nextDouble();
		System.out.printf("Você digitou o float: %.2f", p);
		
		

		//Para ler um caracter, o sc.next vai receber a string, porem vai computar somente
		// a primeira letra, limite definido por .charAt(0);
		char c;
		c = sc.next().charAt(0);
		System.out.println("Você digitou " + c);
		
		
		String e;
		int k;
		double t;
		e= sc.next();
		k= sc.nextInt();
		t= sc.nextDouble();
		// para computar cada uma das entrada, é preciso apertar espaço durante a entrada dos dados
		System.out.println(e);
		System.out.println(k);
		System.out.println(t);
		
		
		
		
		
		
		sc.close();
	}

}
