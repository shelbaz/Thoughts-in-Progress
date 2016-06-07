// This program asks you 9 digits to display the ISBN-10
import javax.swing.JOptionPane;


public class isbn
{
	public static void main(String[] args) 
	{
		// Ask the 9 first digits
		String Userimput = JOptionPane.showInputDialog ("Enter the ISBN digits");
		
		// Cast the user imput to a variable
		int d1 = (int) ((Double.parseDouble(Userimput)/100000000)%10);
		int d2 = (int) ((Double.parseDouble(Userimput)/10000000)%10);
		int d3 = (int) ((Double.parseDouble(Userimput)/1000000)%10);
		int d4 = (int) ((Double.parseDouble(Userimput)/100000)%10);
		int d5 = (int) ((Double.parseDouble(Userimput)/10000)%10);
		int d6 = (int) ((Double.parseDouble(Userimput)/1000)%10);
		int d7 = (int) ((Double.parseDouble(Userimput)/100)%10);
		int d8 = (int) ((Double.parseDouble(Userimput)/10)%10);
		int d9 = (int) (Double.parseDouble(Userimput)%10);
		
		// Calculate the checksum
		int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		// display the ISBN-10 according to the check sum
		if (checksum == 10)
		{
			System.out.println ("The ISBN-10 number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
		}
		else
		{
			System.out.println ("The ISBN-10 number is: " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
		}
	}	
}