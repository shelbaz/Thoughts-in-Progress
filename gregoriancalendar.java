import java.util.GregorianCalendar;

public class gregoriancalendar 
{
	public static void main(String[] args) 
	{
// declare strings
		String month = "";
		String day = "";
		String year = "";

// get the strings from the gregorian calendar class
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		month = String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH) + 1); 
		day = String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		year = String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
		
// print the current date
		System.out.println(day + " " + month + " " + year);

// get new strings
		gregorianCalendar.setTimeInMillis(1234567898765L);
		month = String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH)+1); 
		day = String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		year = String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));

// print new date
		System.out.println(day + " " + month + " " + year);
	}
}