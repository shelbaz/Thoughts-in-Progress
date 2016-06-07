package thirdsem;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
 
public class ClockAnimation extends JPanel {
        private StillClock clock = new StillClock();
        
        JButton suspend = new JButton("Suspend");
        JButton resume = new JButton("Resume");
        Timer timer = new Timer(1000, new TimerListener());
        
        public ClockAnimation() {
        		
                timer.start();
        		setLayout(new BorderLayout());
        		add(clock, BorderLayout.CENTER);
        		JPanel panel = new JPanel();
        		panel.setLayout(new GridLayout(1, 2));
        		panel.add(suspend);
        		panel.add(resume);
        		
        		suspend.addActionListener(new TimerSuspended());
        		resume.addActionListener(new TimerResume());
        		
        		add(panel, BorderLayout.SOUTH);
                // Create a timer with delay 1000 ms
                
        }
        private class TimerSuspended implements ActionListener {
        	@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						timer.stop();
					}
        }
        
        private class TimerResume implements ActionListener {
        	@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						timer.start();
					}
        }
 
        private class TimerListener implements ActionListener {
                @Override /** Handle the action event */
                public void actionPerformed(ActionEvent e) {
                        // Set new time and repaint the clock to display current time
                        clock.setCurrentTime();
                        clock.repaint();
                }
        }
}