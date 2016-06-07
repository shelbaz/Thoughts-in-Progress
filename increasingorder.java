import java.util.Scanner;

public class increasingorder 
{
	// receives 3 numbers from the user
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner input = new Scanner (System.in);
		displaySortedNumbers(input.nextDouble(), input.nextDouble(), input.nextDouble());
	}
	
	// verifies the order and prints the numbers in an increasing order
	public static void displaySortedNumbers(double num1, double num2, double num3)
	{
		if (num1 > num2 && num2 > num3)
		{
			System.out.println (num3 + " " + num2 + " " + num1);
		}
		else if (num1 > num3 && num3 > num2)
		{
			System.out.println (num2 + " " + num3 + " " + num1);
		}
		else if (num2 > num1 && num1 > num3)
		{
			System.out.println (num3 + " " + num1 + " " + num2);
		}
		else if (num2 > num3 && num3 > num1)
		{
			System.out.println (num1 + " " + num3 + " " + num2);
		}
		else if (num3 > num2 && num2 > num1)
		{
			System.out.println (num1 + " " + num2 + " " + num3);
		}
		else if (num3 > num1 && num1 > num2)
		{
			System.out.println (num2 + " " + num1 + " " + num3);
		}
		else
		{
			System.out.println("Enter three different numbers");
		}
	}
}
