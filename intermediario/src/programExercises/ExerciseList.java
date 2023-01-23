package programExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

// colocar o nome correto na public class
public class ExerciseList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();
	
		System.out.print("How many employees will be registred: ");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee account = new Employee(id, name, salary);
			
			list.add(account);
			
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Integer pos = position(list, id);
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).addSalary(percent);
			//O .GET() NOS ENTREGA A POSICAO DA LISTA COM O NUMERO QUE COLOCAMOS DENTRO.
		}
		
		
		
		System.out.println("List of employees: ");
		
		for (Employee x : list) {
			System.out.println(x);
		}
		sc.close();
	}
	
	static Integer position(List<Employee> list, int id) {
		for (int i=0;i<list.size();i++) {
			if (list.get(i).getId() == id) {
				//O .GET() NOS ENTREGA A POSICAO DA LISTA COM O NUMERO QUE COLOCAMOS DENTRO.
				//COM O NUMERO DA LISTA, A GENTE DA UM getId DA CLASSE QUE NÓS CRIAMOS
				//PARA QUE ELE NOS DE O ID RELACIONADO AO VETOR DA LISTA QUE NOS PEDIMOS
				// E ASSIM COMPARAMOS
				return i;
			}
		}
		return null;
	}

}