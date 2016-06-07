package thirdsem;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*; //ADD SMART

import thirdsem.Tic.Board;

public class gameTicTacToe extends JFrame implements ActionListener
{
	static Cello c1 = new Cello(1);
	static Cello c2 = new Cello(2);
	static Cello c3 = new Cello(3);
	static Cello c4 = new Cello(4);
	static Cello c5 = new Cello(5);
	static Cello c6 = new Cello(6);
	static Cello c7 = new Cello(7);
	static Cello c8 = new Cello(8);
	static Cello c9 = new Cello(9);
	
	static String cellStatus1 = null;
	static String cellStatus2 = null;
	static String cellStatus3 = null;
	static String cellStatus4 = null;
	static String cellStatus5 = null;
	static String cellStatus6 = null;
	static String cellStatus7 = null;
	static String cellStatus8 = null;
	static String cellStatus9 = null;
	
	Board board = new Board();
	JLabel turn = new JLabel("Start");
	public static gameTicTacToe frame = new gameTicTacToe();

	gameTicTacToe()
	{
		setLayout(new BorderLayout());
		
		JButton newgame = new JButton("New Game");
		newgame.addActionListener(this);
		add(newgame, BorderLayout.NORTH);
		
		add(turn, BorderLayout.SOUTH);
		
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
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
		c1 = new Cello(1);
		c2 = new Cello(2);
		c3 = new Cello(3);
		c4 = new Cello(4);
		c5 = new Cello(5);
		c6 = new Cello(6);
		c7 = new Cello(7);
		c8 = new Cello(8);
		c9 = new Cello(9);
		
		cellStatus1 = null;
		cellStatus2 = null;
		cellStatus3 = null;
		cellStatus4 = null;
		cellStatus5 = null;
		cellStatus6 = null;
		cellStatus7 = null;
		cellStatus8 = null;
		cellStatus9 = null;
		
		frame.repaint();
		
		board = new Board();
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
		
		turn.setText("Start");
	}
	
	class Board extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, getWidth(), getHeight());
			g.setColor(Color.BLACK);
			
			g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
			
			//vert lines
			g.drawLine(5, (int) ((getHeight() - 10) * 0.33), getWidth() - 5, (int) ((getHeight() - 10) * 0.33));
			g.drawLine(5, (int) ((getHeight() - 10) * 0.66), getWidth() - 5, (int) ((getHeight() - 10) * 0.66));
			
			//hor lines
			g.drawLine( (int) (getWidth() * 0.33), 5,  (int) (getWidth() * 0.33), getHeight() - 5);
			g.drawLine( (int) (getWidth() * 0.66), 5, (int) (getWidth() * 0.66), getHeight() - 5);
		}
	}
	
	static void getMoved(int c, String who)
	{
		switch (c)
		{
			case 1:
				if (who == "player")
					cellStatus1 = "player";
				else if (who == "computer")
					cellStatus1 = "computer";
				break;
				
			case 2:
				if (who == "player")
					cellStatus2 = "player";
				else if (who == "computer")
					cellStatus2 = "computer";
				break;
				
			case 3:
				if (who == "player")
					cellStatus3 = "player";
				else if (who == "computer")
					cellStatus3 = "computer";
				break;
				
			case 4:
				if (who == "player")
					cellStatus4 = "player";
				else if (who == "computer")
					cellStatus4 = "computer";
				break;
				
			case 5:
				if (who == "player")
					cellStatus5 = "player";
				else if (who == "computer")
					cellStatus5 = "computer";
				break;
				
			case 6:
				if (who == "player")
					cellStatus6 = "player";
				else if (who == "computer")
					cellStatus6 = "computer";
				break;
				
			case 7:
				if (who == "player")
					cellStatus7 = "player";
				else if (who == "computer")
					cellStatus7 = "computer";
				break;
				
			case 8:
				if (who == "player")
					cellStatus8 = "player";
				else if (who == "computer")
					cellStatus8 = "computer";
				break;
				
			case 9:
				if (who == "player")
					cellStatus9 = "player";
				else if (who == "computer")
					cellStatus9 = "computer";
				break;
				
		}
		
		
		if (cellStatus5 == null)
		{
			setPlayerForCells();
			c5.paintCell();

		}
			
	}
	
	static int who = 0;
	static void setPlayerForCells()
	{
		if (who == 0)
		{
			c1.setPlayer(true);
			c2.setPlayer(true);
			c3.setPlayer(true);
			c4.setPlayer(true);
			c5.setPlayer(true);
			c6.setPlayer(true);
			c7.setPlayer(true);
			c8.setPlayer(true);
			c9.setPlayer(true);
			who = 1;
		}
		
		else if (who == 1)
		{
			c1.setPlayer(false);
			c2.setPlayer(false);
			c3.setPlayer(false);
			c4.setPlayer(false);
			c5.setPlayer(false);
			c6.setPlayer(false);
			c7.setPlayer(false);
			c8.setPlayer(false);
			c9.setPlayer(false);
			who = 0;
		}
	}
}
