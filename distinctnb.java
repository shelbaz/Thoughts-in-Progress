import java.util.Scanner;


public class distinctnb 
{
	public static void main (String []args)
	{
		// create an array
		int[] numbers = new int[10];
		int distinctnumber = 0;
		int zero = 0;
		
		// ask numbers from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		// loop 10 times
		for (int i = 0 ; i < 10 ; i++)
		{
			int value = input.nextInt();
			int j = 0;
			
			if (value == 0)
				zero = 1;
			
		// check previous numbers, if repetition, j doesn't increase
			for ( ; j < i ; j++)
			{
				if (numbers[j] == value)
				{
					break;
				}
			}
		
		// if no repetition (j = i), value is saved
			if (j == i)
			{
				numbers[i] = value;
				distinctnumber++;
			}
		}
		
		int count = 0;
		
		// print and add exception for 0
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] != 0)
			System.out.print(numbers[i] + " ");
			
			if (zero == 1 && count < 1)
			{
				System.out.print("0 ");
				count++;
			}
		}
	}
}
