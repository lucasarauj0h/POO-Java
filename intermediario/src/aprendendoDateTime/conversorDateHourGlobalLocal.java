package aprendendoDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class conversorDateHourGlobalLocal {

		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			
			LocalDate d04 = LocalDate.parse("2022-07-20");
			LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:50");
			Instant d06 = Instant.parse("2022-07-20T01:50:20Z");
			
			DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.systemDefault());
			
			System.out.println("Padrão: (ZoneId de Londres) " + formato1.format(d06));
			 
			LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
			//VAI ADICIONAR A VAR r1 O INTANT CONTIDO NO D06, COM O FUSO HORARIO DEFAULT DO SISTEMA
			System.out.println(r1);
			//COMO ESTAMOS A -03:00 HORAS DO HORARIO DE LONDRES, O DIA RETORNOU
			
			LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
			//ADICIONAR A R2 UM LOCAL DATE, DO INSTANT 06 E COM PARAMETRO A ZONA DE PORTUGAL
			//O ZoneId. SERVE PARA CHAMAR O CONSTRUTOR ZONA, E PASSAMOS of("") <- PARAMETRO
			System.out.println(r2);
			
			LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
			System.out.println(r3 + " Subtraiu-se -3 horas, pois a zona do Brazil se encontra em -03:00 GMT");
			//DATA E HORARIO NO BRASIL
			
			LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
			System.out.println(r4 + " Adicionou-se +1 hora, pois a zona de Portugal se encontra em +01:00 GMT");
			
			//for (String s : ZoneId.getAvailableZoneIds()){
			//MOSTRA TODAS AS ZONAS DISPONIVEIS
			//	System.out.println(s);
			//}
			
			//IMPRIMINDO O DIA
			
			System.out.println("Ano d04: " + d04.getYear());
			System.out.println("Hora de d05: " + d05.getHour());
			System.out.println("Minutos de d05: " + d05.getMinute());
			//NÃO É POSSIVEL USAR O GET COM UM INSTANT
		}

	}
