package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class ProgramMetodAbstract {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		
		for (int i=0;i<n;i++) {
			System.out.println("Shape #" + (i+1) + " data: ");
			System.out.print("Rectangle ou Circle: (r/c) ");
			char answer = sc.next().charAt(0);
			
			if (answer == 'c') {
				System.out.print("Color (BLACK/BLUE/RED) ");
				sc.nextLine();
				String color = sc.nextLine();
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}
			else if (answer == 'r') {
				System.out.print("Color (BLACK/BLUE/RED) ");
				sc.nextLine();
				String color = sc.nextLine();
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(Color.valueOf(color), width, height));
			}
		}
		
		System.out.println();
		System.out.println("Shape areas: ");
		for (Shape s : list) {
			System.out.println("Color: " + s.getColor() + " Area: " + s.area());
		}
		
		
		sc.close();
	}
}
