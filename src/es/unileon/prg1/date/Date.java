package es.unileon.prg1.date;

public class Date {

	private int day;
	private int month;
	private int year;
	

	//CONSTRUCTOR **********************************************************************************************
	public Date(int day, int month, int year)throws DateException{

		this.year = year;
		if(month < 1 || month > 12){

			throw new DateException("Mes "+month+" no válido."+ " Valores posibles entre 1 y 12.");

		}else{
			this.month = month;

		}
		//Comprobar el día del mes
		switch(month){
		
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				
				if(day < 1 || day > 31){
					
					throw new DateException("Día "+day+" no válido."+ " Valores posibles entre 1 y 31.");
				}
				else{
					this.day = day;
				}
				
				break;
				
			case 4:
			case 6:
			case 9:
			case 11:
				
				if(day < 1 || day > 30){
					
					throw new DateException("Día "+day+" no válido."+ " Valores posibles entre 1 y 30.");
				}
				else{
					this.day = day;
				}
				
				break;
				
			case 2: 
				
				if(day < 1 || day > 28){
					
					throw new DateException("Día "+day+" no válido."+ " Valores posibles entre 1 y 28.");
				}
				else{
					this.day = day;
				}
				
				break;
		}
			

	}
	
	//YEAR *****************************************************************************************************
	
	public int getYear(){
		return this.year;
	}
	
	public void setYear(int newYear){
		
	}

	boolean isSameYear(Date anotherYear){
		if ( this.year == anotherYear.getYear() ){
			return true;
		}
		else{

			return false;
		}
	}
	
	//MONTH ****************************************************************************************************

	public int getMonth() {
	
		return this.month;

	}
	
	public void setMonth(int newMonth){
		
	}

	boolean isSameMonth(Date anotherMonth){

		if (this.month == anotherMonth.getMonth() ){

			return true;

		}
		else{

			return false;
		}
	}
	
	//DAY ******************************************************************************************************	

	public int getDay() {
	
		return this.day;

	}
	
	public void setDay(int newDay){
		
	}

	boolean isSameDay(Date anotherDay) {

		if (this.day == anotherDay.getDay() ){

			return true;

		}
		else{

			return false;
		}
	}
	
	//SAME *****************************************************************************************************
	
	boolean isSame(Date anotherDate){
		
		if((this.day == anotherDate.getDay() ) && (this.month == anotherDate.getMonth() ) && (this.year == anotherDate.getYear() )){
		
					return true;
		}
		else{
			
			return false;
		}
		
	}
	
	public String toString(){
		
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	//NOMBRE DEL MES *******************************************************************************************
	
	public String getmonthName(){
		
		String nameMonth = null;
		
			switch (this.month){
			
				case 1:	
					nameMonth = "Enero.";
					break;
				
				case 2:
					nameMonth = "Febrero.";
					break;
					
				case 3:
					nameMonth = "Marzo.";
					break;
					
				case 4:
					nameMonth = "Abril.";
					break;
					
				case 5:
					nameMonth = "Mayo.";
					break;
					
				case 6:
					nameMonth = "Junio.";
					break;
					
				case 7:
					nameMonth = "Julio.";
					break;
					
				case 8:
					nameMonth = "Agosto.";
					break;
					
				case 9:
					nameMonth = "Septiembre.";
					break;
					
				case 10:
					nameMonth = "Octubre.";
					break;
					
				case 11:
					nameMonth = "Noviembre.";
					break;
					
				case 12:
					nameMonth = "Diciembre.";
					break;
					
			}
			return nameMonth;
	}
	
	//ESTACIÓN DEL AÑO *****************************************************************************************
	
	public String monthSeason(){
		
		String seasonMonth = null;
		
		switch(this.month){
		
			case 1:
			case 2:
				seasonMonth = "Invierno.";
				break;
				
			case 3:
				if(day < 21){
					seasonMonth = "Invierno.";
				}
				else{
					seasonMonth = "Primavera.";
				}
				break;
			case 4:
			case 5:
				seasonMonth = "Primavera.";
				break;
				
			case 6:
				if(day < 21){
					seasonMonth = "Primavera.";
				}
				else{
					seasonMonth = "Verano.";
				}
				break;
				
			case 7:
			case 8:
				seasonMonth = "Verano.";
				break;
				
			case 9:
				if(day < 23){
					seasonMonth = "Verano.";
				}
				else{
					seasonMonth = "Otoño.";
				}
				break;
				
			case 10:
			case 11:
				seasonMonth = "Otoño.";
				break;
				
			case 12:
				if(day < 21){
					seasonMonth = "Otoño.";
				}
				else{
					seasonMonth = "Invierno.";
				}
				break;
		}
		return seasonMonth;
		
	}
	
	//MESES QUE QUEDAN HASTA FINAL DE AÑO **********************************************************************

	public String monthsLeft(){
		
		StringBuilder months = new StringBuilder();
		
		for(int i = this.month + 1; i <= 12; i++){
			
			months.append(this.getmonthName());
		}
		
		return months.toString();
	}
	

}

