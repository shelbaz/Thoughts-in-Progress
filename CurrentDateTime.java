
public class CurrentDateTime 
{
	public static void main (String[] args)
	{
		double millis = System.currentTimeMillis();
		System.out.println("Current date and time is " + month(millis) + " " + day(millis) + ", " + year(millis) + " " + hour(millis) + ":" + minute(millis) + ":" + second(millis));
	}
	
	public static int year (double num)
	{
		int year = (int) (num / 1000 / 60 / 60 / 24 / 365 + 1970);
		return year;
	}
	
	public static String month (double num)
	{
		int day = (int) (num / 1000 / 60 / 60 / 24 % 365);
		if (day <= 31)
			return "January";
		else if (day <= 59)
			return "February";
		else if (day <= 90 )
			return "March";
		else if (day <= 120)
			return "April";
		else if (day <= 151)
			return "May";
		else if (day <= 181)
			return "June";
		else if (day <= 212)
			return "July";
		else if (day <= 243)
			return "August";
		else if (day <= 273)
			return "September";
		else if (day <= 304)
			return "October";
		else if (day <= 334)
			return "November";
		else 
			return "december";
	}
	
	public static int day (double num)
	{
		int day = (int) (num / 1000 / 60 / 60 / 24 % 365);

		if (day <= 31)
			return day;
		else if (day <= 59)
			return (day - 31);
		else if (day <= 90 )
			return (day - 59);
		else if (day <= 120)
			return (day - 90);
		else if (day <= 151)
			return (day - 120);
		else if (day <= 181)
			return (day - 151);
		else if (day <= 212)
			return (day - 181);
		else if (day <= 243)
			return (day - 212);
		else if (day <= 273)
			return (day - 243);
		else if (day <= 304)
			return (day - 273);
		else if (day <= 334)
			return (day - 314);
		else 
			return (day - 334);
	}
	
	public static int hour (double num)
	{
		int hour = (int) ((((num / 1000) / 60) / 60) % 24) - 5;
		return hour;
	}
	
	public static int minute (double num)
	{
		int minute = (int) (num / 1000 / 60 % 60);
		return minute;
	}
	
	public static int second (double num)
	{
		int second = (int) (num / 1000 % 60);
		return second;
	}
	
	
}
