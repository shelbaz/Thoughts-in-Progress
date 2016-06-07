package thirdsem;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class movableVertices extends JFrame
{
	public movableVertices()
	{
		add(new newPanel());
	}
	
	public static void main(String[] args)
	{
		movableVertices frame = new movableVertices();
		frame.setTitle("Exercise13_17");
		frame.setSize(450 , 450);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static double randomNum()
	{
		return Math.random() * 1500;
	}
	
	static int randomX1 = 5;
	static int randomY1 = 15;
	static int randomX2 = 230;
	static int randomY2 = 150;
	static String distance = "0";
	static String moved = 0 + "";
	
	class newPanel extends JPanel
	{
		newPanel()
		{
					
			addMouseMotionListener (new MouseMotionListener(){
				@Override
				public void mouseDragged(java.awt.event.MouseEvent e) {
					// TODO Auto-generated method stub
					if (e.getX() >= randomX1 - 30 && e.getX() <= randomX1 + 30 && e.getY() >= randomY1 - 30 && e.getY() <= randomY1 + 30 && distance(e.getX(), e.getY(), randomX2, randomY2) > 70)
					{
						randomX1 = e.getX();
						randomY1 = e.getY();
						
						repaint();
					}
					
					
					if (e.getX() >= randomX2 - 30 && e.getX() <= randomX2 + 30 && e.getY() >= randomY2 - 30 && e.getY() <= randomY2 + 30 && distance(e.getX(), e.getY(), randomX1, randomY1) > 70)
					{
						randomX2 = e.getX();
						randomY2 = e.getY();
						
						repaint();
					}				
				}

				@Override
				public void mouseMoved(java.awt.event.MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		protected void paintComponent(Graphics g)
		{
		
			super.paintComponent(g);
			
			while (randomX1 > (getWidth() - 30))
				randomX1 = (int) randomNum();
			
			while (randomX2 > (getWidth() - 30))
				randomX2 = (int) randomNum();
			
			while (randomY1 > (getHeight() - 30))
				randomY1 = (int) randomNum();
			
			while (randomY2 > (getHeight() - 30))
				randomY2 = (int) randomNum();
			
			g.fillOval(randomX1, randomY1, 30, 30);
			g.fillOval(randomX2, randomY2, 30, 30);
			
			g.drawLine(randomX1 + 15, randomY1 + 15, randomX2 + 15, randomY2 + 15);
			

			distance = (int) (Math.sqrt(Math.pow((randomX1 - randomX2) , 2) + Math.pow((randomY1 - randomY2) , 2))) + "";
						
			g.drawString(distance , (int) ((randomX1 + randomX2) / 2) , (int) ((randomY1 + randomY2) / 2 + 10));
		}
	}
	
	public double distance (int x1, int y1, int x2, int y2)
	{
		return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
	}
}