import javax.swing.JOptionPane;

public class PrintCalendar 
{
	/** Main method */
	public static void main(String[] args) 
	{
		String yearInput = JOptionPane.showInputDialog("Please enter full year (e.g., 2012)");
		int year = Integer.parseInt(yearInput);
		String monthInput = JOptionPane.showInputDialog("Enter month as a number between 1 and 12");
		int month = Integer.parseInt(monthInput);
    
		calendar d = new calendar();
    	
		JOptionPane.showMessageDialog(null, d.printMonthTitle(year, month) + d.printMonthBody(year, month));
  }
}
  
class calendar
{
	  
calendar()
{}

/** Print the calendar for a month in a year */
	public void printMonth(int year, int month) 
	{
		// Print the headings of the calendar
		printMonthTitle(year, month);

		// Print the body of the calendar
		printMonthBody(year, month);
	}

/** Print the month title, e.g., May, 1999 */
	public String printMonthTitle(int year, int month) 
	{
		String Title;
    
		Title = "         " + getMonthName(month) + " " + year + "\n------------------------------------------" + "\n Sun  Mon  Tue  Wed  Thu  Fri  Sat\n";
	
		return Title;
	}

/** Get the English name for the month */
	public String getMonthName(int month) 
	{
		String monthName = "";
		switch (month) 
		{
		case 1: monthName = "January"; break;
		case 2: monthName = "February"; break;
		case 3: monthName = "March"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "May"; break;
		case 6: monthName = "June"; break;
		case 7: monthName = "July"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "September"; break;
		case 10: monthName = "October"; break;
		case 11: monthName = "November"; break;
		case 12: monthName = "December";
		}
		return monthName;
	}

/** Print month body */
	public String printMonthBody(int year, int month) 
	{
    
		String Body = "";
// Get start day of the week for the first date in the month
		int startDay = getStartDay(year, month);

// Get number of days in the month
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

// print the spaces before the first day.
 		int i = 0;
 		if (startDay != 7)
 		{
 			for (i = 0; i < startDay; i++) 
 			{
 				Body += "        ";
 			}
 		}
 		
// print the days in the calendar
 		for (i = 1; i <= numberOfDaysInMonth; i++) 
 		{
 			if (i <= 1)
 				Body += "       " + i;
 			else if (i <= 10)
 				Body += "      " + i;
 			else 
 				Body += "    " + i;
// If there are 7 dates in a line, change line.
 			if ((i + startDay) % 7 == 0)
 				Body += "\n";
 		}
 		return Body;
 	}

  /** Get the start day of month/1/year */
	public int getStartDay(int year, int month) 
	{
		final int START_DAY_FOR_JAN_1_1800 = 3;
// Get total number of days from 1/1/1800 to month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

// Return the start day for month/1/year
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

/** Get the total number of days since January 1, 1800 */
	public int getTotalNumberOfDays(int year, int month) 
	{
		int total = 0;

// Get the total days from 1800 to 1/1/year
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

// Add days from Jan to the month prior to the calendar month
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}

/** Get the number of days in a month */
	public int getNumberOfDaysInMonth(int year, int month) 
	{
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		if (month == 2) return isLeapYear(year) ? 29 : 28;
		return 0;
	}

/** Determine if it is a leap year */
	public boolean isLeapYear(int year) 
	{
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}