import javax.swing.*;
import java.awt.*;

public class twoCirclesAndDistance extends JFrame
{
	public twoCirclesAndDistance()
	{
		add(new newPanel());
	}
	
	public static void main(String[] args)
	{
		twoCirclesAndDistance frame = new twoCirclesAndDistance();
		frame.setTitle("Exercise13_17");
		frame.setSize(300 , 150);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static double randomNum()
	{
		return Math.random() * 1500;
	}
	
	class newPanel extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			int randomX1 = (int) randomNum();
			int randomY1 = (int) randomNum();
			int randomX2 = (int) randomNum();
			int randomY2 = (int) randomNum();
			
			while (randomX1 > (getWidth() - 30))
				randomX1 = (int) randomNum();
			
			while (randomX2 > (getWidth() - 30))
				randomX2 = (int) randomNum();
			
			while (randomY1 > (getHeight() - 30))
				randomY1 = (int) randomNum();
			
			while (randomY2 > (getHeight() - 30))
				randomY2 = (int) randomNum();
			
			g.fillOval(randomX1, randomY1, 30, 30);
			g.fillOval(randomX2, randomY2, 30, 30);
			
			g.drawLine(randomX1 + 15, randomY1 + 15, randomX2 + 15, randomY2 + 15);
			
			String distance = (int) Math.sqrt(Math.pow((randomX1 - randomX2) , 2) + Math.pow((randomY1 - randomY2) , 2)) + "";

			g.drawString( distance , (int) ((randomX1 + randomX2) / 2) , (int) ((randomY1 + randomY2) / 2 + 10));
		}
	}
}