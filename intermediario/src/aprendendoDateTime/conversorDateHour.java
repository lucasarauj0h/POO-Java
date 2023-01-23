package aprendendoDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class conversorDateHour {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T18:50");
		Instant d06 = Instant.parse("2022-07-20T01:50:20Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("LocalDate.parse();: " + d04.format(fmt1));
		System.out.println("LocalDate.parse();: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("LocalDate.parse();: " + fmt1.format(d04));
		System.out.println("------------------------------------------------------");
		
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy/dd HH:mm");

		System.out.println("LocalDateTime.parse();: " + d05.format(fmt2));
		System.out.println("LocalDateTime.parse();: " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("LocalDateTime.parse();: " + fmt2.format(d05));
		System.out.println("------------------------------------------------------");
	
		
		
		//O INSTANT NAO ATENDE AO FORMATO ANTERIOR, ELE NÃO ACEITA POIS NAO É INFORMADO ZONA
		//ABAIXO É DEMONSTRADO COMO DEFINIR A ZONA
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MM/yy HH:mm").withZone(ZoneId.systemDefault());
		//O INSTANT TAMBEM NAO ACEITA O .FORMAT, ENTÃO PARA CHAMARMOS ELE, UTILIZAMOS O
		//FMT3 E POR ELE CHAMAMOS O INSTANT 
		System.out.println("Instant.parse();: " + fmt3.format(d06));
		
		Instant d10 = Instant.now();
		System.out.println();
		System.out.println("Data e hora em londres: "+ d10);
		System.out.println();
		System.out.println("Convertendo para o horario brasileiro");
		System.out.println("DateTimeFormatter.ofPattern(\"MM/yy HH:mm\").withZone(ZoneId.systemDefault());");
		System.out.println("Instant.parse();: " + fmt3.format(d10));
		
		System.out.printf("\n\n\n");
		
		Instant d20 = Instant.parse("2022-07-20T01:50:20Z");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("Data e hora em Londres: "+ d20);
		System.out.println("Data e hora no Brasil: "+ fmt4.format(d20));
		
		
	}

}
