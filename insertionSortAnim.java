package thirdsem;

import java.awt.Graphics;

import javax.swing.JPanel;

public class insertionSortAnim extends JPanel implements Runnable
{
	static int[] count = new int[50];
	Histogram his = new Histogram();
	int sortIndex = 0;
	int i = 0;
	boolean done = false;
	
	insertionSortAnim(int[] Array)
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
			int temp = 0;
			int lastSorted = 0;
			
			for(int i = sortIndex; i >= 0; i--)
				if(count[i+1] < count[i])
				{
					temp = count[i];
					count[i] = count[i+1];
					count[i+1] = temp;
					lastSorted = i;
				}
			
			his.lastSorted(lastSorted);
	        his.showHistogram(count);
	        
	        sortIndex++;
		}
	}
}
