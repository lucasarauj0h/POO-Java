package aprendendoString;
import java.util.Locale;
import java.util.Scanner;

public class entrada_dados2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1,s2,s3;
		
		x = sc.nextInt();
		// para consumir o "enter" que ficara alocado no next line
		sc.nextLine();
		s1 = sc.nextLine();
		//para ler uma frase inteira necessita do .nextLine();
		
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		//System.out.printf("Dados digitados: %s\n", s1);
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
