package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {

		Date today = null;
		Date tomorrow = null;
		
		try{

			today = new Date(20, 3, 2018);
			System.out.println("Today: " + today);
			tomorrow = new Date(21, 3, 2018);
			System.out.println("Tomorrow: " + tomorrow);

		}catch(DateException exception){

			System.out.println(exception.getMessage());

		}
		finally{

		
		System.out.println(today + " es el mismo día que " + tomorrow + "? " + today.isSameDay(tomorrow) );
		
		System.out.println(today + " es el mismo mes que " + tomorrow + "? " + today.isSameMonth(tomorrow) );
		
		System.out.println(today + " es el mismo año que " + tomorrow + "? " + today.isSameYear(tomorrow) );
		
		System.out.println("Estamos en el mes: " + today.getmonthName() );

		System.out.println("El día del mes es correcto? " + today.isDayRight() );
		
		System.out.println("Estamos en la estación: " + today.monthSeason() );
		
		System.out.println("Hasta final de año quedan los meses: " + today.monthsLeft() );

		System.out.println("La fecha es: " + today.printDate() );
		
		System.out.println("Hasta final de mes quedan los días: " + today.daysLeft() );

		System.out.println("Los meses con el mismo número de días que " + today.getmonthName() + " Son: " + today.monthWithSameDays() );
		
		System.out.println("Desde el primer día del año han pasado: " + today.daysFirstday() + " días.");

		System.out.println("BUCLE WHILE: Han sido necesarios " + today.isSameDateWhile() + " intentos para generar la misma fecha.");

		System.out.println("BUCLE DO-WHILE: Han sido necesarios " + today.isSameDateDoWhile() + " intentos para generar la misma fecha.");

		System.out.println("Considerando que el 1 de Enero fue lunes. El día de la semana de " + today + " es: " + today.dayOfWeek() );

		}
	}
}

