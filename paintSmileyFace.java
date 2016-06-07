import javax.swing.*;
import java.awt.*;

public class paintSmileyFace extends JFrame
{
	public paintSmileyFace()
	{
		add(new newPanel());
	}
	
	public static void main(String[] args)
	{
		paintSmileyFace frame = new paintSmileyFace();
		frame.setTitle("Exercise13_13");
		frame.setSize(350 , 350);
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
			
			g.drawOval((int) (0.1 * width) , (int) (0.1 * height) , (int) (0.8 * width) , (int) (0.8 * height));
			g.drawOval((int) (0.25 * width) , (int) (0.3 * height) , (int) (0.2 * width) , (int) (0.1 * height));
			g.drawOval((int) (0.25 * width + 0.3 * width) , (int) (0.3 * height) , (int) (0.2 * width) , (int) (0.1 * height));
			g.fillOval((int) (0.31 * width) , (int) (0.32 * height) , (int) (0.07 * width) , (int) (0.07 * height));
			g.fillOval((int) (0.31 * width + 0.3 * width) , (int) (0.32 * height) , (int) (0.07 * width) , (int) (0.07 * height));
			g.drawLine((int) (0.5 * width) , (int) (0.4 * height) , (int) (0.65 * width) , (int) (0.65 * height));
			g.drawLine((int) (0.35 * width) , (int) (0.65 * height) , (int) (0.65 * width) , (int) (0.65 * height));
			g.drawLine((int) (0.5 * width) , (int) (0.4 * height) , (int) (0.35 * width) , (int) (0.65 * height));
			g.drawArc((int) (0.31 * width) , (int) (0.57 * height) , (int) (0.38 * width) , (int) (0.25 * height) , 180 , 180);
		}
	}
}