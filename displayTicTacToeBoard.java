import javax.swing.*;

import java.awt.*;

public class displayTicTacToeBoard extends JFrame
{
	public displayTicTacToeBoard()
	{
		setLayout(new GridLayout (3 , 3));
		
		for (int i = 0 ; i < 9 ; i++)
			add(new newPanel());
	}
	
	public static void main(String[] args)
	{
		displayTicTacToeBoard frame = new displayTicTacToeBoard();
		frame.setTitle("Exercise13_7");
		frame.setSize(350 , 350);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static int randomNum()
	{
		return (int) (Math.random() * 10 % 3);
	}
	
	class newPanel extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			int width = getWidth();
			int height = getHeight();
			
			switch (randomNum())
			{
				case 0:
					g.setColor(Color.BLACK);
					g.drawLine(10 , 10 , width - 10 , height - 10);
					g.drawLine(width - 10 , 10 , 10 , height - 10);
					break;
				
				case 1:
					g.setColor(Color.BLACK);
					g.drawOval((int) (0.1 * width) , (int) (0.1 * height) , (int) (0.8 * width) , (int) (0.8 * height));
			}
		}
	}
}