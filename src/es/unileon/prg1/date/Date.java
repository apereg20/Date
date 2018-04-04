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
				if(day <= 20){
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
				if(day <= 20){
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
				if(day <= 22){
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
				if(day <= 20){
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
		
		int k = 0, month = 0;
		k =  this.month;
		month = this.month;
		
		for(int i = k;  i <= 12; i++){
			
			months.append("\n" + this.getmonthName());
			this.month = this.month+ 1;
			
		}
		this.month = month;
		return months.toString();
	}
	
	//METODO QUE IMPRIME LA FECHA ******************************************************************************
	
	
	
	//DIAS QUE QUEDAN HASTA FINAL DE MES ***********************************************************************
	
	public String daysLeft(){
		
		StringBuilder days = new StringBuilder();
		
		int k = 0;
		k =  this.day;
		
		if(this.month != 2){
			
			if((this.month != 4) || (this.month != 6) || (this.month != 9) || (this.month != 11)){
		
				for(int i = k;  i <= 31; i++){
			
					days.append("\n" + k);
					k++;
			
				}
			}
			else{
				
				for(int i = k;  i <= 30; i++){
					
					days.append("\n" + k);
					k++;
			
				}
			}
		}
		else{
			
			for(int i = k;  i <= 28; i++){
				
				days.append("\n" + k);
				k++;
		
			}
		}
		
		return days.toString();
	}
	
	//NUMERO DE DIAS DESDE EL PRMER DIA DEL AÑO ****************************************************************
	
	public int daysFirstday(){
		
		int k = 0, m = 0;
		m = this.month;
		m--;
		int i = 0;
		
		for(i = 1; i <= m; i++){
			
			if(i != 2){
				
				if((i != 4) || (i != 6) || (i != 9) || (i != 11)){
				
					k = k + 31;
				}
				else{

					k = k + 30;
				}
			}
			else{
				
				k = k + 28;
			}
		}
		k = k + this.day;
		
		return k;
	}

//Nº intentos para generar fecha igual a la introducida ***********************************************************************

	//CON WHILE ************************************************************************************************

	public int isSameDateWhile(){
		
		int counter = 0;
		int _day = 0;
		int _month = 0;

		while((_day != this.day) || (_month != this.month)){

			_month = (int) (Math.random() * 12) + 1;

			if(_month == 2){

				_day = (int) (Math.random() * 28) + 1;

			}
			else{

				if((_month == 4) || (_month == 6) || (_month == 9) || (_month == 11)){

					_day = (int) (Math.random() * 30) + 1;

				}
				else{

					_day = (int) (Math.random() * 31) + 1;

				}
		}
			
			counter++;

		}

		return counter;
	}
	
	//CON DO-WHILE *********************************************************************************************

	public int isSameDateDoWhile(){
		
		int counter = 0;
		int _day = 0;
		int _month = 0;

		do{

			_month = (int) (Math.random() * 12) + 1;

			if(_month == 2){

				_day = (int) (Math.random() * 28) + 1;

			}
			else{

				if((_month == 4) || (_month == 6) || (_month == 9) || (_month == 11)){

					_day = (int) (Math.random() * 30) + 1;

				}
				else{

					_day = (int) (Math.random() * 31) + 1;

				}
		}
			
			counter++;

		}
		while((_day != this.day) || (_month != this.month));

		return counter;
	}	
	
}

