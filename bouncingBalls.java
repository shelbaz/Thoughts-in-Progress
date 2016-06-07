package thirdsem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class bouncingBalls extends JFrame
{
	static bouncingBalls frame = new bouncingBalls();
	private Ball ball = new Ball();
	private JButton jbtSuspend = new JButton("Suspend");
	private JButton jbtResume = new JButton("Resume");
	private JScrollBar jsbDelay = new JScrollBar();
	private JButton jbtPlus = new JButton("+1");
	private JButton jbtMinus = new JButton("-1");
	Component ballArray[] = new Component[1000];
	int ballcount = 0;

	public bouncingBalls() {
		// Group buttons in a panel
		ballArray[ballcount] = ball;
		ballcount += 1;
		JPanel panel = new JPanel();
		panel.add(jbtSuspend);
		panel.add(jbtResume);
		panel.add(jbtPlus);
		panel.add(jbtMinus);

		// Add ball and buttons to the panel
		ball.setBorder(new javax.swing.border.LineBorder(Color.BLACK));
		jsbDelay.setOrientation(JScrollBar.HORIZONTAL);
		ball.setDelay(jsbDelay.getMaximum());
		setLayout(new BorderLayout());
		add(jsbDelay, BorderLayout.NORTH);
		add(ballArray[0]);
		add(panel, BorderLayout.SOUTH);
		
		// Register listeners
		jbtSuspend.addActionListener(new ActionListener() 
		{ 
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				for(int i = 0; i < ballcount; i++)
					((Ball) ballArray[i]).suspend();
			}
		});
		
		jbtResume.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				ball.resume();
			}
		});
		
		jbtPlus.addActionListener(new ActionListener() 
		{ 
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				ballArray[ballcount] = new Ball();
				add(ballArray[ballcount], BorderLayout.CENTER);
				ballcount += 1;
				frame.setSize(751 , 351);
				frame.setSize(750 , 351);
				for(int i = 0; i < ballcount; i++)
					((Ball) ballArray[i]).suspend();
				ball.resume();
			}
		});
		
		jbtMinus.addActionListener(new ActionListener() 
		{ 
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if (ballcount > 1)
				{
					remove(ballArray[ballcount - 1]);
					ballcount -= 1;
					frame.setSize(751 , 351);
					frame.setSize(750 , 351);
					for(int i = 0; i < ballcount; i++)
						((Ball) ballArray[i]).suspend();
					ball.resume();
				}
			}
		});
		
		jsbDelay.addAdjustmentListener(new AdjustmentListener() 
		{
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) 
			{
				ball.setDelay(jsbDelay.getMaximum() - e.getValue());
			}
		});
	}
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_19");
		frame.setSize(750 , 351);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
