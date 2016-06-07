
public class countSingleDigits
{
	public static void main(String[] args)
	{
		// create an array
		int[] numbers = new int[10];
		
		// generate 100 numbers and count each repetition
		for (int i = 0; i < 100; i++) 
		{
			int value = (int) (Math.random() * 10);
			numbers[value] += 1;
		}
		
		// print
		for (int i = 0; i < numbers.length; i++)
			System.out.println("Count for " + i + " is " + numbers[i]);
	}
}
