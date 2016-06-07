import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns 
{
	public static void main(String []args)
	{
		// ask the size of the matrix from the user
		System.out.print("Enter the array size n: ");
		Scanner input = new Scanner (System.in);
		int size = input.nextInt();
		
		// initialize the matrix and arrays
		int[][] matrix = new int[size][size];
		ArrayList<Integer> row = new ArrayList<Integer>();
		ArrayList<Integer> column = new ArrayList<Integer>();
				
		// generate an array if the size "size"
		for(int rows = 0 ; rows < size ; rows++)
			for(int columns = 0 ; columns < size ; columns++)
				matrix[rows][columns] = getRandomNumber();
			
		
		// Print the array
		System.out.println("The random array is");
		
		for(int rows = 0 ; rows < size ; rows++)
		{
			for(int columns = 0 ; columns < size ; columns++)
				System.out.print(matrix[rows][columns] + "  ");
			System.out.println();
		}
		
		// save the number of 1s in rowArray
		for(int rows = 0 ; rows < size ; rows++)
		{
			int countrow = 0;
			for(int columns = 0 ; columns < size ; columns++)
			{
				if (matrix[rows][columns] == 1)
				{
					countrow++;
				}
			}
			row.add(countrow);
		}
		
		// save the number of 1s in columnArray
		for(int columns = 0 ; columns < size ; columns++)
		{
			int countcolumn = 0;
			for(int rows = 0 ; rows < size ; rows++)
			{
				if (matrix[rows][columns] == 1)
				{
					countcolumn++;
				}
			}
			column.add(countcolumn);
		}
		
		System.out.println("Number of 1s in respective rows: ");
		
		// find the biggest number of 1s in rows
		int rowMax = 0;
		
		for(int i = 0 ; i < row.size() ; i++)
		{
			System.out.print(row.get(i) + " ");
			if (row.get(i) > rowMax)
				rowMax = row.get(i);
		}
		
		System.out.println();
		
		System.out.println("Indexes of largest amount of 1s: ");
		
		// print the indexes of rows which contains the largest amount of 1s
		for (int i = 0 ; i < row.size(); i++)
		{
			if (row.indexOf(rowMax) != -1)
			{
				System.out.print(row.indexOf(rowMax) + ", ");
				row.set(row.indexOf(rowMax),0);
			}
		}
		
		System.out.println();
		
		System.out.println("Number of 1s in respective columns: ");
		
		// find the biggest number of 1s in columns
		int columnMax = 0;
		
		for(int i = 0 ; i < column.size() ; i++)
		{
			System.out.print(column.get(i) + " ");
			if (column.get(i) > columnMax)
				columnMax = column.get(i);
		}
		
		System.out.println();
		
		System.out.println("Indexes of largest amount of 1s: ");
		
		// print the indexes of rows which contains the largest amount of 1s
		for (int i = 0 ; i < column.size(); i++)
		{
			if (column.indexOf(columnMax) != -1)
			{
				System.out.print(column.indexOf(columnMax) + ", ");
				column.set(column.indexOf(columnMax),0);
			}
		}
	}
	
	// generate a random number between 0 or 1
	public static int getRandomNumber()
	{
		return (int) (Math.random()*10%2);
	}
}