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
				System.out.print(m3[row][column] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b)
	{
		double[][] c = a;
		
// multiplication
		for (int row = 0 ; row < 3 ; row++)
		{
			for (int column = 0 ; column < 3 ; column++)
			{
				c [row][column] = a[row][column] * b[row][column];
			}
		}
		return c;
	}
}
