import java.util.Scanner;

public class distinctNumbers
{
	public static void main(String[] args)
	{
		// create an array
		int[] numbers = new int[10];
		int distinctValue = 0;
		
		// ask numbers from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		// loop the number of inputs according to the length of the array
		for (int i = 0; i < numbers.length; i++)
		{
			int value = input.nextInt();
			int j = 0;
		
		// check if the input is the same as a number inside the array. If yes, j doesn't increase
			for (; j < distinctValue; j++) 
			{
				if (numbers[j] == value) 
					break;
			}
		
		// if there was no repetition, the last imputed value will be saved in the array
			if (j == distinctValue) 
			{
				numbers[distinctValue] = value;
				distinctValue++;
			}
		}
		
		// print
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < distinctValue; i++)
			System.out.print(numbers[i] + " ");
	}
}