package thirdsem;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class racingCars extends JFrame implements ActionListener
{
	
	static racingCars frame = new racingCars();

	car car1 = new car();
	car car2 = new car();
	car car3 = new car();
	car car4 = new car();
	JTextField speed1 = new JTextField("10");		
	JTextField speed2 = new JTextField("10");
	JTextField speed3 = new JTextField("10");
	JTextField speed4 = new JTextField("10");

	racingCars()
	{
		setLayout(new GridLayout(5,1));
		
		speed1.addActionListener(this);
		speed2.addActionListener(this);
		speed3.addActionListener(this);
		speed4.addActionListener(this);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		JPanel controls = new JPanel();
		
		controls.setLayout(new GridLayout(1,8));
		controls.add(new JLabel("             Car 1: "));
		controls.add(speed1);
		controls.add(new JLabel("             Car 2: "));
		controls.add(speed2);
		controls.add(new JLabel("             Car 3: "));
		controls.add(speed3);
		controls.add(new JLabel("             Car 4: "));
		controls.add(speed4);
		
		p1.add(controls, BorderLayout.NORTH);
		add(p1);
				
		add(car1);
		add(car2);
		add(car3);
		add(car4);
		
		car1.setSpeed(Integer.parseInt(speed1.getText()));
		car2.setSpeed(Integer.parseInt(speed2.getText()));
		car3.setSpeed(Integer.parseInt(speed3.getText()));
		car4.setSpeed(Integer.parseInt(speed4.getText()));
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_17");
		frame.setSize(750 , 350);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if (Integer.parseInt(speed1.getText()) == 0)
			car1.timer.stop();
		else if (Integer.parseInt(speed1.getText()) <= 100 && Integer.parseInt(speed1.getText()) > 0)
			car1.setSpeed(Integer.parseInt(speed1.getText()));
		
		if (Integer.parseInt(speed2.getText()) == 0)
			car2.timer.stop();
		else if (Integer.parseInt(speed2.getText()) <= 100 && Integer.parseInt(speed2.getText()) > 0)
			car2.setSpeed(Integer.parseInt(speed2.getText()));
		
		if (Integer.parseInt(speed3.getText()) == 0)
			car3.timer.stop();
		else if (Integer.parseInt(speed3.getText()) <= 100 && Integer.parseInt(speed3.getText()) > 0)
			car3.setSpeed(Integer.parseInt(speed3.getText()));
		
		if (Integer.parseInt(speed4.getText()) == 0)
			car4.timer.stop();
		else if (Integer.parseInt(speed4.getText()) <= 100 && Integer.parseInt(speed4.getText()) > 0)
			car4.setSpeed(Integer.parseInt(speed4.getText()));

		else 
		{
			JFrame f = new JFrame();
			f.setLayout(new BorderLayout());
			JLabel l = new JLabel("Please set the speed from 0 to 100");
			f.add(l, BorderLayout.CENTER);
			f.setTitle("Error");
			f.setSize(215 , 100);
			f.setLocationRelativeTo(null); //Center the frame
			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			f.setVisible(true);
		}
	}
		
	class car extends JPanel implements ActionListener
	{
		int minus = 50;
		int delay = 50;
		private BufferedImage image;
		
		private Timer timer = new Timer(delay, this);
		
		void setSpeed(int newSpeed)
		{
			delay = 100 / newSpeed;
			System.out.println("Delay: " + delay);
			timer.start();
			timer.setDelay(delay);
		}
				
		car()
		{
			timer.start();
			repaint();
			try 
			{                
				image = ImageIO.read(new File("E:/workspace/thirdsem/src/thirdsem/carImage.png"));
			} 

			catch (Exception ex) 
			{
				// handle exception...
				JFrame f = new JFrame();
				f.setLayout(new BorderLayout());
				JLabel l = new JLabel("Image Path Incorrect");
				f.add(l, BorderLayout.CENTER);
				f.setTitle("Error");
				f.setSize(200 , 100);
				f.setLocationRelativeTo(null); //Center the frame
				f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				f.setVisible(true);
			}
		}
		
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			g.drawRect(5, 5, getWidth() - 10, getHeight() - 15);
			
			if(minus > getWidth() - 10)
				minus = 50;
			g.drawImage(image, getWidth() - minus, 26, null);
		}
				
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			// TODO Auto-generated method stub
			minus += 1;
			repaint();
		}
	}
}