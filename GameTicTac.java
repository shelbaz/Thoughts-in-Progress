package thirdsem;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*; //ADD SMART

public class GameTicTac extends JFrame implements ActionListener
{
	static GameTicTac frame = new GameTicTac();
	static Cell c1 = new Cell();
	static Cell c2 = new Cell();
	static Cell c3 = new Cell();
	static Cell c4 = new Cell();
	static Cell c5 = new Cell();
	static Cell c6 = new Cell();
	static Cell c7 = new Cell();
	static Cell c8 = new Cell();
	static Cell c9 = new Cell();
	
	static int turn = 0;
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		super.paintComponents(getGraphics());
		
		c1 = new Cell();
		c2 = new Cell();
		c3 = new Cell();
		c4 = new Cell();
		c5 = new Cell();
		c6 = new Cell();
		c7 = new Cell();
		c8 = new Cell();
		c9 = new Cell();
		
		turn = 0;
		JPanel board = new Board();
		board.setLayout(new GridLayout(3, 3));
		board.add(c1);
		board.add(c2);
		board.add(c3);
		board.add(c4);
		board.add(c5);
		board.add(c6);
		board.add(c7);
		board.add(c8);
		board.add(c9);
		add(board, BorderLayout.CENTER);
	}
	
	GameTicTac()
	{
		setLayout(new BorderLayout());
		
		JButton newgame = new JButton("New Game");
		newgame.addActionListener(this);
		add(newgame, BorderLayout.NORTH);
		
		JLabel turn = new JLabel("Start");
		add(turn, BorderLayout.SOUTH);
		
		JPanel board = new Board();
		board.setLayout(new GridLayout(3, 3));
		board.add(c1);
		board.add(c2);
		board.add(c3);
		board.add(c4);
		board.add(c5);
		board.add(c6);
		board.add(c7);
		board.add(c8);
		board.add(c9);
		add(board, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_11");
		frame.setSize(300 , 300);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	static class Brains
	{
		static void move(Graphics g)
		{
			if (!c5.getStatus())
				c5.paintComponent(g, false, true, false);
		}
	}
	
	class Board extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			g.clearRect(0, 0, getWidth(), getHeight());
			
			g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
			
			//vert lines
			g.drawLine(5, (int) ((getHeight() - 10) * 0.33), getWidth() - 5, (int) ((getHeight() - 10) * 0.33));
			g.drawLine(5, (int) ((getHeight() - 10) * 0.66), getWidth() - 5, (int) ((getHeight() - 10) * 0.66));
			
			//hor lines
			g.drawLine( (int) (getWidth() * 0.33), 5,  (int) (getWidth() * 0.33), getHeight() - 5);
			g.drawLine( (int) (getWidth() * 0.66), 5, (int) (getWidth() * 0.66), getHeight() - 5);
		}
	}

	static class Cell extends JPanel
	{
		boolean cellTaken = false;
		
		protected void paintComponent(Graphics g)
		{
			addMouseListener(new MouseListener()
			{

				@Override
				public void mouseClicked(MouseEvent arg0) 
				{
					// TODO Auto-generated method stub
					paintComponent(getGraphics(), true, false, false);
				}

				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		protected void paintComponent(Graphics g, boolean x, boolean o, boolean clear)
		{
			if (x && !o && !clear)
			{
				g.drawLine(20,15,70,55);
				g.drawLine(70,15,20,55);
				cellTaken = true;
				turn = 1;
				Brains.move(g);
			}
			
			if (o && !x && !clear)
			{
				g.drawOval(20, 15, 50, 40);
				cellTaken = true;
				turn = 0;
				Brains.move(g);
			}
		}
				
		public boolean getStatus()
		{
			return cellTaken;
		}
	}
}
