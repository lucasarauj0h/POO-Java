package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;
import entities.BusinessAccountBank;
import entities.SavingsAccount;

public class ProgramBank {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		AccountBank acc = new AccountBank(1001, "Lucas", 0.0);
		BusinessAccountBank bacc = new BusinessAccountBank(1002,"Maria",500.0,500);
		
		//UPCASTING 
		
		AccountBank acc1 = bacc;
		System.out.println(acc1.getBalance());
		AccountBank acc2 = new BusinessAccountBank(1003, "bob", 0.0, 1200);
		AccountBank acc3 = new SavingsAccount(1004, "Fernando", 250.0, 0.13);
		
		//UMA SUBCLASSE SENDO ATRIBUIDA A SUPER CLASSE, NORMAL POIS TODA SUBCLASSE PERTENCE A SUPERCLASSE
		
		//DOWNCASTING
		
		BusinessAccountBank acc4 = (BusinessAccountBank)acc2;
		acc4.loan(400);
		System.out.println(acc4.getBalance());
		
		// BusinessAccountBank acc5 = (BusinessAccountBank)acc3;
		//PARA EVITAR, PRECISAMOS TESTAR SE A ACC3 É REALMENTE DO TIPO BUSINESSACOUNTBANK, (OQUE NÃO É) 
		//PARA TESTAR USAMOS O ATRIBUTO INSTANCEOF - instanceof
		
		if (acc3 instanceof BusinessAccountBank) {
			BusinessAccountBank acc5 = (BusinessAccountBank)acc3;
			acc5.loan(4850);
		}
		else {
			System.out.println("O atributo não é do tipo BusinessAccountBank");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update! - teste	");
		}
		
		AccountBank acc6 = new AccountBank(1099, "Cristiano", 500.0);
		acc6.withdraw(500);
		System.out.println(acc6.getBalance());
		
		AccountBank acc7 = new SavingsAccount(1100, "Roberta", 500.0, 0.13);
		acc7.withdraw(500);
		System.out.println(acc7.getBalance());
		
		
		sc.close();
	}
}
