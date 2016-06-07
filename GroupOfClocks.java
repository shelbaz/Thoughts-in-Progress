package thirdsem;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GroupOfClocks extends JApplet
{
	ClockAnimation c1 = new ClockAnimation();
	ClockAnimation c2 = new ClockAnimation();
	ClockAnimation c3 = new ClockAnimation();
	JButton resumeAll = new JButton("Resume All");
	JButton suspendAll = new JButton("Suspend All");
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.add(new GroupOfClocks());
		frame.setTitle("Exercise18_34");
		frame.setSize(600 , 350);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public GroupOfClocks()
	{
		setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();

		panel1.setLayout(new GridLayout(1, 3));
		panel1.add(c1);
		panel1.add(c2);
		panel1.add(c3);
		add(panel1, BorderLayout.CENTER);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(resumeAll);
		panel2.add(suspendAll);
		add(panel2, BorderLayout.SOUTH);
		
		resumeAll.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				// TODO Auto-generated method stub
				c1.resume.doClick();
				c2.resume.doClick();
				c3.resume.doClick();
			}
			
		});
		suspendAll.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				c1.suspend.doClick();
				c2.suspend.doClick();
				c3.suspend.doClick();
			}
			
		});
	}
}