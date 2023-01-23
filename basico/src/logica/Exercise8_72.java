package logica;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

// colocar o nome correto na public class
public class Exercise8_72 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price: ");
		double dolar = sc.nextDouble();
		System.out.print("How many dollar will be bought: ");
		double compraDolar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.total(dolar,compraDolar));
		
		
		sc.close();
	}

}