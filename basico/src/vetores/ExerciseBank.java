package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

// colocar o nome correto na public class
public class ExerciseBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double initialAccount, value;
		Bank bank;
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?: ");
		char deposit = sc.next().charAt(0);
		if  (deposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialAccount = sc.nextDouble();
			bank = new Bank(account, name, initialAccount);
		} else {
			bank = new Bank(account, name);
		}
		
		System.out.println(bank);
		
		System.out.print("\nEnter a deposit value: ");
		value = sc.nextDouble();
		bank.addBalance(value);
		System.out.println(bank);
		int x = 0;
		do {
			
			System.out.print("\nEnter a withdraw value: ");
			value = sc.nextDouble();
			if (bank.getBalance() - (value + bank.TAX)>= 0 ) {
			bank.saqueBalance(value);
			System.out.println(bank);
			x = 1;
			}
			else {
				System.out.println("value don't disponible");
				System.out.println("max value disponible = " + (bank.getBalance()-bank.TAX));
			}
		}	
		while (x != 1);
		sc.close();
	}
}