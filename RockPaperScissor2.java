//This program plays rock paper scissor with the user
import java.util.Scanner;


public class RockPaperScissor2
{
	public static void main(String[] args) 
	{
		int userwin = 0;
		int pcwin = 0;
		
		while (userwin < 3 || pcwin < 3)
		{
			// Generate a number
			int n = (int) (Math.random() * 10) % 3;
			
			// Ask the number from the user
			Scanner input = new Scanner(System.in);
			System.out.println("Scissor (0), Rock (1), Paper (2): ");
			
			// Cast the user imput to a variable
			int m = input.nextInt();
			
			// display the results 
			if (n == 0 && m == 0)
				System.out.println ("The computer is scissor. You are scissor. It is a draw.");
			else if  (n == 0 && m == 1)
			{
				System.out.println ("The computer is scissor. You are rock. You won.");
				userwin++;
			}
			else if  (n == 0 && m == 2)
			{
				System.out.println ("The computer is scissor. You are paper. You lose.");
				pcwin++;
			}
			else if  (n == 1 && m == 0)
			{
				System.out.println ("The computer is rock. You are scissor. You lose.");
				pcwin++;
			}
			else if  (n == 1 && m == 1)
				System.out.println ("The computer is rock. You are rock. It is a draw.");
			else if  (n == 1 && m == 2)
			{
				System.out.println ("The computer is rock. You are paper. You won.");
				userwin++;
			}
			else if  (n == 2 && m == 0)
			{
				System.out.println ("The computer is paper. You are scissor. You won.");
				userwin++;
			}
			else if  (n == 2 && m == 1)
			{
				System.out.println ("The computer is paper. You are rock. You lose.");
				pcwin++;
			}
			else if  (n == 2 && m == 2)
				System.out.println ("The computer is paper. You are paper. It is a draw.");
			else
				System.out.println ("Invalid number, please enter 0, 1 or 2.");
			System.out.println();
			
			// if the user or the computer wins more than two times, display the results and end the program.
			if (userwin == 3)
			{
				System.out.println("Congradulations, you won against the computer at 3 vs " + pcwin + ".");
				System.exit(0);
			}
			else if (pcwin == 3)
			{
				System.out.println("Computer won against you at 3 vs " + userwin + ".");
				System.exit(0);
			}
		}
	}	
}