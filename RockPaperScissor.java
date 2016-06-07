// This program plays rock paper scissor with the user
import java.util.Scanner;

public class RockPaperScissor
{
	public static void main(String[] args) 
	{
		
// Generate a number
		int n = (int) (Math.random() * 10) % 3;
		
// Ask the number from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Scissor (0), Rock (1), Paper (2): ");
		int m = input.nextInt();

// display the results
		if (n == 0 && m == 0)
		{
			System.out.println ("The computer is scissor. You are scissor too. It is a draw.");
		}
		else if  (n == 0 && m == 1)
		{
			System.out.println ("The computer is scissor. You are rock. You won.");
		}
		else if  (n == 0 && m == 2)
		{
			System.out.println ("The computer is scissor. You are paper. You lose.");
		}
		else if  (n == 1 && m == 0)
		{
			System.out.println ("The computer is rock. You are scissor. You lose.");
		}
		else if  (n == 1 && m == 1)
		{
			System.out.println ("The computer is rock. You are rock. It is a draw.");
		}
		else if  (n == 1 && m == 2)
		{
			System.out.println ("The computer is rock. You are paper. You won.");
		}
		else if  (n == 2 && m == 0)
		{
			System.out.println ("The computer is paper. You are scissor. You won.");
		}
		else if  (n == 2 && m == 1)
		{
			System.out.println ("The computer is paper. You are rock. You lose.");
		}
		else if  (n == 2 && m == 2)
		{
			System.out.println ("The computer is paper. You are paper. It is a draw.");
		}
		else
		{
			System.out.println ("Invalid number, please enter 0, 1 or 2.");
		}
	}	
}