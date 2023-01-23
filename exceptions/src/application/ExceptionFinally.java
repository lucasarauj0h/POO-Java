package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionFinally {
	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		//FILE É UMA CLASSE DO JAVA
		//VAI TENTAR LER O FILE -(ARQUIVO)- DECLARADO
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			//INSTANCIA O SCANNER COM A FILE
			//HAS NEXT LINE --- ENQUANTO HOUVER UMA PROXIMA LINHA, RODE O BLOCO DE COMANDO
			while (sc.hasNextLine()) {
				//FAZ LER OQ ESTÁ DENTRO DO ARQUIVO.
				System.out.println(sc.nextLine());
				//SC.NEXTLINE ESTÁ PEGANDO DIRETAMENTE AS LINHAS QUE ESTÃO NO ARQUIVO
			}
		} 
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
			//CASO DE ERRO - EXIBA
		} 
		finally {
			if (sc != null) {
				//SE O SCANNER FOR DIFERENTE DE NULO (OU SEJA, SE HOUVER ALGO DENTRO, FECHE O SC)
				sc.close();
			}
		}
	}
}