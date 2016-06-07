// This program shows he last digit
import javax.swing.JOptionPane;


public class Fifth
{
	public static void main(String[] args) 
	{
				
		// Ask the value of price
		String digits = JOptionPane.showInputDialog ("Enter the value here");
		
		// choose the last digit
		int x =(int) (Double.parseDouble(digits)%10);
		
		// expression
		System.out.println(x);
	}
}