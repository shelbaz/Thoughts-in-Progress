package thirdsem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class groupFans extends JFrame implements ActionListener
{
	static groupFans frame = new groupFans();
	modedRunningFan f1 = new modedRunningFan();
	modedRunningFan f2 = new modedRunningFan();
	modedRunningFan f3 = new modedRunningFan();
	JButton allStart = new JButton("Start All");
	JButton allStop = new JButton("Stop All");
	JPanel p2 = new JPanel();
		
	groupFans()
	{
		setLayout(new GridLayout(1,3));
		add(f1);
		add(f2);
		add(f3);
		
		p2.add(allStart);
		p2.add(allStop);
		
		add(p2);
		
		allStart.addActionListener(this);
		allStart.setActionCommand("start");
		allStop.addActionListener(this);
		allStop.setActionCommand("stop");
	}

	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_12");
		frame.setSize(1450 , 300);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		switch(e.getActionCommand())
		{
			case "start":
				f1.t.start();
				f2.t.start();
				f3.t.start();
				break;
				
			case "stop":
				f1.t.stop();
				f2.t.stop();
				f3.t.stop();
				break;
		}
	}
}
