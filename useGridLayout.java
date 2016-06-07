import java.awt.*;
import javax.swing.*;

public class useGridLayout
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Exercise12_3"); // Create a frame
		frame.setLayout (new GridLayout(3 , 2));
		
		
		// create buttons
		

	    frame.add(new JButton("Button 1"));
	    frame.add(new JButton("Button 2"));
	    frame.add(new JButton("Button 3"));
	    frame.add(new JButton("Button 4"));
	    frame.add(new JButton("Button 5"));
	    frame.add(new JButton("Button 6"));
	    
	    
	    // set frame size and location
	    frame.setSize(750 , 750);
	    frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Display the frame
		frame.pack();
	}
}