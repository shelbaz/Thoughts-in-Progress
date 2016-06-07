package thirdsem;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class selectionSortAnim extends JPanel implements Runnable
{
	static int[] count = new int[50];
	int sortIndex = 0;
	Histogram his = new Histogram();
	int i = 0;
	boolean done = false;
	
	selectionSortAnim(int[] Array)
	{
		for(int i = 0; i < 50; i++)
			count[i] = Array[i];
		add(his);
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(; i < 50; i++)
		{
			repaint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		done = true;		
	}
	
	boolean getDone()
	{
		return true;
	}
	
	void suicide(int[] Array)
	{
		count = new int[50];
		sortIndex = 0;
		Histogram his = new Histogram();
		for(int i = 0; i < 50; i++)
			count[i] = Array[i];
		add(his);
		i = 0;
		done = false;
	}
	
	protected void paintComponent(Graphics g)
	{
		if(sortIndex < 49)
		{
			int min = 50;
			int indexOfMin = 0;
			
			for(int i = sortIndex; i < count.length; i++)
				if(count[i] < min)
				{
					min = count[i];
					indexOfMin = i;
				}
			
			count[indexOfMin] = count[sortIndex];
			count[sortIndex] = min;
			
			his.lastSorted(sortIndex);
			his.showHistogram(count);
			
			sortIndex++;
		}
	}
}