package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		method1();
		
		System.out.println("End of program");
		sc.close();
	}
	
	public static void method1() {
		System.out.println("*** METHOD1 START***");
		method2();
		
		System.out.println("*** METHOD1 END***");
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** METHOD2 START***");
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
			//O STACKTRACE MOSTRA TODA A CAMINHADA ATÉ ACARRETAR NA EXCEÇÃO, COMO FOI CHAMADA CAMINHO POR CAMINHOA
		}
		catch (InputMismatchException e) {
			System.out.println("Input invalid! ");
		}
		System.out.println("*** METHOD2 END***");
		sc.close();
	}
}