// This program rotates the last digit
import javax.swing.JOptionPane;


public class Second
{
	public static void main(String[] args) 
	{
				
		// Ask the value of price
		String digit1 = JOptionPane.showInputDialog ("Enter the first digit");
		String digit2 = JOptionPane.showInputDialog ("Enter the second digit");
		String digit3 = JOptionPane.showInputDialog ("Enter the third digit");
		String digit4 = JOptionPane.showInputDialog ("Enter the fourth");
		
		// choose the last digit'
		int pos1 =(int) Double.parseDouble(digit1);
		int pos2 =(int) Double.parseDouble(digit2);
		int pos3 =(int) Double.parseDouble(digit3);
		int pos4 =(int) Double.parseDouble(digit4);
		
		// Before rotation
		System.out.println(pos1 + "." + pos2 + "." + pos3 + "." + pos4);
		
		// Rotation
		int temp = pos4;
		pos4 = pos3;
		pos3 = pos2;
		pos2 = pos1;
		pos1 = temp;
			
		// After rotation
		System.out.println(pos1 + "." + pos2 + "." + pos3 + "." + pos4);

	}
}