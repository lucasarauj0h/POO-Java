package vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Pensionato;

// colocar o nome correto na public class
public class ExercicioPensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 10;
		
		System.out.print("Quandos estudantes vao se alocar? : ");
		int student = sc.nextInt();
		
		Pensionato[] p = new Pensionato[n];
		
		for (int i=0;i<student;i++) {
			System.out.print("Escolha o numero do quarto - 0 a 9: ");
			int q = sc.nextInt();
			System.out.print("Informe seu nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Informe seu e-mail: ");
			String email = sc.nextLine();
			p[q] = new Pensionato(name, email, q);
		}
		
		for (int i=0; i<n;i++) {
			if (p[i] != null) {
				System.out.println(p[i]);
			}
		}
		
		
		sc.close();
	}

}