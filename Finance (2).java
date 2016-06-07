import javax.swing.JOptionPane;

// This program converts ASCII code to a character
public class Finance 
{
	public static void main(String[] args)
	{
		// Ask the monthly saving 
		String userimput = JOptionPane.showInputDialog ("Enter monthly saving amount");
		
		// Add the input to a variable
		int monthlysaving = (int) Double.parseDouble(userimput);
		
		// Convert the number into a character
		double interest1 = (monthlysaving * 1.00417);
		double interest2 = (monthlysaving + interest1) * 1.00417;
		double interest3 = (monthlysaving + interest2) * 1.00417;
		double interest4 = (monthlysaving + interest3) * 1.00417;
		double interest5 = (monthlysaving + interest4) * 1.00417;
		double interest6 = (monthlysaving + interest5) * 1.00417;
		
		if (monthlysaving<=0)
		{
			System.out.println("You cannot put a negative monthly saving.");
		}
		else 
		{
			System.out.println ("You will have: " + interest6 + " dollars in your account.");
		}		
	}	
}
