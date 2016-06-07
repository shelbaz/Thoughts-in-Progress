package thirdsem;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import thirdsem.gameTicTacToe.Board;

public class Tic extends JFrame implements ActionListener
{
	
	int[] game = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	Cells c1 = new Cells(game);
	Cells c2 = new Cells(game);
	Cells c3 = new Cells(game);
	Cells c4 = new Cells(game);
	Cells c5 = new Cells(game);
	Cells c6 = new Cells(game);
	Cells c7 = new Cells(game);
	Cells c8 = new Cells(game);
	Cells c9 = new Cells(game);
	static Tic frame = new Tic();
	
	Tic()
	{
		setLayout(new BorderLayout());
		
		JButton newgame = new JButton("New Game");
		newgame.addActionListener(this);
		add(newgame, BorderLayout.NORTH);
		
		Board board = new Board();
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
		add(board);
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_11");
		frame.setSize(300 , 300);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		game = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
		c1 = new Cells(game);
		c2 = new Cells(game);
		c3 = new Cells(game);
		c4 = new Cells(game);
		c5 = new Cells(game);
		c6 = new Cells(game);
		c7 = new Cells(game);
		c8 = new Cells(game);
		c9 = new Cells(game);
		
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
}
