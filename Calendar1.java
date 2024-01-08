/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int sumOfSundays = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		for (year = 1900; year <= 1999; year++) {
			for (month = 1; month <= 12; month++) {
				for (dayOfMonth = 1; dayOfMonth <= nDaysInMonth(month,year); dayOfMonth++) {
					if(dayOfWeek == 8) {	
					System.out.println(dayOfMonth + "/" + month + "/" + year + "  Sunday"); 
					if(dayOfWeek == 8 && dayOfMonth == 1) {
						sumOfSundays++;
					}	
					dayOfWeek = 1;
					dayOfWeek++;
					

					} else {
					System.out.println(dayOfMonth + "/" + month + "/" + year); 
					dayOfWeek++;
					}
					
				}

			}

		}
		System.out.println("During the 20th century, " + sumOfSundays +  " Sundays fell on the first day of the month");	
   } 

       





		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	   // int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	//while (true) {
	 		//// Write the body of the while 		
	 		//advance();
	 	//	debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 	//	if (false) { 
	 		//	break;
	 		//}
    //    }
	 	//// Write the necessary ending code here
	// }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	// private static void advance() {
		// Replace this comment with your code
	 //} 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    if(year==1900) return false;
		if (year % 4 == 0) 
		return true; 
	    else 
		return false;
	}
	 
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		if(month==4 || month==6 || month==9 || month==11) return 30;
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) return 31;
		if(month==2) {
			if(isLeapYear(year) == true) return 29;
			else return 28;
		}
		return 0;
	}
}
