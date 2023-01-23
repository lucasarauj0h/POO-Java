package aprendendoString;
import java.util.Locale;
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		System.out.println("Hello Wolrd");
		System.out.println("Bom dia!");
		
		int y = 32;
		System.out.println(y);
		
		double xz = 14.8785;
		System.out.println(xz);
		System.out.printf("%.2f\n", xz);
		
		System.out.printf("Resultado = "+(y+xz)+" Metros\n");
		System.out.printf("Resultado = %.2f Metros\n", (y+xz));
		
		String nome = "Maria";
		int idade = 21;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha %.0f reais\n", nome, idade, renda);
		
		//exercicio de fixação
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		Double price1 = 2100.0;
		Double price2 = 650.50;
		Double measure = 53.234567;
		
		System.out.printf("Products\n%s, which price is $ %.2f\n%s, which price is $ %.2f\n", product1, price1, product2, price2);
		System.out.printf("Redord: %d years old, code %d, and gender %s\n", age, code, gender);
		
		
		
		
		
	}

}
