package thirdsem;

import javax.swing.Timer;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.util.Random;

public class Ball extends JPanel {
	private int delay = 10;

	// Create a timer with the specified delay in milliseconds
	private Timer timer = new Timer(delay, new TimerListener());
	Random randomGenerator = new Random();
	private int x = randomGenerator.nextInt(700);
	private int y = randomGenerator.nextInt(325); // Current ball position
	private int radius = 5; // Ball radius
	private int dx = randomGenerator.nextInt(2); // Increment on ball's x-coordinate
	private int dy = randomGenerator.nextInt(2); // Increment on ball's y-coordinate
	int red = 0;
	int green = 0;
	int blue = 0;
	
	public Ball() {
		setOpaque(false);

		red = randomGenerator.nextInt(255);
		green = randomGenerator.nextInt(255);
		blue = randomGenerator.nextInt(255);
		
		if(dx == 0 || dy == 0)
		{
			for (; dx == 0 || dy == 0;)
			{
				dx = randomGenerator.nextInt(2);
				dy = randomGenerator.nextInt(2);
			}
			
			if((int) (Math.random() * 10 % 2) == 1)
				dx *= -1;
			if((int) (Math.random() * 10 % 2) == 1)
				dy *= -1;
		}
		
		timer.start();
	}

	private class TimerListener implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(red,green,blue));
		
		// Check boundaries
		if (x < 0 || x > getWidth())
			dx *= -1;
		if (y < 0 || y > getHeight())
			dy *= -1;

		// Adjust ball position
		x += dx;
		y += dy;
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}

	public void suspend() {
		timer.stop(); // Suspend timer
	}

	public void resume() {
		timer.start(); // Resume timer
	}

	public void setDelay(int delay) {
		this.delay = delay;
		timer.setDelay(delay);
	}
}