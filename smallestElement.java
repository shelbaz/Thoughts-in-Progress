import java.util.Scanner;

public class smallestElement 
{
	public static int SmallestElement(double[]array) 
	{
	
		double min = array[0];
		for (int i = 1; i < array.length ; i++) 
		{
			if (array[i] < min) 
			{
				min = array[i];
			}
		}
	return (int)min;
	}
	
	public static void main(String []args)
	{
		double[] number = new double[10];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		for (int i = 0 ; i < 10 ; i++)
			number[i] = input.nextDouble();
		
		int min = SmallestElement(number);
		System.out.println("The smallest element is: " + min);
	}
}