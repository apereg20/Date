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

		

		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYear(tomorrow));

		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonth(tomorrow) );
		
		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDay(tomorrow) );
	}

	}
}

