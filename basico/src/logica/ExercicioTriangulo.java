package logica;

import java.util.Locale;
import java.util.Scanner;

// colocar o nome correto na public class
public class ExercicioTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the measures of triangle X: ");
		
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();		
		
		System.out.println("Enter the measures of triangle Y: ");
		
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
	
		double areaTrianguloX = area(x1,x2,x3);
		double areaTrianguloY = area(y1,y2,y3);
		
		result(areaTrianguloX);
		result(areaTrianguloY);
		
		sc.close();
	}
	
	public static double area(double a, double b, double c) {
		
		double p = (a + b + c)/2;
		double antesRaiz = p*(p-a)*(p-b)*(p-c);
		double areat = Math.sqrt(antesRaiz);
		
		return areat;
		
	}
	
	public static void result(double area) {
		System.out.println("Area triangulo: " + area);
	}

}