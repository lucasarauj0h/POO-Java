package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			List<Product> prod = new ArrayList<>();
			
			System.out.print("Enter the number of products: ");
			int n = sc.nextInt();
			
			for (int i=0;i<n;i++) {
				System.out.println("Common, used or imported (c/u/i): ");
				char answer = sc.next().charAt(0);
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				
				if (answer == 'i') {
					System.out.print("Customs fee: ");
					double cumstoms = sc.nextDouble();
					Product product = new ImportedProduct(name, price, cumstoms);
					prod.add(product);
					
				}
				else if (answer == 'u') {
					System.out.println(" Manufacture date (DD/MM/YYYY): ");
					sc.nextLine();
					String date = sc.nextLine();
					LocalDate manuDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
					System.out.println(date);
					System.out.println(manuDate);
					Product product = new UsedProduct(name, price, manuDate);
					prod.add(product);
					} 
					else {
					Product product = new Product(name, price);
					prod.add(product);
					}
			}
			
			System.out.println("");
			System.out.println("PRICE TAGS: ");
			for (Product product : prod) {
				System.out.println(product.priceTag());
			}
			
			
			sc.close();
	}

}
