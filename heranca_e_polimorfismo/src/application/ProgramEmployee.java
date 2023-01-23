package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class ProgramEmployee {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
	
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println("Employee #" + (i+1) + " data: ");
			System.out.print("Outsorced (y/n)?");
			char outsorced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (outsorced == 'y') {
				System.out.print("Additional charge: ");
				double add = sc.nextDouble();
				emp.add(new OutsorcedEmployee(name, hours, valuePerHour, add));
			}
			else {
				emp.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee payments : emp) {
			System.out.println(payments);
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee payments : emp) {
			System.out.println(payments.getName() + " - $" + String.format("%.2f", payments.payment()));
		}
	
		
		
		sc.close();
	}
}
