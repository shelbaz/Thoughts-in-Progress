import java.util.Scanner;

public class multiplytwomatrices 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double[][] m1 = new double[3][3];
		double[][] m2 = new double[3][3];
		double[][] m3 = new double[3][3];

		
// ask the first matrix from the user
		System.out.print("Enter matrix1:");

		for (int row = 0 ; row < 3 ; row++)
		{
			for (int column = 0 ; column < 3 ; column++)
			{
				m1[row][column] = input.nextDouble();
			}
		}

		
// second matrix
		System.out.print("Enter matrix2:");

		for (int row = 0 ; row < 3 ; row++)
		{
			for (int column = 0 ; column < 3 ; column++)
			{
				m2[row][column] = input.nextDouble();
			}
		}
		
		m3 = multiplyMatrix(m1, m2);
// print
		System.out.println("Results: ");
		
		for (int row = 0 ; row < 3 ; row++)
		{
			for (int column = 0 ; column < 3 ; column++)
			{
				System.out.printf("%.1f\t", m3[row][column]);
			}
			System.out.println("\n");
		}
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b)
	{
		double[][] c = new double[a.length][a.length];
		
// multiplication
		for (int row = 0 ; row < a.length ; row++)
		{
			for (int column = 0 ; column < a.length ; column++)
			{
				for (int i = 0 ; i < a.length ; i++)
					c [row][column] += a[row][i] * b[i][column];
			}
		}
		return c;
	}
}
