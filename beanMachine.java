package thirdsem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class beanMachine extends JFrame implements ActionListener
{
	static beanMachine frame = new beanMachine();
	
	JLabel label = new JLabel("Number of slots: ");
	JTextField slots = new JTextField("10");
	public machine machine = new machine(Integer.parseInt(slots.getText()) - 1);
	JButton start = new JButton("Start");
	JButton stop = new JButton("Stop");
	Timer timer = new Timer(50, new timeListener());
	Random randomGenerator = new Random();
		
	beanMachine()
	{
		setLayout(new BorderLayout());
		slots.addActionListener(this);
		slots.setActionCommand("slots");
		
		start.addActionListener(this);
		start.setActionCommand("start");
		
		stop.addActionListener(this);
		stop.setActionCommand("stop");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		p.add(label);
		p.add(slots);
		p.add(start);
		p.add(stop);
		add(machine, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_24");
		frame.setSize(400 , 600);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public class machine extends JPanel
	{
		int layernum;
		int ballAt = 0;		
		int count = 0;
		int ballx = 187;
		int bally = 20;
		int bug = 2;
		int[] ballslots = new int[layernum];
		
		machine(int layers)
		{
			layernum = layers;
			ballslots = new int[layernum + 1];
		}
		
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			// draw "bottle"
			int[] xPoints = new int[] {getWidth()/2-15, getWidth()/2-15,
										getWidth()/2 - 10*layernum - 10, getWidth()/2 - 10*layernum - 10,
										getWidth()/2 + 10*layernum + 10, getWidth()/2 + 10*layernum + 10,
										getWidth()/2+15, getWidth()/2+15};
		
			int[] yPoints = new int[] {30, 40,
									30 + 20*layernum, 30 + 20*layernum + 35,
									30 + 20*layernum + 35, 30 + 20*layernum,
									40, 30};
			g.setColor(Color.BLACK);
			g.drawPolyline(xPoints, yPoints, 8);
			
			// draw slots
						g.setColor(Color.BLUE);
						for (int i = 0; i < layernum; i++)
							g.drawLine(getWidth()/2 - 10*layernum - 5 + i*20 + 15, 25 + layernum * 20, getWidth()/2 - 10*layernum - 5 + i*20 + 15, 25 + layernum * 20 + 40);
			
			// draw balls
			g.setColor(Color.GREEN);
			for (int row = 1, push = 10; row <= layernum; row++, push+=10)
				for (int column = 0; column < row; column++)
				{
					g.fillOval(getWidth()/2 - column*20 - 15 + push, 25 + row * 20, 10, 10);
				}
			
			bug -= 1;
			if (bug < 0)
			{
				// BALL
				g.setColor(Color.RED);
				g.fillOval(ballx, bally, 10, 10);
			
				if(bally < (25 + (layernum - 1) * 20))
				{
					ballx += 10 * path();
					bally += 20;
				}
				
				else if(bally >= (25 + (layernum - 1) * 20))
					bally += 35;
				
				if(bally >= (25 + layernum * 20 + 35))
				{
					ballslots[(ballx - 5 - (getWidth()/2 - 10* layernum - 10)) / 20] += 1;
					ballx = getWidth() / 2 - 5;
					bally = 20;
				}
			}
			
			//balls in slots
			
			for (int i = 0; i < ballslots.length; i++)
			{
				if (ballslots[i] == 1)
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 50, 10, 10);
				
				else if (ballslots[i] == 2)
				{
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 50, 10, 10);
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 40, 10, 10);
				}
				
				else if (ballslots[i] == 3)
				{
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 50, 10, 10);
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 40, 10, 10);
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 30, 10, 10);
				}
				
				else if (ballslots[i] == 4)
				{
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 50, 10, 10);
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 40, 10, 10);
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 30, 10, 10);
					g.fillOval((getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 20, 10, 10);
				}
				
				else if (ballslots[i] > 4)
					g.drawString(ballslots[i] + "" ,(getWidth()/2 - 10* layernum - 10) + 5 + i*20, (25 + (layernum - 1) * 20) + 50);
			}
		}
		
		int path()
		{
			if((int) (Math.random() * 10) % 2 == 0)
				return -1;
			
			return 1;
		}
		
		void setLayers(int layers)
		{
			layernum = layers - 1;
			ballslots = new int[layernum + 1];
			ballx = getWidth() / 2 - 5;
			bally = 20;
			repaint();
		}
	}
	
	class timeListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			machine.repaint();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		switch(arg0.getActionCommand())
		{
			case "slots":
				machine.setLayers(Integer.parseInt(slots.getText()));
				repaint();
				break;

			case "start":
				timer.start();
				break;

			case "stop":
				timer.stop();
				break;
		}
	}
}