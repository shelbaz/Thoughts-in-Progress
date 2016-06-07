package thirdsem;
import java.awt.*;
import javax.swing.*;


public class Graph extends JPanel
{
	String[] array;
	int n;
 
	public Graph(int n, String[] array)
	{
		this.array = array;
		this.n = n;
	}
	
	public void setAll(int n, String[] array)
	{
		this.n = n;
		this.array = array;
	}
	
	public int getN()
	{
		return n;
	}
	
	public String[] getArray()
	{
		return array;
	}

	protected void paintComponent(Graphics g)
	{
		int[] arrayX = new int[getN()];
		int[] arrayY = new int[getN()];
		
		for(int i = 0; i < n; i++)
		{
			String[] line = getArray()[i].split(" ");
			arrayX[i] = Integer.parseInt(line[1]) + 5;
			arrayY[i] = Integer.parseInt(line[2]) + 5;
			g.fillOval(Integer.parseInt(line[1]), Integer.parseInt(line[2]), 10, 10);
			g.drawString(i+"", Integer.parseInt(line[1])-15, Integer.parseInt(line[2])+10);
		}
		
		for(int i = 0; i < n; i++)
		{
			String[] line = getArray()[i].split(" ");
			for(int j = 3; j < line.length; j++)
			{
				g.drawLine(arrayX[i], arrayY[i], arrayX[Integer.parseInt(line[j])], arrayY[Integer.parseInt(line[j])]);
			}
		}
	}
}