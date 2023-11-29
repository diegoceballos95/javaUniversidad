package fechas;

//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;

public class TestFecha {

	public static void main(String[] args) {
		
//		LocalDate fecha;
//		LocalTime hora;
//		LocalDateTime fechaYHora, fechaOrigen;
//		
//		fechaYHora = LocalDateTime.now(); //ASIGNA FECHA Y HORA ACTUAL
//		fechaOrigen = LocalDateTime.of(2002,02,02,14,30); //COLOCO FECHA Y HS QUE QUIERO
//		
//		//FORMATEAR FECHA Y HORA
//		DateTimeFormatter formato;
//		formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//		
//		//MUESTRA FECHA, HORA (INCLUYE MILISEG)
//		System.out.println(fechaOrigen.format(formato));
//		System.out.println(fechaYHora.format(formato)); 
//		
//		//RESTA: fechaYHora - fechaOrigen
//		System.out.println(ChronoUnit.YEARS.between(fechaOrigen, fechaYHora)); 
		
		Fecha f = new Fecha();
		System.out.println("Fecha actual: " + f);
		
		f.setAnio(2024);
		System.out.println(f.getAnio());
		System.out.println("Fecha con anio modificado: " + f);
	}

}
