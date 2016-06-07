package thirdsem;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.*;

import javax.swing.*;


public class DisplayAGraph 
{
	static int n;
	static String[] array = null;
	static TextField tf = new TextField("", 30);
	static JTextArea ta = new JTextArea();
	static JLabel label = new JLabel("Enter the path of the text file: ");
	static Graph graph = new Graph(n, array);
	static JPanel panel2 = new JPanel();
	  
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Display a graph");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(725 , 700);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(tf);
		frame.add(panel, BorderLayout.SOUTH);
		
		frame.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new BorderLayout());
		panel2.add(ta, BorderLayout.WEST);
		panel2.add(graph, BorderLayout.CENTER);
			
		tf.addKeyListener(new KeyListener()
		{
		
			@Override
			public void keyPressed(KeyEvent e) 
			{
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
			   
					try
					{
						Scanner input = new Scanner(new FileReader(tf.getText()));
						n = Integer.parseInt(input.nextLine());
						ta.setText(n + "");
						array = new String[n];
						for(int i = 0; input.hasNextLine(); i++)
						{
							array[i] = input.nextLine();
							ta.setText(ta.getText() + "\n" + array[i]);
						}
						graph.setAll(n, array);
					}
					catch(Exception a)
					{
						ta.setText("File not found!");
					}
				}
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			    
			}
			
			@Override
			public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			    
			}
		});
	}
}