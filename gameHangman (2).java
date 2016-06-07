import javax.swing.*;
import java.awt.*;

public class gameHangman extends JFrame
{
	public gameHangman()
	{
		add(new newPanel());
	}
	
	public static void main(String[] args)
	{
		gameHangman frame = new gameHangman();
		frame.setTitle("Exercise13_17");
		frame.setSize(300 , 400);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class newPanel extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			int width = getWidth();
			int height = getHeight();
			
			g.drawOval((int) (0.625 * width) , (int) (0.175 * height) , (int) (0.15 * width) , (int) (0.15 * height));
			g.drawLine((int) (0.7 * width) , (int) (0.325 * height) , (int) (0.7 * width) , (int) (0.6 * height));
			g.drawLine((int) (0.55 * width) , (int) (0.75 * height) , (int) (0.7 * width) , (int) (0.6 * height));
			g.drawLine((int) (0.85 * width) , (int) (0.75 * height) , (int) (0.7 * width) , (int) (0.6 * height));
			g.drawLine((int) (0.65 * width) , (int) (0.31 * height) , (int) (0.5 * width) , (int) (0.5 * height));
			g.drawLine((int) (0.75 * width) , (int) (0.31 * height) , (int) (0.9 * width) , (int) (0.5 * height));
			g.drawLine((int) (0.7 * width) , (int) (0.1 * height) , (int) (0.7 * width) , (int) (0.175 * height));
			g.drawLine((int) (0.24 * width) , (int) (0.1 * height) , (int) (0.7 * width) , (int) (0.1 * height));
			g.drawLine((int) (0.24 * width) , (int) (0.9 * height) , (int) (0.24 * width) , (int) (0.1 * height));
			g.drawArc((int) (0.05 * width) , (int) (0.9 * height) , (int) (0.38 * width) , (int) (0.25 * height) , 30 , 120);
		}
	}
}