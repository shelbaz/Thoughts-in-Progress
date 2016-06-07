package thirdsem;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

import thirdsem.randomWalk.newPanel;
import thirdsem.randomWalk.timeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class clockLearning extends JFrame
{
	static clockLearning frame = new clockLearning();
	clock c = new clock();
	JLabel hour = new JLabel("Hour");
	JLabel minute = new JLabel("Minute");
	static int Hour = 3;
	static int Minute = 30;
	static double angleHour = 0;
	static double angleMinute = 0;
	
	public clockLearning()
	{
		add(c, BorderLayout.NORTH);
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_5");
		frame.setSize(300 , 250);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class clock extends JPanel
	{
		clock()
		{
			setPreferredSize(new Dimension(275, 275));

			addMouseListener(new MouseListener() 
			{ 
		          
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// TODO Auto-generated method stub
					Hour = (int) (Math.random() * 100 % 12);
					Minute = (int) (Math.random() * 10 % 4) * 15;
					repaint();
				}

				@Override
				public void mouseEntered(java.awt.event.MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(java.awt.event.MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(java.awt.event.MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(java.awt.event.MouseEvent e) {
					// TODO Auto-generated method stub
					
				} 
			}); 
		}
		
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			angleHour = 360 / 12 * (Hour - 3);
			angleMinute = 360 / 60 * (Minute - 15);
			
			g.setColor(Color.white);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.black);
			
			// 12 3 6 9
			g.drawString("12", 135, 45);
			g.drawString("3", 205, 108);
			g.drawString("6", 140, 170);
			g.drawString("9", 72, 108);
			
			// border
			g.drawRect(5, 5, getWidth() - 10, getHeight() - 75);
			
			// initial
			g.drawOval((int) (getWidth() * 0.25), (int) (getHeight() * 0.125), (int) (getWidth() * 0.5), (int) (getHeight() * 0.5));
			
			// hour hand
			double[] hourbot = point( 142, 103, angleHour, 40);
			g.drawLine( 142, 103, (int) hourbot[0], (int) hourbot[1]);
			
			// minute hand
			double[] minutebot = point( 142, 103, angleMinute, 45);
			g.setColor(Color.BLUE);
			g.drawLine( 142, 103 , (int) minutebot[0], (int) minutebot[1]);
			
			g.setColor(Color.BLACK);
			// dem lil lines
			/**g.drawLine( 208, 103, 213, 103);
			double[] x = point( 142, 103, 208, 103, 0, 5);
			double[] xx = point( 142, 103, 213, 103, 0, 5);
			for (int i = 0; i < 60; i++)
			{
				x = point( 142, 103, 208, 103, i / 60 * 360, 5);
				xx = point( 142, 103, 213, 103, i / 60 * 360, 5);
				g.drawLine((int) x[1], (int) x[1], (int) xx[0], (int) xx[1]);
			}*/
		}
	}
	
	public double[] point( double centerx, double centery, double A, double radius)
	{
		A = A / 360 * 2 * Math.PI;
		double newpointx = (radius * Math.cos(A)) + centerx;
		double newpointy = (radius * Math.sin(A)) + centery;
		return new double[] {newpointx, newpointy};
	}
	
	public double[] point(double cx, double cy, double x, double y, double angle, int length)
	{
		return new double[] {cx + (Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2))-4) * Math.cos(angle/360*2*Math.PI), cy + (Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2))-4) * Math.sin(angle/360*2*Math.PI)};
 	}
}