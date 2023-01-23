package aprendendoString;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

// colocar o nome correto na public class
public class ExerciseEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s\n", employee);
		
		System.out.print("Which percentage to increase salary % = ");
		double percent = sc.nextDouble();
		percent /= 100;
		
		employee.increaseSalary(percent);
		System.out.printf("Update data: %s\n", employee);	
		
		
		sc.close();
	}

}