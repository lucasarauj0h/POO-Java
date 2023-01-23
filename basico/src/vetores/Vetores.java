package vetores;

import java.util.Locale;
import java.util.Scanner;

// colocar o nome correto na public class
public class Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] altura = new double[n];
		double media = 0;
		
		for (int i=0;i < n; i++) {
			altura[i] = sc.nextDouble();
			media += altura[i];
			
		}
		media = media/n;
		System.out.println(media);
		sc.close();
	}

}