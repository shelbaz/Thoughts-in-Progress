// This program asks you the date and tells you the day of the week
import javax.swing.JOptionPane;


public class Dayoftheweek
{
	public static void main(String[] args) 
	{
		// Ask the date
		String Userimputa = JOptionPane.showInputDialog ("Enter year: (e.g., 2012): ");
		String Userimputb = JOptionPane.showInputDialog ("Enter Month: 1-12: ");
		String Userimputc = JOptionPane.showInputDialog ("Enter the day of the month: 1-31: ");
		
		// Cast the user imput to a variable
		int year = (int) Double.parseDouble(Userimputa);
		int m = (int) Double.parseDouble(Userimputb);
		int q = (int) Double.parseDouble(Userimputc);
		int j = year / 100;
		int k = year % 100;
		
		// Display the date of the week according to the month
		if (m == 1 || m == 2)
		{
			int h = (q + (26 * ((m + 12) + 1)) / 10 + (k - 1) + (k - 1) / 4 + j / 4 + 5 * j) % 7;
			
			if (h == 0)
			{
				System.out.println ("Day of the week is Saturday");
			}
			else if (h == 1)
			{
				System.out.println ("Day of the week is Sunday");
			}
			else if (h == 2)
			{
				System.out.println ("Day of the week is Monday");
			}
			else if (h == 3)
			{
				System.out.println ("Day of the week is Tuesday");
			}
			else if (h == 4)
			{
				System.out.println ("Day of the week is Wednesday");
			}
			else if (h == 5)
			{
				System.out.println ("Day of the week is Thursday");
			}
			else if (h == 6)
			{
				System.out.println ("Day of the week is Friday");
			}
			else
			{
				System.out.println ("Please enter a valid date");
			}
		}
		else
		{
			int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
			
			if (h == 0)
			{
				System.out.println ("Day of the week is Saturday");
			}
			else if (h == 1)
			{
				System.out.println ("Day of the week is Sunday");
			}
			else if (h == 2)
			{
				System.out.println ("Day of the week is Monday");
			}
			else if (h == 3)
			{
				System.out.println ("Day of the week is Tuesday");
			}
			else if (h == 4)
			{
				System.out.println ("Day of the week is Wednesday");
			}
			else if (h == 5)
			{
				System.out.println ("Day of the week is Thursday");
			}
			else if (h == 6)
			{
				System.out.println ("Day of the week is Friday");
			}
			else
			{
				System.out.println ("Please enter a valid date");
			}
		}
	}	
}