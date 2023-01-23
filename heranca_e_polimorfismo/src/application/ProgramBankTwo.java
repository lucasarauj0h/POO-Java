package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;
import entities.BusinessAccountBank;
import entities.SavingsAccount;

public class ProgramBankTwo {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		List<AccountBank> list = new ArrayList<>();
		
		list.add(new BusinessAccountBank(1001, "Lucas", 100.0, 500));
		list.add(new SavingsAccount(1002, "Maria", 500.0, 0.1));
		list.add(new SavingsAccount(1003, "Roberto", 200.0, 0.1));
		list.add(new BusinessAccountBank(1004, "Amanda", 750.0, 400));
		
		double sum = 0;
		
		for (AccountBank acc : list) {
			sum += acc.getBalance();
		}
 		
		System.out.println(sum);
		
		for (AccountBank acc : list) {
			acc.deposit(10);;
		}
		
		for (AccountBank acc : list) {
			System.out.printf("Update balance for account %d: %.2f\n", acc.getNumber(), acc.getBalance());
		}
		
		
		
		sc.close();
	}
}
