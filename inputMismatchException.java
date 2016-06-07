import java.util.*;

public class inputMismatchException 
{
	public static void main(String[] args)
	{
		// generate two single digit numbers
		int x = (int)(Math.random()*10);
		int y = (int)(Math.random()*10);
		
		// ask the user what is the answer
		Scanner input = new Scanner(System.in);
		System.out.println(x + " + " + y + " = ?");
		
		// Infinite loop
		for(int i = 0 ; i == 0 ;)
		{
   			try
			{
   				int result = input.nextInt();
   				
				// if answer is correct stop the program
   				if(result == (x + y))
				{
					System.out.println("Right answer");
					System.exit(0);
				}
				// request another answer
   				else
				{ 
					System.out.println("Wrong answer\n" + x + " + " + y + " = ?");
				}
			}
  			
   			// if the answer is wrong, look for another input
   			catch(InputMismatchException ex)
  			{
				input.nextLine();
				System.out.println("Wrong answer\n" + x + " + " + y + " = ?");
			}
		}
	}
}