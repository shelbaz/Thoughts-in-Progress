// This program calculates the user's BMI
import javax.swing.JOptionPane;


public class BMI 
{
	public static void main(String[] args) 
	{
		// Ask the weight and height of the user
		String Userimputweightimp = JOptionPane.showInputDialog ("Enter your weight in Pounds");
		String Userimputheightimp = JOptionPane.showInputDialog ("Enter your height in Inches");
		
		// Set the variables
		double weightimp = Double.parseDouble(Userimputweightimp);
		double heightimp = Double.parseDouble(Userimputheightimp);
		
		// Convert imperial to metric values
		double weightmetric = (weightimp * 0.45359237);
		double heightmetric = (heightimp * 0.0254);
		
		// Calculate user's BMI
		double squareheight = Math.pow(heightmetric,2);
		double bmi = weightmetric / squareheight;
		
		if (weightimp<100 || weightimp>500 || heightimp<60 || heightimp>96)
		{
			System.out.println("Your weight and/or height is out of range.");
		}	
		else
		{
			System.out.println ("BMI is " + bmi);
		}
	}	
}
