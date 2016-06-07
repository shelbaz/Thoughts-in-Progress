import java.awt.*;
import javax.swing.*;

public class displayRandom
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Exercise12_14"); // Create a frame
		frame.setLayout (new GridLayout(10,10,10,5));
		
		// create buttons
		for (int i = 0; i < 100 ; i++)
		{
			JLabel lb = new JLabel(random());
			frame.add(lb);
		}

	    // set frame size and location
	    frame.setSize(750 , 750);
	    frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Display the frame
		frame.pack();
	}
	
	public static String random()
	{
		String r = Integer.toString((int) (Math.random()*2));
		return r;
	}
}