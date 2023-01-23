package aprendendoString;

import java.util.Locale;
import java.util.Scanner;

// colocar o nome correto na public class
public class escopo_e_inicializacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// double price;

		// System.out.println(price);

		// se ela não for iniciada, ela não pode ser usada

		double price = 400.00;

		
		if (price < 200) {
		//	double discount = price * 0.1;
		}
		sc.close();
		//System.out.println(discount);
		
		//cada estrutura (if-else, switch case, laço for) tem seu próprio escopo,
		//isso significa que caso eu crie uma variável dentro da estrutura, só 
		//funcionara dentro dela, fora da estrutura ela não existirá


	}

}