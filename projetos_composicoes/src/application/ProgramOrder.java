package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class ProgramOrder {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data client: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY) - ");
		String birthDate = sc.nextLine();
		LocalDate bDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Client client = new Client(name, email, bDate);
		
		LocalDateTime moment = LocalDateTime.now();
		
		Order order = new Order(moment, OrderStatus.valueOf("PROCESSING"), client);
		
		System.out.println("Enter order data:");
		System.out.println("Status: " + OrderStatus.valueOf("PROCESSING"));
		System.out.print("How many items to this order? = ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println("Enter #" + (i+1) + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			
			OrderItem orderItem = new OrderItem(quantity, price);
			Product product = new Product(productName, price);
			orderItem.addProduct(product);
			order.addItem(orderItem);
		}
		
		System.out.println(order);
		
		sc.close();
	}

}
