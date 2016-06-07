package thirdsem;

// C:\Users\Red\Desktop\workspace\thirdsem\src\thirdsem\gyu.txt
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.util.*;
	public class histogramLetters extends JFrame
	{
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Text File: ");
		JTextField tf = new JTextField("", 30);
		int[] count = new int[26];
	
		histogramLetters()
		{
			setLayout(new BorderLayout());
		
			Histogram histogram = new Histogram();
			histogram.showHistogram(count);
			add(histogram, BorderLayout.CENTER);
		
			panel.add(label);
			tf.addKeyListener(new KeyListener()
			{
				@Override
				public void keyPressed(KeyEvent arg0) {
					// TODO Auto-generated method stub
	
				}
			
				@Override
				public void keyReleased(KeyEvent arg0) {
					// TODO Auto-generated method stub
				
				}
			
				@Override
				public void keyTyped(KeyEvent e) 
				{
					// TODO Auto-generated method stub
					if(e.getKeyChar() == e.VK_ENTER)
					{
						try
						{
							String fileName = tf.getText();
							File textFile = new File(fileName);
							Scanner input = new Scanner(new FileReader(textFile));
							
							String text = "";
							
							while(input.hasNext())
							{
								text += input.next();
							} 
							// Count occurrences of each letter (case insensitive)
							for (int i = 0; i < text.length(); i++) 
							{
								char character = text.charAt(i);
			 
								if (character >= 'A' && character <= 'Z') 
									count[character - 'A']++;

								else if (character >= 'a' && character <= 'z')
									count[character - 'a']++;

							}
							repaint();
						}
					
						catch(Exception E)
						{
							System.out.println("Wrong file path!");
							tf.setText("");
						}
					}
				}
			});
			panel.add(tf);
			add(panel, BorderLayout.SOUTH);
		}
	
		public static void main(String[] args)
		{
			histogramLetters frame = new histogramLetters();
			frame.setTitle("Exercise 17.5");
			frame.setSize(500, 500);
			frame.setLocationRelativeTo(null); //Center the frame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
}