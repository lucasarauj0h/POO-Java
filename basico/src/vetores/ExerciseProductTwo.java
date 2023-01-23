package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

// colocar o nome correto na public class
public class ExerciseProductTwo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		
		Product p = new Product(name, price); //INICIALIZANDO A VARIAVEL 
		//OBRIGATORIAMENTE COM DADOS. 
		
		System.out.println("Insira novo nome, novo valor e qntd no estoque");
		p.setName(sc.next());
		p.setPrice(sc.nextDouble());
		
		System.out.println("Name: " + p.getName());
		System.out.println("Price: " + p.getPrice());
		System.out.println("Quantity: " + p.getQuantity());
		System.out.println(p);
		
		
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		p.addProducts(quantity);
		System.out.println(p);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		p.removeProducts(quantity);
		System.out.println(p);
		
		sc.close();
	}

}