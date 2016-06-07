// This program generates a random upper case character
public class RandomChar 
{
	public static void main(String []args) 
	{

		// Find a random number from 1 to 26
		int randomnumber = (int)(System.currentTimeMillis()%26); 
		
		// Put the random number between 65 to 90 and cast it into a Character
		char randomchar = (char) (randomnumber+65);
		
		// Print the random Character
		System.out.println(randomchar);

	}
}
