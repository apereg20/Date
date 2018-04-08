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

	//ANOTHER **************************************************************************************************

	public Date(Date another){

		day = another.getDay();
		month = another.getMonth();
		year = another.getYear();
	
	}
	
	//YEAR *****************************************************************************************************
	
	public int getYear(){
		return this.year;
	}
	
	public void setYear(int newYear) throws DateException{
		
		if(newYear <= 0){
			
			throw new DateException("Los años no pueden ser menores o iguales que 0.");

		}
		else{
		
			year = newYear;
	
		}
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
	
	public void setMonth(int newMonth) throws DateException{

		if(newMonth > 12){

			throw new DateException("Los meses no pueden ser mayores que 12.");

		}
		else{

			if(newMonth <= 0){
			
				throw new DateException("Los meses no pueden ser menores o iguales que 0.");

			}
			else{
		
				month = newMonth;
	
			}
		}
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
	
	public void setDay(int newDay) throws DateException{
	
		if(newDay <= 0){

			throw new DateException("Los días no pueden ser menores o iguales que 0.");

		}
		else{

			if(newDay > daysOfMonth(month)){
			
				throw new DateException("No hay tantos días en este mes.");

			}
			else{
		
				day = newDay;
	
			}
		}
	
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

	//NUMERO DE DIAS EN CADA MES *******************************************************************************

	public int daysOfMonth(int month){

		int nDays = 0;

		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:

				nDays = 31;
				break;

			case 4:
			case 6:
			case 9:
			case 11:

				nDays = 30;
				break;

			case 2:

				nDays = 28;
				break;

		}

		return nDays;

	}

	public int daysOfMonth(){
	
		return this.daysOfMonth(month);

	}
	
	//NOMBRE DEL MES *******************************************************************************************
	
	public String getmonthName(int month){
		
		String nameMonth = null;
		
			switch (month){
			
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

	public String getmonthName(){
	
		return this.getmonthName(month);

	}

	//COMPROBAR SI EL DIA DEL MES ES CORRECTO ******************************************************************

	public boolean isDayRight(){

		boolean right = false;

		switch(month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:

				if((day >= 1) && (day <= 31)){

					right = true;
				}

				break;

			case 4:
			case 6:
			case 9:
			case 11:

				if((day >= 1) && (day <=30)){

					right = true;
				}
				
				break;

			case 2:
		
				if((day >= 1) && (day <= 28)){

					right = true;
				}

				break;

		}

		return right;

	}
	
	//ESTACIÓN DEL AÑO *****************************************************************************************
	
	public String monthSeason(){
		
		String seasonMonth = null;
		
		switch(month){
		
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
		
		int k = 0;
		k =  month;
		int _month = month;
		
		for(int i = k;  i <= 12; i++){
			
			months.append("\n" + this.getmonthName());
			month = month+ 1;
			
		}

		this.month = _month;
		return months.toString();
	}
	
	//IMPRIME LA FECHA *****************************************************************************************
	
	public String printDate(){

		StringBuffer dateprint = new StringBuffer();

		dateprint.append(getDay() + "/" + getMonth() + "/" + getYear() );

		return dateprint.toString();
	}
	
	//DIAS QUE QUEDAN HASTA FINAL DE MES ***********************************************************************
	
	public String daysLeft(){
		
		StringBuilder days = new StringBuilder();
		
		int k = 0;
		k =  day;

		if(month != 2){
			
			if((month != 4) || (month != 6) || (month != 9) || (month != 11)){
		
				for(int i = k;  i <= 31; i++){
			
					days.append("\n" + k + "/" + month + "/" + year);
					k++;

				}
			}
			else{
				
				for(int i = k;  i <= 30; i++){
					
					days.append("\n" + k + "/" + month + "/" + year);
					k++;
			
				}
			}
		}
		else{
			
			for(int i = k;  i <= 28; i++){
				
				days.append("\n" + k + "/" + month + "/" + year);
				k++;

			}
		}
		
		return days.toString();
		

	}

	//MESES CON EL MISMO NUMERO DE DIAS ************************************************************************

	public String monthWithSameDays(){

		StringBuffer dias = new StringBuffer();
		int thismonth = 0;
		thismonth = this.month;

		for(int i = 1; i <= 12; i++){

			if(daysOfMonth(i) == daysOfMonth(thismonth)){

				dias.append("\n" + getmonthName(i));

			}
		}

		this.month = thismonth;

		return dias.toString();

	}
	
	//NUMERO DE DIAS DESDE EL PRMER DIA DEL AÑO ****************************************************************
	
	public int daysFirstday(){
		
		int k = 0, m = 0;
		m = month;

		int i = 0;
		
		for(i = 1; i < m; i++){
			
			if(i == 2){

				k = k + 28;

			}
			else{
				
				if((i == 4) || (i == 6) || (i == 9) || (i == 11)){
				
					k = k + 30;
				}
				else{

					k = k + 31;
				}
			}
		}

		k = k + day;
		
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

	//DIA DE LA SEMANA *****************************************************************************************

		//Suponiendo que el primer dia del año fuese lunes

	public String dayOfWeek(){

		int _day = 0;
		String weekDay = null;

		_day = (this.daysFirstday()) % 7;

		switch(_day){

			case 0:

				weekDay = "Domingo.";
				break;

			case 1:

				weekDay = "Lunes.";
				break;

			case 2:
		
				weekDay = "Martes.";
				break;

			case 3:

				weekDay = "Miércoles.";
				break;

			case 4:

				weekDay = "Jueves.";
				break;

			case 5:
			
				weekDay = "Viernes.";
				break;

			case 6:

				weekDay = "Sábado.";
				break;

		}

		return weekDay;

	}

}

