package programExercises;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

// colocar o nome correto na public class
public class ExerciseMatriz {
	
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Quantas linhas: ");
		int lin = sc.nextInt();
		System.out.print("Quantas colunas: ");
		int col = sc.nextInt();
		
		
		int[][] mat = new int[lin][col];
		
		for (int l=0;l<lin;l++) {
			for (int c=0;c<col;c++) {
				mat[l][c] = (random.nextInt(90))+10;
			}
		}
		System.out.println("Matriz: ");
		for (int l=0;l<lin;l++) {
			for (int c=0;c<col;c++) {
				System.out.print(mat[l][c] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Qual numero deseja procurar: ");
		int n = sc.nextInt();
		
		
		for (int l=0;l<lin;l++) {
			for (int c=0;c<col;c++) {
				if (mat[l][c] == n) {
					
					System.out.println("Position: " + l + " " + c);
					if (c > 0) System.out.println("Left: " + mat[l][c-1]);
					if (c < col-1) System.out.println("Right: " + mat[l][c+1]);
					if (l < lin-1) System.out.println("Down: " + mat[l+1][c]);
					if (l > 0) System.out.println("Up: " + mat[l-1][c]);
					System.out.println();
				}
			}
		}
		
		sc.close();
	}
	
	static void position(int l, int c, int lin, int col) {
		
	}
	
}