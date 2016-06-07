package thirdsem;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

public class sortingAnimation extends JFrame
{
	static int[] array = new int[50];
	static sortingAnimation frame = new sortingAnimation();
	static JButton restart = new JButton("Restart / Speed UP");
	
	public static void main(String[] args)
	{
		frame.setVisible(true);
		frame.setSize(1000, 750);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		
		for(int i = 1; i <= 50; i++)
			array[i-1] = i;
		
		shuffleArray(array);
		
		final Runnable sSA = new selectionSortAnim(array);
		final Runnable iSA = new insertionSortAnim(array);
		final Runnable bSA = new bubbleSortAnim(array);
		
		final Thread t1 = new Thread(sSA);
		final Thread t2 = new Thread(iSA);
		final Thread t3 = new Thread(bSA);
		
		JPanel p1 = new JPanel(new GridLayout(3,1));
		JPanel p2 = new JPanel(new FlowLayout());
		p1.add((Component) sSA);
		p1.add((Component) iSA);
		p1.add((Component) bSA);
		
		frame.add(p1, BorderLayout.CENTER);
		p2.add(restart);
		frame.add(p2, BorderLayout.SOUTH);
		frame.setSize(1000, 751);
		frame.setSize(1000, 750);
		
		t1.start();
		t2.start();
		t3.start();
		
		restart.addMouseListener(new MouseListener()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				for(int i = 1; i <= 50; i++)
					array[i-1] = i;
				
				shuffleArray(array);
				
				((selectionSortAnim) sSA).suicide(array);
				((insertionSortAnim) iSA).suicide(array);
				((bubbleSortAnim) bSA).suicide(array);
				
				if(((selectionSortAnim) sSA).getDone())
				{
					Thread t1 = new Thread(sSA);
					t1.start();
				}
				
				if(((insertionSortAnim) iSA).getDone())
				{
					Thread t2 = new Thread(iSA);
					t2.start();
				}
				
				if(((bubbleSortAnim) bSA).getDone())
				{
					Thread t3 = new Thread(bSA);
					t3.start();
				}
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	public static void shuffleArray(int[] a) 
	{
		int n = a.length;
		Random random = new Random();
		random.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int change = i + random.nextInt(n - i);
			swap(a, i, change);
		}
	}

	private static void swap(int[] a, int i, int change) 
	{
		int helper = a[i];
		a[i] = a[change];
		a[change] = helper;
	}
}
