import java.util.Scanner;

public class addtwomatrices 
{
	public static void main(String[] args)
	{

// declare matrixes
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
		
		m3 = addMatrix(m1, m2);
// print
		System.out.println("Results: ");
		
		for (int row = 0 ; row < 3 ; row++)
		{
			for (int column = 0 ; column < 3 ; column++)
			{
				System.out.print(m3[row][column] + "\t");
			}
			System.out.println("\n");
		}
	}

// separate methode for addition
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
	
// declare new matrix to initialize the size
		double[][] c = a;
		
// addition
		for (int row = 0 ; row < 3 ; row++)
		{
			for (int column = 0 ; column < 3 ; column++)
			{
				c [row][column] = a[row][column] + b[row][column];
			}
		}
		return c;
	}
}
