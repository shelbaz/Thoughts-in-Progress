import java.awt.*;
import javax.swing.*;

public class useBorderLayout
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Exercise12_2"); // Create a frame
		frame.setLayout (new BorderLayout());
		
		// create panels
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		// create buttons
	    pn1.add(new JButton("Button 1"));
	    pn1.add(new JButton("Button 2"));
	    pn1.add(new JButton("Button 3"));
	    pn2.add(new JButton("Button 4"));
	    pn2.add(new JButton("Button 5"));
	    pn2.add(new JButton("Button 6"));
	    
	    // add panels to frame
	    frame.add((pn1), BorderLayout.CENTER);
	    frame.add((pn2), BorderLayout. SOUTH);
	    
	    // set frame size and location
	    frame.setSize(750 , 750);
	    frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Display the frame
		frame.pack();
	}
}