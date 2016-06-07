import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList 
{
	public static void main(String[] args)
	{
		
		// ask 5 integers from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 integers: ");
		
		// declare a new array list
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		// loop the input from the user
		for(int i = 0; i < 5; i++)
		{
			List.add(input.nextInt());
		}
		// call the sort method
		sort(List);
	}

	public static void sort(ArrayList<Integer> list)
	{
		for(int i = 1; i < 5;)
		{
			for(int count = 0, j = 0; j < i ; count++)
				for(int k = 0 ; k < 5 ; k++)
					if(list.get(k) == count)
					{
						System.out.print(count + " ");
						j++;
						i++;
					}
		}
	}
}