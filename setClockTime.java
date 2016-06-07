package thirdsem;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

import thirdsem.randomWalk.newPanel;
import thirdsem.randomWalk.timeListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class setClockTime extends JFrame
{
	static setClockTime frame = new setClockTime();
	clock c = new clock();
	JTextField hourField = new JTextField("12          ");
	JLabel hour = new JLabel("Hour");
	JTextField minuteField = new JTextField("60          ");
	JLabel minute = new JLabel("Minute");
	JTextField secondField = new JTextField("60        ");
	JLabel second = new JLabel("Second");
	static double angleHour = 0;
	static double angleMinute = 0;
	static double angleSecond = 0;
	
	Timer t = new Timer(1 * 1000, new timeListener());
		
	class timeListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			secondField.setText(Double.parseDouble(secondField.getText()) + 1 + "");
			
			if (Double.parseDouble(secondField.getText()) == 60)
			{
				secondField.setText("0");
				minuteField.setText(Double.parseDouble(minuteField.getText()) + 1 + "");
			}
			
			if (Double.parseDouble(minuteField.getText()) == 60)
			{
				minuteField.setText("0");
				hourField.setText(Double.parseDouble(hourField.getText()) + 1 + "");
			}
			
			if (Double.parseDouble(hourField.getText()) == 12)
			{
				hourField.setText("0");
			}
			
			c.repaint();
		}
	}
	
	public setClockTime()
	{
		textPanel t = new textPanel();
		add(c, BorderLayout.NORTH);
		add(t, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise17_7");
		frame.setSize(300 , 275);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class clock extends JPanel
	{
		clock()
		{
			setPreferredSize(new Dimension(275, 275));
		}
		
		protected void paintComponent(Graphics g)
		{
			angleHour = 360 / 12 * (Double.parseDouble(hourField.getText()) - 3);
			angleMinute = 360 / 60 * (Double.parseDouble(minuteField.getText()) - 15);
			angleSecond = 360 / 60 * (Double.parseDouble(secondField.getText()) - 15);
			
			g.setColor(Color.white);
			g.fillRect(0, 0, getWidth(), getHeight() - 75);
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
			double[] hourbot = point( 142, 103, (0.7 * getWidth()), (0.175 * getHeight()), angleHour, 40);
			g.drawLine( 142, 103, (int) hourbot[0], (int) hourbot[1]);
			
			// minute hand
			double[] minutebot = point( 142, 103, (0.7 * getWidth()), (0.175 * getHeight()), angleMinute, 45);
			g.setColor(Color.BLUE);
			g.drawLine( 142, 103 , (int) minutebot[0], (int) minutebot[1]);
			
			// second hand
			double[] secondbot = point( 142, 103, (0.7 * getWidth()), (0.175 * getHeight()), angleSecond, 50);
			g.setColor(Color.RED);
			g.drawLine( 142, 103, (int) secondbot[0], (int) secondbot[1]);
		}
	}
	
	public double[] point( double centerx, double centery, double pointx, double pointy, double A, double radius)
	{
		A = A / 360 * 2 * Math.PI;
		double newpointx = (radius * Math.cos(A)) + centerx;
		double newpointy = (radius * Math.sin(A)) + centery;
		return new double[] {newpointx, newpointy};
	}
	
	class textPanel extends JPanel implements ActionListener
	{
		
		textPanel()
		{
			setLayout(new FlowLayout());
			
			hourField.addActionListener(this);
			add(hour);
			add(hourField);
			
			minuteField.addActionListener(this);
			add(minute);
			add(minuteField);
			
			secondField.addActionListener(this);
			
			add(second);
			add(secondField);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			t.stop();
			c.repaint();
			t.start();
		}
		
		protected void paintComponent(Graphics g)
		{
			// border
			g.drawRect(5, 0, getWidth() - 10, getHeight() - 5);
		}

	}
}