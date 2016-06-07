import java.util.Scanner;

public class highscorestudent 
{
	public static void main(String []args)
	{
		// ask the numbers
		System.out.println("Enter the number of students");
		Scanner input = new Scanner (System.in);
		
		// declare and initialize the variables
		int nbs = input.nextInt();
		String name1 = null;
		double score1 = 0;
		String highern = null;
		double highers = 0;
		String secondn = null;
		double seconds = 0;
		
		// apply the loop
		do 
		{
			nbs--;
			System.out.println("Enter the name");
			name1 = input.next();
			System.out.println("Enter the score");
			score1 = input.nextDouble();
			
			if (score1 > highers)
			{
				secondn = highern;
				seconds = highers;
				highern = name1;
				highers = score1;
			}
			else if (score1 < highers && score1 > seconds)
			{
				secondn = name1;
				seconds = score1;
			}
		} while (nbs > 0);
		
		// print the results
		System.out.println("The student with the highest score is " + highern + " with " + highers);		
		System.out.println("The student with the second highest score is " + secondn + " with " + seconds);	
		System.exit(0);
	}
}