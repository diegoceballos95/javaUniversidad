package ejemplosDeClases;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month; //PERMITE USAR MONTH.MES COMO PARAMETRO
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploFechas {

	public static void main(String[] args) {
		
		//FECHA Y HORA ACTUAL
		System.out.println("La fecha actual es: " + LocalDate.now());
		System.out.println( "La hora actual es: " + LocalTime.now() );
		System.out.println( "La fecha y hora actuales son: " + LocalDateTime.now() );
		System.out.println( "El instante actual es: " + Instant.now() );
		System.out.println( "La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now() );
		
		System.out.println("------------------------");
		
		//FECHA Y HORA MODIFICADAS
		System.out.println("La fecha ingresada es: " + LocalDate.of(2020,03,13));
		System.out.println("La OTRA fecha ingresada es: " + LocalDate.of(2020,Month.MARCH,13));
		System.out.println( "La hora ingresada es: " + LocalTime.of(11,25) );
		System.out.println( "La fecha y hora ingresadas son son: " + LocalDateTime.of(2020,03,13,11,25) );
		System.out.println( "La OTRA fecha y hora ingresadas son son: " + LocalDateTime.of(LocalDate.now(), LocalTime.now()));
		
		System.out.println("------------------------");
		
		//EXTRACCION DE FECHA U HORA
		LocalDateTime FecHs = LocalDateTime.of(2023,04,24,12,05,54);
		System.out.println("Fecha y Hora: " + FecHs);
		System.out.println("ANIO: " + FecHs.getYear());
		System.out.println("MES: " + FecHs.getMonth());
		System.out.println("DIA DEL MES: " + FecHs.getDayOfMonth());
		System.out.println("DIA DEL ANIO: " + FecHs.getDayOfYear());
		System.out.println("HORA: " + FecHs.getHour());
		System.out.println("MINUTO: " + FecHs.getMinute());
		System.out.println("SEGUNDO: " + FecHs.getSecond());
		
		System.out.println("------------------------");
		
		//TRANSFORMAR FECHAS Y HS - SUMAR Y RESTAR
		LocalDateTime FecHs2 = LocalDateTime.of(2023,Month.DECEMBER,11,12,30);
		System.out.println("Fecha y Hora: " + FecHs2);
		System.out.println("La fecha dentro de 10 dias: " + FecHs2.plusDays(10) );
		System.out.println("La fecha dentro de 1 semana: " + FecHs2.plusWeeks(1) );
		System.out.println("La fecha dentro de 6 meses atras: " + FecHs2.minusMonths(6) );
		System.out.println("La fecha dentro de 3 anios atras: " + FecHs2.minusYears(3) );
		System.out.println("La fecha y hora de hace 32 horas: " + FecHs2.minusHours(32) );
		System.out.println("La hora dentro de 45 minutos: " + FecHs2.plusMinutes(45) );
		System.out.println("La hora dentro de 45 minutos: " + FecHs2.plusSeconds(60) );
		
		System.out.println("------------------------");
		
		//MODIFICAR FECHAS Y HS, U OBTENER NUEVAS A PARTIR DE ESTAS
		LocalDateTime FecHs3 = LocalDateTime.of(2023,Month.JANUARY,1,12,00);
		System.out.println("Fecha y Hora: " + FecHs3);
		FecHs3 = FecHs3.withYear(2030);
		System.out.println("Fecha Modificada: " + FecHs3);
		FecHs3 = FecHs3.withHour(18);
		System.out.println("Hora Modificada: " + FecHs3);
		
		System.out.println("------------------------");
		
		//TIEMPO TRANSCURRIDO ENTRE FECHAS U HORAS
		LocalDateTime fNacimiento = LocalDateTime.of (1995, Month.DECEMBER, 11, 23, 30);
		System.out.println("Tienes "+ChronoUnit.YEARS.between(fNacimiento, LocalDateTime.now())+" anios");
		System.out.println("Tienes "+ChronoUnit.WEEKS.between(fNacimiento, LocalDateTime.now())+" semanas");
		System.out.println("Tienes "+ChronoUnit.DAYS.between(fNacimiento, LocalDateTime.now())+" dias");
		System.out.println("Tienes "+ChronoUnit.HOURS.between(fNacimiento, LocalDateTime.now())+" horas");
		System.out.println("Tienes "+ChronoUnit.MINUTES.between(fNacimiento, LocalDateTime.now())+" min");
		
		System.out.println("------------------------");
		
		//PARSEAR FyH - INTERPRETARLAS A PARTIR DE UN STRING
		LocalDate hoy = LocalDate.parse("2023-04-27");
		LocalTime hora = LocalTime.parse("12:15:23");
		LocalDateTime hoyMasHora = LocalDateTime.parse("2023-04-27T12:15:23");
		System.out.println(hoy);
		System.out.println(hora);
		System.out.println(hoyMasHora);
		
		System.out.println("------------------------");
		
		//FORMATEAR FyH
		LocalDateTime FecHs4 = LocalDateTime.of (1995,12,11,23,30,15);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String FechaYHs = FecHs4.format(formato);
		System.out.println("Fecha formateada: " + FechaYHs);
		
		
	}

}
