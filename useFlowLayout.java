import java.awt.*;
import javax.swing.*;

public class useFlowLayout 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Exercise12_1"); // Create a frame
		frame.setLayout (new FlowLayout());
		
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
	    frame.add(pn1);
	    frame.add(pn2);
	    
	    // set frame size and location
	    frame.setSize(600, 80);
	    frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Display the frame
		frame.pack();
	}
}