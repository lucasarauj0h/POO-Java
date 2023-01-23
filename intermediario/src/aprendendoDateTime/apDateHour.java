package aprendendoDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
//import java.util.Random;
import java.util.Scanner;

public class apDateHour {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			//Random random = new Random();
			Scanner sc = new Scanner(System.in);
			
			LocalDate d01 = LocalDate.now();
			//INSTANCIANDO DATA LOCAL DO SISTEMA
			LocalDateTime d02 = LocalDateTime.now();
			Instant d03 = Instant.now();
			//GEROU COM DATA HORA GMT, GEROU COM A DATA HORA NO "PADRAO MUNDIAL", OU SEJA
			//DE LONDRES
			
			LocalDate d04 = LocalDate.parse("2022-07-20");
			LocalDateTime d05 = LocalDateTime.parse("2022-07-20T18:50");
			//COM O CONSTRUTOR TIME, EU DEFINO A DATA E O HORARIO
			Instant d06 = Instant.parse("2022-07-20T23:50:20Z");
			//PARA O INSTANT, É PRECISO DEFINIR OS SEGUNDOS E O PADRÃO ZULU TIME
			Instant d07 = Instant.parse("2022-07-20T23:50:20-03:00");
			//ESPECIFICANDO QUE É EM OUTRO HORARIO, NESSE CASO HORARIO -03:00
			//DO GMT, OU SEJA, CONVERTENDO HORARIO DE LONDRES PARA A HORA DO BRASIL
			

		
			
			
			
			System.out.println("LocalDate: " + d01);
			System.out.println("LocalDateTime: " + d02);
			System.out.println("Instant: " + d03);
			System.out.println("LocalDate.parse();: " + d04);
			System.out.println("LocalDateTime.parse();: " + d05);
			System.out.println("Instant.parse();: " + d06);
			System.out.println("Instant.parse(-03:00);: " + d07);
			System.out.println("_---------------------------------");

			// LocalDate d08 = LocalDate.parse("20/07/2022");
			//NAO FUNCIONA POIS NAO ESTÁ ESPECIFICADO OS DIAS, MESES E ANO
			//System.out.println("LocalDate.parse(dd/mm/aaaa);: " + d08);
			
			DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			//DEFINIMOS O FORMARTO NA VARIAVEL FMT1, DEPOIS CHAMAMOS O 
			//LOCAL DATE E PASSAMOS PARA ELE O FORMATO GRAVADO NA FMT1
			LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
			System.out.println("LocalDate.parse(dd/MM/yyyy);: " + d08);
			//ELE NÃO MUDOU O FORMATO, POREM PASSOU A ACEITAR E INTERPRETA-LO
			

			DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
			//TAMBÉM PODERIA FAZER
			//LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm") );
			
			System.out.println("LocalDate.parse(dd/MM/yyyy HH:mm);: " + d09);
			
			LocalDate d10 = LocalDate.of(1998, 4,5);
			//O LocalDate.of(int ano, int mes, int dia) -
			//SERVE PARA SER ADICIONADO POR PARTES O ANO, MES E DIA

			System.out.println("LocalDate.of(int ano, int mes, int dia): " + d10);
			
			LocalDateTime d11 = LocalDateTime.of(1987, 7, 2, 23, 59);
			System.out.println("LocalDateTime.of(int ano, int mes, int dia, int hour, int minute): " + d11);
			
			sc.close();

	}
}
