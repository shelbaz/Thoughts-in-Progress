import javax.swing.*;
import java.awt.*;

public class displayIcons 
{
	public static void main(String[]args)
	{
		  
		JFrame frame = new JFrame("Exercise12_3"); // Create a frame
		frame.setLayout (new GridLayout(2 , 2));
		
		// get pictures from folder
		ImageIcon p1 = new ImageIcon("C:/Users/Public/Pictures/Sample Pictures/Chrysanthemum.jpg");
		ImageIcon p2 = new ImageIcon("C:/Users/Public/Pictures/Sample Pictures/Desert.jpg");
		ImageIcon p3 = new ImageIcon("C:/Users/Public/Pictures/Sample Pictures/Hydrangeas.jpg");
		ImageIcon p4 = new ImageIcon("C:/Users/Public/Pictures/Sample Pictures/Jellyfish.jpg");

		
		// add icons to the frame
		JLabel flag = new JLabel(p1);
		flag.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(flag);
		
		flag.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(new JLabel(p2));
		
		flag.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(new JLabel(p3));
		
		flag.setBorder(BorderFactory.createLineBorder(Color.black));
		frame.add(new JLabel(p4));


	    
		frame.setSize(750 , 750);
	    frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); // Display the frame
	}
}