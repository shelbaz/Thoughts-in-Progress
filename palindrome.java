import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args)
	{
		// ask the user for a number
		System.out.println("Enter a number");
		Scanner input = new Scanner (System.in);
		int userinput = input.nextInt();
		
		// invokes the first method and prints out the reversed number
		System.out.println("The reverse of this number\n" + reverse(userinput));
		
		// it invokes the second method and prints out whether the number is a palindrome
		if (isPalindrome(userinput) == true)
		{
			System.out.println("This number is a palindrome number");
		}
		else if (isPalindrome(userinput) == false)
		{
			System.out.println("This number is not a palindrome number");
		}
	}
	
	// this method receives an integer from the main method and returns the reversed number
	public static int reverse(int number)
	{
		String reversestring = "";
		
		// if there is a "0" at the beginning of the number, add the 0 into the string and shorten the integer
		if ((number % 10) == 0)
		{
			number /= 10;
			reversestring = "0";
		}
		
		// loop inif there is a 0 inside the number, add a 0 to the string
		while ((number % 10) != 0)
		{
			reversestring += (number % 10);
			number /= 10;
			if ((number % 10) == 0 && number != 0)
			{
				number /= 10;
				reversestring += "0";
			}
		}
		int reverseint = Integer.parseInt(reversestring);
		return reverseint;
	}
	
	// receives the number from the main method and reverse it in order to compare it with the users input
	public static boolean isPalindrome(int number)
	{
		boolean answer = true;
		int reverseint = reverse(number);
		
		// verifies if the number is equal to the reversed number and return the result as a boolean
		if (reverseint == number)
		{
			answer = true;
		}
		else if (reverseint != number)
		{
			answer = false;
		}
		return answer;
	}
}
