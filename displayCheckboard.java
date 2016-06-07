import javax.swing.*;
import java.awt.*;

public class displayCheckboard extends JFrame
{
	public displayCheckboard()
	{
		add(new newPanel());
	}
	
	public static void main(String[] args)
	{
		displayCheckboard frame = new displayCheckboard();
		frame.setTitle("Exercise13_3");
		frame.setSize(350 , 200);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
	
	class newPanel extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			int count = 0;
			int rectanglesH = 0;
			int rectanglesV = 0;
			super.paintComponent(g);
			for (int y = 0 ; rectanglesH < 10; y += getHeight() / 10 , rectanglesH++)
			{
				rectanglesV = 0;
				for (int x = getWidth() / 10 ; rectanglesV < 5; x += getWidth() / 5 , rectanglesV++)
				{
					count++;
					if (count > 2)
						count -= 1;
					if (rectanglesH % 2 != 0 && count % 2 == 1)
						x -= getWidth() / 10;
					g.fillRect(x, y, getWidth() / 10 , getHeight() / 10);
				}
				count = 0;
			}
		}
	}
}
