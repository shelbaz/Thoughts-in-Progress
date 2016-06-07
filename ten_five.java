import java.util.Scanner;

public class ten_five 
{
	public static void main(String [] args)
	{
		// ask a number from the user
		System.out.println("Enter an integer: ");
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		
		// declare a new stack of integers
		StackOfIntegers factors = new StackOfIntegers();
		int count = 0;
		
		// check if a number is a divisor of the number
		for( ; number != 1; count++)
			for(int divisor = 2, x = number ; x == number; divisor++)
					if(number % divisor == 0)
				{
					// use the push method
					factors.push(divisor);
					number = number/divisor;
				}
			
		// print the results
		for(int divisor = 0; divisor < count; divisor++)
			System.out.print(factors.pop() + " ");
	}
}