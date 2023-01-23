package programExercises;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

// colocar o nome correto na public class
public class ListAula {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>(); //NÃO ACEITA TIPOS PRIMITIVOS, TEM QUE USAR SEMPRE A WRAPPER CLASS 
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Marco");
		
		//list.remove(1);
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		

		System.out.println("------------------------------------");
	
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------------------");
	
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); 
		//TRAZ O VALOR DO [] DO NOME PROCURADO NA LISTA 
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		//QUANDO INDEX NAO ENCONTRA O ARGUMENTO ELE RETORNA VALOR -1
		
		//FILTRANDO UMA LISTA COM UM ARGUMENTO ESPECIFICO

		System.out.println("------------------------------------");
	
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
		
		System.out.println(x);
		
		}
		
		System.out.println("------------------------------------");
		
		//ACHANDO PRIMEIRO ELEMENTO QUE ATENDA AO PREDICATO
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("Index of "+name+": "+list.indexOf(name));
		
		sc.close();
	}
}