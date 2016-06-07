import java.util.Scanner;

public class seven_nineteen
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int rows = input.nextInt();
		
		System.out.print("Enter the number of columns:");
		int columns = input.nextInt();
		
		int[][] matrix = new int[rows][columns];
		
// ask the matrix from the user
		
		System.out.print("Enter matrix:");
		
		for (int row = 0; row < rows ; row++)
			for (int column = 0 ; column < columns ; column++)
				matrix[row][column] = input.nextInt();
		
		for (int row = 0 ; row < rows ; row++)
		{
			for (int column = 0 ; column < columns ; column++)
				System.out.print("  " + matrix[row][column]);
			System.out.println();
		}
		
		if (isConsecutiveFour(matrix))
			System.out.print("True");
		else
			System.out.print("False");
	}
	
	public static boolean isConsecutiveFour(int[][] values)
	{
		
		int rows = values.length;
		int columns = values[0].length;
		
// check for size of matrix
		
		if (rows < 4 && columns < 4)
		{
			System.out.print(" The Matrix is too small");
			System.exit(0); 
		}
		
// check horizontal
		
		if (columns >= 4)
			for (int row = 0 ; row < rows ; row++)
				for (int column = 0 ; column < (columns - 3) ; column++)
				{
					int n1 = values[row][column];
					int n2 = values[row][column + 1];
					int n3 = values[row][column + 2];
					int n4 = values[row][column + 3];
				
					if (n1 == n2 && n1 == n3 && n1 == n4)
					{
						System.out.print( "\n" + "  " + n1 + "  " + n2 + "  " + n3 + "  " + n4 + "  ");
						return true;
					}
				}
				
// check vertical
		
		if (rows >= 4)
			for (int column = 0 ; column < columns ; column++)
				for (int row = 0 ; row < (rows - 3) ; row++)
				{
					int n1 = values[row][column];
					int n2 = values[row + 1][column];
					int n3 = values[row + 2][column];
					int n4 = values[row + 3][column];
				
					if (n1 == n2 && n1 == n3 && n1 == n4)
					{
						System.out.print( "\n" + "  " + n1 + "  " + n2 + "  " + n3 + "  " + n4 + "  ");
						return true;
					}
				}

// check diagonal \
		
		if (rows >= 4 && columns >= 4)
			for (int column = 0 ; column < (columns - 3) ; column++)
				for (int row = 0 ; row < (rows - 3) ; row++)
				{
					int n1 = values[row][column];
					int n2 = values[row + 1][column + 1];
					int n3 = values[row + 2][column + 2];
					int n4 = values[row + 3][column + 3];
			
					if (n1 == n2 && n1 == n3 && n1 == n4)
					{
						System.out.print( "\n" + "  " + n1 + "  " + n2 + "  " + n3 + "  " + n4 + "  ");
						return true;
					}
				}

// check diagonal /

		if (rows >=4 && columns >= 4)
			for (int column = 3 ; column < columns ; column++)
				for (int row = 0 ; row < (rows - 3) ; row++)
				{
					int n1 = values[row][column];
					int n2 = values[row + 1][column - 1];
					int n3 = values[row + 2][column - 2];
					int n4 = values[row + 3][column - 3];
				
					if (n1 == n2 && n1 == n3 && n1 == n4)
					{
						System.out.print( "\n" + "  " + n1 + "  " + n2 + "  " + n3 + "  " + n4 + "  ");
						return true;
					}
				}
		return false;
	}
}
