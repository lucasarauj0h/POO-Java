package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPlayer;

public class ExerciseEmployee {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPlayer> list = new ArrayList<>();
	
		System.out.print("Enter the number of tax players: ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println("Tax player #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c) - ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (answer == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));
			}
			else if (answer == 'i') {
				System.out.print("Health expenditures: ");
				double he = sc.nextDouble();
				list.add(new Individual(name, anualIncome, he));
			}
		}
		System.out.println("");
		System.out.println("TAXES PAID: ");
		double sum = 0;
		for (TaxPlayer tax : list) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
			sum += tax.tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}
