import java.util.Arrays;
import java.util.Scanner;

//Darrin Fong

public class J4 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int timeAvail = input.nextInt();
		int[] chores = new int[input.nextInt()];
			
		for (int i = 0 ; i < chores.length ; i++)
		{
			chores[i] = input.nextInt();
		}
		
		Arrays.sort(chores);
		
		int timeUsed = 0;
		int choresDone = 0;
		
		if (chores.length == 1 && chores[0] > 1)
		{
			System.out.print("0");
			System.exit(0);
		}
		
		for (int i = 0 ; i < chores.length ; i++)
		{
			if (timeUsed < timeAvail)
			{
				timeUsed += chores[i];
				choresDone++;
			}
		}
		System.out.print(choresDone);
	}
}
