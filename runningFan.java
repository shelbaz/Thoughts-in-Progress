package thirdsem;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

import thirdsem.trafficLights.timeListener;

public class runningFan extends JFrame implements AdjustmentListener
{
	static runningFan frame = new runningFan();
	static int speed = 100;
	static double direction = 0.1;
	JScrollBar jsb = new JScrollBar(0);
	static int scrollPosition = 0;
	double a = 0;
	int c = 0;
	
	Timer t = new Timer(1 , new timeListener());
	
	class timeListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			a += direction * jsb.getValue() / 20 + direction;
			repaint();		
		}
	}
	
	runningFan()
	{
		setLayout(new BorderLayout());
		add(new FanControl(), BorderLayout.NORTH);
		add(new Fan());
		jsb.addAdjustmentListener(this);
		add(jsb, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_11");
		frame.setSize(300 , 250);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class FanControl extends JPanel implements ActionListener
	{
		FanControl()
		{
			JButton start = new JButton("Start");
			start.setActionCommand("start");
			start.addActionListener(this);
			add(start);
			
			JButton stop = new JButton("Stop");
			stop.setActionCommand("stop");
			stop.addActionListener(this);
			add(stop);
			
			JButton reverse = new JButton("Reverse");
			reverse.setActionCommand("reverse");
			reverse.addActionListener(this);
			add(reverse);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			switch(e.getActionCommand())
			{
				case "start":
					t.start();
					break;
					
				case "stop":
					t.stop();
					break;
					
				case "reverse":
					direction *= -1;
			}
		}
	}
	
	class Fan extends JPanel
	{
		
		protected void paintComponent (Graphics g)
		{
			// initial
			g.drawOval((int) (getWidth() * 0.25), (int) (getHeight() * 0.075), (int) (getWidth() * 0.5), (int) (getHeight() * 0.85));
			
			for (int i = 0; i < 360; i++)
			{
				double[] f1 = point((0.5 * getWidth() - 3), (0.5 * getHeight()), (0.5 * getWidth()), (0.5 * getHeight()), a + i);
				double[] f11 = point((0.5 * getWidth()), (0.5 * getHeight()), (0.5 * getWidth()), (0.075 * getHeight()), a + i);
				g.drawLine((int) f1[0] , (int) f1[1] , (int) f11[0], (int) f11[1]);
				
				if (i == 30 || i == 120 || i == 210 || i == 300)
					i += 60;
			}
		}
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		// TODO Auto-generated method stub
		speed = new Integer ((int) jsb.getValue() * 100 / 90);
	}
	
	public double[] point( double centerx, double centery, double A, double radius)
	{
		A = A / 360 * 2 * Math.PI;
		double newpointx = (radius * Math.cos(A)) + centerx;
		double newpointy = (radius * Math.sin(A)) + centery;
		return new double[] {newpointx, newpointy};
	}
	
	public double[] point(double cx, double cy, double x, double y, double angle)
	{
		return new double[] {cx + (Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2))-4) * Math.cos(angle/360*2*Math.PI), cy + (Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2))-4) * Math.sin(angle/360*2*Math.PI)};
 	}
}