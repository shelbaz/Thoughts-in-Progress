import java.util.Scanner;

public class workers 
{
	public static void main(String []args)
	{
		// ask the numbers
		System.out.println("Enter the number of workers");
		Scanner input = new Scanner (System.in);
		
		int nbs = input.nextInt();
		int rate = 0;
		int hours = 0;
		int pers = 0;
		int total = 0;

		while (nbs > 0) 
		{
			nbs--;
			rate = input.nextInt();
				int a = input.nextInt();
				int b = input.nextInt();
				int c = input.nextInt();
				int d = input.nextInt();
				int e = input.nextInt();
				hours = a + b + c + d + e;
				pers = hours * rate;
				total = total + pers;
		}
		System.out.println (total);
	}
}