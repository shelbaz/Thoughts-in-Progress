package thirdsem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;

public class gameHangman extends JFrame
{
	public gameHangman()
	{
		add(new newPanel());
		
		addKeyListener (new KeyListener(){
			@Override
			public void keyPressed(KeyEvent e) 
			{
				// TODO Auto-generated method stub
			    try{
				switch(e.getKeyCode()) 
			    { 
			       	case KeyEvent.VK_UP:
			        	t.setDelay(t.getDelay() - 1);	
			            break;
			            
			        case KeyEvent.VK_DOWN:
			        	t.setDelay(t.getDelay() + 1);			        	
			            break;
			        			        
			        case KeyEvent.VK_S:
			            t.stop();		            
			            break;
			            
			        case KeyEvent.VK_R :
			            t.start();
			            break;
			    }}
			    
			    catch(Exception ex)
			    {}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stu
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			
		});
	}
	
	static gameHangman frame = new gameHangman();
	
	Timer t = new Timer(10, new timeListener());
	newPanel panel = new newPanel();
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise13_17");
		frame.setSize(400 , 400);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class timeListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			repaint();
		}
	}
	
	double angle = 90;
	double angleh = 90;
	double inc = -1;
	double fix = -0.2;
	
	class newPanel extends JPanel 
	{
		newPanel()
		{
			
		}
		protected void paintComponent(Graphics g)
		{
			t.start();
			int width = getWidth();
			int height = getHeight();
			angle += inc;
			angleh += inc;
			
			if (angle >= 136)
			{
				inc *= -1;
				fix *= -1;
			}
			
			if (angle <= 44)
			{
				inc *= -1;
				fix *= -1;
			}
			
			angleh += fix;
			
			//head
			double[] head = point((0.7 * width), (0.1 * height), (0.625 * width), (0.175 * height), angleh, false);
			g.drawOval((int) head[0] - 29, (int) head[1] - 13, (int) (0.15 * width) , (int) (0.15 * height));
			
			//torso
			double[] torsotop = point((0.7 * width), (0.1 * height), (0.7 * width), (0.325 * height), angle, false);
			double[] torsobot = point((0.7 * width), (0.1 * height), (0.7 * width), (0.6 * height), angle, false);
			g.drawLine((int) torsotop[0] , (int) torsotop[1] , (int) torsobot[0] , (int) torsobot[1]);
			
			//right leg
			double[] rltop = point((0.7 * width), (0.1 * height), (0.55 * width), (0.75 * height), angle - 15, false);
			double[] rlbot = point((0.7 * width), (0.1 * height), (0.7 * width), (0.6 * height), angle, false);
			g.drawLine((int) rltop[0] , (int) rltop[1] , (int) rlbot[0] , (int) rlbot[1]);
			
			//left leg
			double[] lltop = point((0.7 * width), (0.1 * height), (0.85 * width), (0.75 * height), angle + 15, false);
			double[] llbot = point((0.7 * width), (0.1 * height), (0.7 * width), (0.6 * height), angle, false);
			g.drawLine((int) lltop[0] , (int) lltop[1] , (int) llbot[0] , (int) llbot[1]);
			
			//right hand
			double[] rhtop = point((0.7 * width), (0.1 * height), (0.65 * width), (0.31 * height), angle, false);
			double[] rhbot = point((0.7 * width), (0.1 * height), (0.5 * width), (0.5 * height), angle - 25, false);
			g.drawLine((int) rhtop[0] , (int) rhtop[1] , (int) rhbot[0] , (int) rhbot[1]);
			
			//left hand
			double[] lhtop = point((0.7 * width), (0.1 * height), (0.75 * width), (0.31 * height), angle, false);
			double[] lhbot = point((0.7 * width), (0.1 * height), (0.9 * width), (0.5 * height), angle + 25, false);
			g.drawLine((int) lhtop[0] , (int) lhtop[1] , (int) lhbot[0] , (int) lhbot[1]);
			
			//rope
			double[] ropetop = point((0.7 * width), (0.1 * height), (0.7 * width), (0.1 * height), angle, true);
			double[] ropebot = point((0.7 * width), (0.1 * height), (0.7 * width), (0.175 * height), angle, true);
			g.drawLine((int) ropetop[0] , (int) ropetop[1] , (int) ropebot[0], (int) ropebot[1]);
			
			//hanger top
			g.drawLine((int) (0.24 * width) , (int) (0.1 * height) , (int) (0.7 * width) , (int) (0.1 * height));
			
			//hanger mid
			g.drawLine((int) (0.24 * width) , (int) (0.9 * height) , (int) (0.24 * width) , (int) (0.1 * height));
			
			// hanger base
			g.drawArc((int) (0.05 * width) , (int) (0.9 * height) , (int) (0.38 * width) , (int) (0.25 * height) , 30 , 120);
		}
	}
	 
	
	public double[] point(double cx, double cy, double x, double y, double angle, boolean fix)
	{
		if (!fix)
			return new double[] {cx + Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2)) * Math.cos(angle/360*2*Math.PI), cy + Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2)) * Math.sin(angle/360*2*Math.PI)};
		
		else
			return new double[] {cx + (Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2))-4) * Math.cos(angle/360*2*Math.PI), cy + (Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2))-4) * Math.sin(angle/360*2*Math.PI)};
 	}
}