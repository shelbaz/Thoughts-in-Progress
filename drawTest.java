package thirdsem;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class drawTest extends JFrame
{
	int layers = 5;
	static drawTest frame = new drawTest();	
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_24");
		frame.setSize(400 , 500);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.repaint();
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		/*int[] xPoints = new int[] {getWidth()/2-5, getWidth()/2-5,
								getWidth()/2-5*layers, getWidth()/2 - 5*layers,
								getWidth()/2 + 5*layers, getWidth()/2 + 5*layers,
								getWidth()/2+5, getWidth()/2+5};
		
		int[] yPoints = new int[] {30, 30,
								30 + 5*layers, 30 + 5*layers + 10,
								30 + 5*layers + 10, 30 + 5*layers,
								30, 30};
		
		g.drawPolyline(xPoints, yPoints, 8);*/
		
		g.fillRect(0, 0, getWidth(), getHeight());
		repaint();
	}
}
