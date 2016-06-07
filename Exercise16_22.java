package thirdsem;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import thirdsem.beanMachine.machine;
import thirdsem.beanMachine.timeListener;

public class Exercise16_22 extends JFrame implements ActionListener
{
	static int NUMBER_OF_SLOTS = 9;
	static int NUMBER_OF_ROWS = 7;
	private int shift = 0;
	private int[] slots = new int[NUMBER_OF_SLOTS];
	private int numberOfBallsDropped = 0;
	private int moveCount = 0;
	private int position = 0;
	JLabel label = new JLabel("Number of slots: ");
	JTextField slotsfield = new JTextField("5");
	JButton start = new JButton("Start");
	JButton stop = new JButton("Stop");	
	
	Exercise16_22.BeanMachinePanel paintPanel = new Exercise16_22.BeanMachinePanel();
	
	Timer timer = new Timer(200, new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			Exercise16_22.this.moveCount += 1;
			if (Exercise16_22.this.moveCount <= 7) 
			{
				if (Math.random() < 0.5D) 
				{
					Exercise16_22.this.paintPanel.moveRedBallLeft();
				} 
				else 
				{
					Exercise16_22.this.paintPanel.moveRedBallRight();
					Exercise16_22.this.position += 1;
				}
			}
			else 
			{
				Exercise16_22.this.slots[Exercise16_22.this.position] += 1;
				Exercise16_22.this.paintPanel.startRedBall();
				Exercise16_22.this.shift = 0;
				Exercise16_22.this.moveCount = 0;
				Exercise16_22.this.position = 0;

				Exercise16_22.this.numberOfBallsDropped += 1;
				if (Exercise16_22.this.numberOfBallsDropped == 10) 
				{
					Exercise16_22.this.timer.stop();
					Exercise16_22.this.paintPanel.hideRedBall();
				}
			}
		}
	});

	public Exercise16_22()
	{
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.add(this.paintPanel);
		setLayout(new BorderLayout());
		slotsfield.addActionListener(this);
		slotsfield.setActionCommand("slots");
		
		start.addActionListener(this);
		start.setActionCommand("start");
		
		stop.addActionListener(this);
		stop.setActionCommand("Stop");
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,4));
		p.add(label);
		p.add(slotsfield);
		p.add(start);
		p.add(stop);
		add(p1);
		add(p, BorderLayout.SOUTH);
		this.timer.start();
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		switch(arg0.getActionCommand())
		{
			case "slots":
				remove(paintPanel);
				paintPanel = new Exercise16_22.BeanMachinePanel();
				add(paintPanel, BorderLayout.CENTER);
				Exercise16_22.setNumOfSlots(Integer.parseInt(slotsfield.getText()));
				System.out.println("gotText" + Integer.parseInt(slotsfield.getText()));
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
	
	static void setNumOfSlots(int newNum)
	{
		NUMBER_OF_SLOTS = newNum;
		NUMBER_OF_ROWS = NUMBER_OF_SLOTS - 2;
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new Exercise16_22();
		frame.setTitle("Exercise16_22");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	class BeanMachinePanel extends JPanel
	{
		static final int HGAP = 20;
		static final int VGAP = 20;
		static final int RADIUS = 5;
		static final int LENGTH_OF_SLOTS = 40;
		static final int LENGTH_OF_OPENNING = 15;
		static final int Y_FOR_FIRST_NAIL = 50;
		static final int RED_BALL_START_Y = 45;
		private int yRed = 45;
		private boolean hideRedBall = false;

		BeanMachinePanel() 
		{
		}
		public void moveRedBallLeft() 
		{ 
			Exercise16_22.this.shift -= 10;
			this.yRed += 20;
			repaint();
		}

		public void moveRedBallRight()
		{
			Exercise16_22.this.shift += 10;
			this.yRed += 20;
			repaint();
		}

		public void startRedBall()
		{
			this.yRed = 45;
			this.hideRedBall = false;
			repaint();
		}

		public void hideRedBall()
		{
			this.hideRedBall = true;
			repaint();
		}

		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);

			int y = 50;
			int xCenter = getWidth() / 2;

			if (!this.hideRedBall) 
			{
				g.setColor(Color.RED);
				int xRed = xCenter + Exercise16_22.this.shift;
				g.fillOval(xRed - 5, this.yRed - 5, 10, 10);
			}

			g.setColor(Color.GREEN);
			for (int i = 0; i < 7; i++) 
			{
				y += 20;
				for (int k = 0; k <= i; k++) 
				{
					g.fillOval(xCenter - i * 20 / 2 + k * 20 - 5, y - 5, 10, 10);
				}
			}

			g.setColor(Color.BLACK);
			y += 5;
			for (int i = 0; i < 9; i++) 
			{
				int x = xCenter - 60 + (i - 1) * 20;
				g.drawLine(x, y, x, y + 40);
			}

			for (int i = 0; i < NUMBER_OF_SLOTS; i++) 
			{
				int x = xCenter - 60 + (i - 1) * 20;
				g.drawLine(x, y, x, y + 40);
			}

			int[] xPoints = new int[] {getWidth()/2-10, getWidth()/2-10,
					getWidth()/2 - 10*NUMBER_OF_SLOTS, getWidth()/2 - 10*NUMBER_OF_SLOTS,
					getWidth()/2 + 10*NUMBER_OF_SLOTS, getWidth()/2 + 10*NUMBER_OF_SLOTS,
					getWidth()/2+10, getWidth()/2+10};

			int[] yPoints = new int[] {40, 50,
									30 + 20*NUMBER_OF_SLOTS, 30 + 20*NUMBER_OF_SLOTS + 35,
									30 + 20*NUMBER_OF_SLOTS + 35, 30 + 20*NUMBER_OF_SLOTS,
									50, 40};

			g.drawPolyline(xPoints, yPoints, 8);

			g.setColor(Color.RED);
			for (int i = 0; i < Exercise16_22.this.slots.length; i++) 
			{
				int x = xCenter - 70 + i * 20;
				for (int j = 0; j < Exercise16_22.this.slots[i]; j++)
					g.fillOval(x - 5, y + 40 - 10 - j * 2 * 5, 10, 10);
			}
		}
	}
}