package aprendendoDateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
	
public class calculosDateHour {
	
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T18:50");
		Instant d06 = Instant.parse("2022-07-20T01:50:20Z");
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(d04);
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate.format(fmt));
		//SUBTRAIR - MINUS || ADICIONAR - PLUS 
		
		LocalDate nextWeekLocalDate = d04.plusDays(4);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate.format(fmt));
		
		System.out.println(d05);
		System.out.println("Original hour: " + d05.format(DateTimeFormatter.ofPattern("HH:mm")));
		LocalDateTime nextHour = d05.plusHours(1);
		System.out.println("nextHour: " + nextHour.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		
		System.out.println();
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		//PARA FAZER ISSO COM UM INSTANT TEM Q SER DESSA MANEIRA
		
		System.out.println("pastWeekInstant: "+pastWeekInstant);
		System.out.println("nextWeekInstant: "+nextWeekInstant);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//COMO CALCULAR A DIFERENÇA DE TEMPO ENTRE DOIS DATETIME
		
		//INTANCIAR A CLASSE DURATIONS
		//A CLASSE DURATION NÃO FUNCIONA COM LocalDate, POIS ESSE NÃO POSSUI HORA
		//PARA A CLASE LocalDate PASSAR A FUNCIONAR USAMOS O CONSTRUTOR .atTime E
		//EM SEU PARAMENTROS PASSAMOS 1º A HORA, E DEPOIS OS MINUTOS.
		//OU PODEMOS USAR O atStartOfDay
		Duration t1 = Duration.between(nextWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
		System.out.println(t1.toDays());
		
		Duration t2 = Duration.between(nextHour, d04.atStartOfDay());
		System.out.println("Horas de diferença: " + t2.toHours());
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("Diferença de dias Instant: " + t3.toDays());

		
		
	}

}
