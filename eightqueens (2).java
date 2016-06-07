
public class eightqueens 
{
	public static int rnumber()
	{
		return (int) (Math.random() * 10 % 8);
	}
	
	public static void main(String[] args)
	{
		int[] board = new int[8];
		board[0] = 0;
		int[] numbers = {0 , 1 , 2 , 3 , 4 , 5 , 6 , 7};
		
		for (int i = 1 ; i <= 9 ; i++)
		{
			int value = eightqueens.rnumber();
			int j;
			
			for (j = 0 ; j < i ; j++)
			{
				if (board[j] == value)
					break;
			}
			
			if (i == j)
				board[i] = value;
			
			if (i > j)
				i = i - 1;
		}
		
		for (int i = 0 ; i < 8 ; i++)
		{
			System.out.print(board[i] + " ");
		}
		
		System.out.println();
		
		for (int k = 0 ; k < 8 ; k++)
		{
			int m = 0;
			while (m < k)
			{
				System.out.print("| |");
				m++;
			}
			
			for (int l = 0 ; l <= k ; l++)
			{
				if (board[l] == k)
				{
					System.out.print ("|Q|");
				}
			}
			
			int n = 7;
			while (n > k)
			{
				System.out.print("| |");
				n--;
			}
			System.out.println();
		}
		
	}
}
