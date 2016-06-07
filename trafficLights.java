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

public class trafficLights extends JFrame
{
	static trafficLights frame = new trafficLights();
	JRadioButton redButton = new JRadioButton("Red");
	JRadioButton yellowButton = new JRadioButton("Yellow");
	JRadioButton greenButton = new JRadioButton("Green");
	static int state;
	Timer t = new Timer(5 * 1000, new timeListener());
	
	class timeListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			repaint();
		}
	}
   	
	public trafficLights()
	{
		lights l = new lights();
		radioPanel r = new radioPanel();
		
		add(l, BorderLayout.NORTH);
		add(r, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise17");
		frame.setSize(300 , 450);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class lights extends JPanel
	{
		lights()
		{
			setPreferredSize(new Dimension(285, 400));
		}
		
		protected void paintComponent(Graphics g)
		{
			// border
			g.drawRect(5, 5, getWidth() - 10, getHeight() - 40);
			
			// light
			g.drawRect((int) (getWidth() * 0.3), 50, (int) (getWidth() * 0.40), (int) (getHeight() * 0.65));
			
			// initial
			g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.175), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
			g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.375), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
			g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.575), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
			
			// circles
			switch(state)
			{
				case 1:
					g.setColor(Color.RED);
					g.fillOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.175), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.setColor(Color.BLACK);
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.175), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.375), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.575), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					state = 3;
					break;
					
				case 2:
					g.setColor(Color.YELLOW);
					g.fillOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.375), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.setColor(Color.BLACK);
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.175), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.375), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.575), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					state = 1;
					break;
					
				case 3:
					g.setColor(Color.GREEN);
					g.fillOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.575), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.setColor(Color.BLACK);
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.175), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.375), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					g.drawOval((int) (getWidth() * 0.425), (int) (getHeight() * 0.575), (int) (getWidth() * 0.15), (int) (getHeight() * 0.15));
					state = 2;
					break;
			}
		}
	}
	
	class radioPanel extends JPanel implements ActionListener
	{
		radioPanel()
		{
			setLayout(new FlowLayout());
			
			ButtonGroup group = new ButtonGroup();
			
			group.add(redButton);
			redButton.setActionCommand("red");
			redButton.addActionListener(this);
			add(redButton);
			
			group.add(yellowButton);
			yellowButton.setActionCommand("yellow");
			yellowButton.addActionListener(this);
			add(yellowButton);
			
			group.add(greenButton);
			greenButton.setActionCommand("green");
			greenButton.addActionListener(this);
			add(greenButton);
		}
		
		protected void paintComponent(Graphics g)
		{
			// border
			g.drawRect(5, 0, getWidth() - 10, getHeight() - 5);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			switch(e.getActionCommand())
			{
				case "red":
					state = 1;
					redButton.setEnabled(true);
					break;
				
				case "yellow":
					state = 2;
					yellowButton.setEnabled(true);
					break;
					
				case "green":
					state = 3;
					greenButton.setEnabled(true);
					break;
			}
			
			t.start();
			
			frame.repaint();
		}
	}
}