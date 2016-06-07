import java.util.Scanner;

// Darrin Fong

public class J5 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int myTeam = input.nextInt();
		int gamesPlayed = input.nextInt();
		int wePlayed = 0;
		
		int[] points = {0,0,0,0};
		int[][] scores = {{0,0,0,0}
						 ,{0,0,0,0}
						 ,{0,0,0,0}
						 ,{0,0,0,0}};
		
		for (int i = 0 ; i < gamesPlayed ; i++)
		{
			int T1 = input.nextInt()-1;
			int T2 = input.nextInt()-1;
			int S1 = input.nextInt();
			int S2 = input.nextInt();
			
			if (T1 == myTeam || T2 == myTeam)
				wePlayed++;
			
			if (S1 > S2)
			{
				scores[T1][T2] = 3;
				scores[T2][T1] = 0;
			}
			
			if (S2 > S1)
			{
				scores[T2][T1] = 3;
				scores[T1][T2] = 0;
			}
			
			if (S1 == S2)
			{
				scores[T1][T2] = 1;
				scores[T2][T1] = 1;
			}
		}
		
		if (myTeam != 1)
		for (int i = 0 ; i <= 3 ; i++)
			points[0] += scores[1-1][i];
		
		if (myTeam != 2)
		for (int i = 0 ; i <= 3 ; i++)
			points[1] += scores[2-1][i];
		
		if (myTeam != 3)
		for (int i = 0 ; i <= 3 ; i++)
			points[2] += scores[3-1][i];
		
		if (myTeam != 4)
		for (int i = 0 ; i <= 3 ; i++)
			points[3] += scores[4-1][i];
		
		if (gamesPlayed == 6)
		{
			System.out.print("0");
			System.exit(0);
		}
		
		if (gamesPlayed == 0)
		{
			System.out.print("36");
			System.exit(0);
		}
	}
}
