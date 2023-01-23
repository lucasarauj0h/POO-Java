package logica;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

// colocar o nome correto na public class
public class ExercicioTrianguloClasse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; // ctrl + shift + o para importar essa casse
		x = new Triangle();
		y = new Triangle();
		

		System.out.println("Enter the measures of triangle X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();;		
		
		System.out.println("Enter the measures of triangle Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
	
		//CHAMANDO A FUNÇÃO DA CLASS
		
		double areaX = x.area(); // OS ATRIBUTOS .A .B E .C ESTÃO LIGADOS AO X POR ISSO FUNCIONA
		double areaY = y.area(); // O MESMO OCORRE COM O Y POR ISSO ELE É FUNCIONAL. 
		
		x.showResult(areaX);
		y.showResult(areaY);
		
		
	}
}