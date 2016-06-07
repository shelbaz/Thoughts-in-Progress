import java.util.Scanner;

public class calendar
{
	public static void main(String[] args)
	{

// ask the user the year and the first day of the year.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = input.nextInt();
		System.out.println("Enter the first day of the year:");
		int firstDay = input.nextInt();
		int startDay = firstDay;
		int nbday = 0;

// check if the inputs are logical
		if (firstDay < 1 || firstDay > 7)
		{
			System.out.println("Please enter the first day of the year (1 to 7).");
			System.exit(0);
		}

// loop if the number of month printed is smaller than 12.
		for (int month = 1; month <= 12; month++)
		{
			System.out.print("     \t\t\t  ");
			
// print the month and year line and selects the number of days in the month
			switch (month) 
			{ 
				case 1:
					System.out.println("January " + year); break;
				case 2: 
					System.out.println("Feburary " + year); break;
				case 3:
					System.out.println("March " + year); break;
				case 4:
					System.out.println("April " + year); break;
				case 5:
					System.out.println("May " + year); break;
				case 6:
					System.out.println("June " + year); break;
				case 7:
					System.out.println("July " + year); break;
				case 8:
					System.out.println("August " + year); break;
				case 9:
					System.out.println("September " + year); break;
				case 10:
					System.out.println("October " + year); break;
				case 11:
					System.out.println("November " + year); break;
				case 12:
					System.out.println("December " + year); break;
			}
			
// Select the number of days in the month according to the month			
			switch (month) 
			{ 
				case 1:
					nbday = 31;	break;
				case 2:
					if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
						nbday = 29;
					else
						nbday = 28;	break;
				case 3:
					nbday = 31;	break;
				case 4:
					nbday = 30;	break;
				case 5:
					nbday = 31;	break;
				case 6:
					nbday = 30;	break;
				case 7:
					nbday = 31;	break;
				case 8:
					nbday = 31;	break;
				case 9:
					nbday = 30;	break;
				case 10:
					nbday = 31;	break;
				case 11:
					nbday = 30;	break;
				case 12:
					nbday = 31; break;
			}

			System.out.println("       ____________________________________________________");
			System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");

// print the spaces before the first day.
			int i = 0;
			if (startDay != 7)
			{
				for (i = 0; i < startDay; i++) 
				{
					System.out.print("\t");
				}
			}
			
// print the days in the calendar
			for (i = 1; i <= nbday; i++) 
			{
				if (i < 10)
					System.out.print("\t" + i);
				else 
					System.out.print("\t" + i);
// If there are 7 dates in a line, change line.
				if ((i + startDay) % 7 == 0)
					System.out.println();
			}

// print lines between months
			System.out.println("\n");
			
// Set the startday of the next month
			startDay = (startDay + nbday) % 7;
		}
	}
}