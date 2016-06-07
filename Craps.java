
public class Craps 
{
	public static void main(String[] args)
	{
		int dice1 = dice();
		int dice2 = dice();
		int point = 0;
		
		int sum = dice1 + dice2;
		
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
		
		if(sum == 7 || sum == 11)
		{
			System.out.println("You win");
		}
		
		else if(sum == 2 || sum == 3 || sum == 12)
		{
			System.out.println("You lose");
		}
		
		else
		{
			point = sum;
			System.out.println("Your point is " + point);
			int count = 1;
			
			while(count > 0)
			{
				int dice3 = dice();
				int dice4 = dice();
				int sumSecond = dice3 + dice4;
				System.out.println("You rolled " + dice3 + " + " + dice4 + " = " + " " + sumSecond);
				
				if (point == sumSecond)
				{
					System.out.println("You win");
					count--;
				}
				
				else if(sumSecond == 7)
				{
					System.out.println("You lose");
					count--;
				}
			}
		}
	}	
		
	public static int dice()
	{
		int n = (int)(Math.random()*10)%7;
		
			if (n == 0)
			{
				n = (int)(Math.random()*10)%7;
			}
		
		return n;
	}
}
