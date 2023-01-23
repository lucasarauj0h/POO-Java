package vetores;

import java.util.Locale;
import java.util.Scanner;

// colocar o nome correto na public class
public class ExerciseBoxing {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 20;
		
		Object obj = x;
		System.out.println(obj);
		
		if ((int) obj > 50) {
			System.out.println(obj);
		}
		else {
			System.out.println("Failled");
		}
		
		int y = (int) obj;
		System.out.println(obj);
		
		sc.close();
	}

}