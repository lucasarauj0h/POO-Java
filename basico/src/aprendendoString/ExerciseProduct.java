package aprendendoString;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

// colocar o nome correto na public class
public class ExerciseProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total;
		Product p = new Product(); //INICIALIZANDO A VARIAVEL 
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		p.name = sc.nextLine();
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		System.out.print("Quantity: ");
		p.quantity = sc.nextInt();
		
		/* System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		p.addProducts(quantity);
		//total = p.totalValueInStock();
		//System.out.printf("Updated data: %s, $ %.2f, %d units, total: %.2f\n", p.name, p.price, p.quantity, total);
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		p.removeProducts(quantity);
		//total = p.totalValueInStock();
		//System.out.printf("Updated data: %s, $ %.2f, %d units, total: %.2f\n", p.name, p.price, p.quantity, total);
		*/
		
		//Quando eu uso o system.out.println(product.toString());
		//é a mesma coisa que usar system.out.println(product); pois automaticamente 
		//ele ja reconhece que é pra exibir com uma string
		
		System.out.println(p.toString());
		System.out.println(p);
		
		
		sc.close();
	}

}