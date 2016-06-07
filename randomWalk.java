package thirdsem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class randomWalk extends JFrame
{
	Timer t = new Timer(10, new timeListener());
	newPanel panel = new newPanel();

	boolean started = true;
	
	class timeListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			repaint();
		}
	}
	
	public randomWalk()
	{
		JPanel p1 = new JPanel();
		JButton start = new JButton("Start");
		JButton done = new JButton("Done");
		p1.add(start);
		p1.add(done);
		add((panel), BorderLayout.CENTER);
		add((p1), BorderLayout.SOUTH);
		start.addActionListener(new start());
		done.addActionListener(new done());
		
	}
		
	class done implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			System.exit(0);	
		}
	}
	
	class start implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			if (!started)
			{
				main(null);
				t.stop();
				dispose();
			}
			
			else
				started = false;
			
			t.start();			
		}
	}
	
	public static void main(String[] args)
	{
		randomWalk frame = new randomWalk();
		frame.setTitle("Exercise16_28");
		frame.setSize(1200 , 700);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
	
	int[] xpoints = new int[10000];
	int[] ypoints = new int[10000];
	int npoints = 1;
	
	class newPanel extends JPanel
	{
		
		protected void paintComponent(Graphics g)
		{
			g.setColor(Color.LIGHT_GRAY);
			
			for (int i = 0, row = 0; i <= 120; i++, row+=10)
				g.drawLine(0, row, 1200, row);
			
			for (int i = 0, column = 0; i <= 70; i++, column+=20)
				g.drawLine(column, 0, column, 700);
			
			g.setColor(Color.BLACK);
			
			xpoints[0] = 600;
			ypoints[0] = 350;
			
			Object[] temp = movex(xpoints, ypoints, npoints);
			xpoints = (int[]) temp[0];
			ypoints = (int[]) temp[1];
			npoints = (int) temp[2];
			g.drawPolyline(xpoints, ypoints, npoints);
			
			/**if (xpoints[checklast(xpoints, ypoints)] < 0 || xpoints[checklast(xpoints, ypoints)] > 337 || ypoints[checklast(xpoints, ypoints)] < 0 || ypoints[checklast(xpoints, ypoints)] > 160)
			{
				t.stop();
			}**/
		}
	}
	
	public static int checklast(int[] arrayx, int[] arrayy)
	{
		for(int i = 0; i < 10000; i++)
			if (arrayx[i] == 0 && arrayy[i] == 0)
				return i - 1;
		
		return 0;
	}
	
	public static Object[] movex(int[] x, int[] y, int n)
	{
		int lastx = checklast(x, y);
		int	lasty = checklast(x, y);
			
		switch(random())
		{
		case 0: 
			if(!taken(x, y, x[lastx] + 20, y[lasty]))
			{
				x[lastx + 1] = x[lastx] + 20;
				y[lasty + 1] = y[lasty];
				return new Object[] {x, y, n + 1};
			}
			break;
						
		case 1: 
			if(!taken(x, y, x[lastx] - 20, y[lasty]))
			{
				x[lastx + 1] = x[lastx] - 20;
				y[lasty + 1] = y[lasty];
				return new Object[] {x, y, n + 1};
			}
			break;
							
		case 2: 
			if(!taken(x, y, x[lastx], y[lasty] + 10))
			{
				x[lastx + 1] = x[lastx];
				y[lasty + 1] = y[lasty] + 10;
				return new Object[] {x, y, n + 1};
			}
			break;
							
		case 3: 
			if(!taken(x, y, x[lastx], y[lasty] - 10))
			{
				x[lastx + 1] = x[lastx];
				y[lasty + 1] = y[lasty] - 10;
				return new Object[] {x, y, n + 1};
			}
			break;
		}

		return new Object[] {x, y, n};
	}
	
	
	public static boolean taken(int[] x, int[] y, int px, int py)
	{
		boolean taken = false;
		
		//NO TOUCH
		
		for (int i = 0; i < 10000; i++)
			if(x[i] == px && y[i] == py)
				taken = true;
		
		//CAN TOUCH
		
		if (px < 0 || px > 1200 || py < 0 || py > 700)
			taken = true;
			
		return taken;
	}
	
	public static int random()
	{
		return (int) (Math.random() * 4);
	}
}