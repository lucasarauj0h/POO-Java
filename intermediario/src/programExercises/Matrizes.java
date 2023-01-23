package programExercises;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

// colocar o nome correto na public class
public class Matrizes {
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int l=0;l<n;l++) {
			for (int c=0;c<n;c++) {
				mat[l][c] = (random.nextInt(8)*-1)-1;
			}
		}
		System.out.println("Main diagonal: ");
		for (int l=0;l<n;l++) {
			System.out.print(mat[l][l]+" ");
		}
		int negative = 0;
		for (int l=0;l<n;l++) {
			for (int c=0;c<n;c++) {
				if (mat[l][c] < 0) {
					negative += 1;
				}
			}
		}
		System.out.println("\nnegative: " + negative);
		
		sc.close();
	}

}