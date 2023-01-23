package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVect;

// colocar o nome correto na public class
public class VetoresTwo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double media=0;
		int n = sc.nextInt();
		ProductVect[] vect = new ProductVect[n];
		
		for (int i=0;i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVect(name, price);
			media += vect[i].getPrice();
		}
		media = media/vect.length;
		System.out.println(media);
	
		sc.close();
	}

}