package programExercises;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class firstDateHour {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);

			Scanner sc = new Scanner(System.in);
			
			LocalDate d01 = LocalDate.now();
			//INSTANCIANDO DATA LOCAL DO SISTEMA
			
			System.out.println(d01);
			
			sc.close();

	}
}
