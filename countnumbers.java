import java.util.Scanner;

public class countnumbers 
{
	public static void main(String []args)
	{
		// ask the numbers
		System.out.print("Enter some numbers, the input ends if it is 0:\n");
		Scanner input = new Scanner (System.in);
		
		// declare and initialize the variables
		int x = 1;
		double countpos = 0;
		double countneg = 0;
		int total = 0;
		double avg = 0.0;
		
		// apply the loop
		do 
		{
			x = input.nextInt();
			total += x;
			if (x > 0)
			{
				countpos++;
			}
			else if (x < 0)
			{
				countneg++;
			}
		} while (x != 0);
		
		if (total == 0)
		{
			System.out.println("No numbers are entered except 0");
		}
		// print the results
		else
		{
		avg = (total / (countpos + countneg));		
		System.out.println("The number of positives is " + (int) countpos);
		System.out.println("The number of negatives is " + (int) countneg);
		System.out.println("The total is " + total);
		System.out.println("The average is " + avg);
		}
	}
}
