package aprendendoString;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

// colocar o nome correto na public class
public class ExerciseRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		double diagonal = r.diagonal();
		double area = r.area();
		double perimeter = r.perimeter(diagonal);
				
		System.out.println(area);
		System.out.println(perimeter);
		System.out.println(diagonal);
		
		sc.close();
	}

}