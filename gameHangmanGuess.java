package thirdsem;

import javax.swing.*;
import javax.swing.Timer;

import thirdsem.gameHangman.timeListener;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class gameHangmanGuess extends JFrame implements ActionListener
{
	static String PATH = "E:/progs/Rwords.txt";
	static int once = 0;
	static gameHangmanGuess frame = new gameHangmanGuess();
	JTextField jtfInputPath = new JTextField();
	static int parts = 0;
	static String word = newWord();
	static String[] reveals = new String[word.length()];
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise19_15");
		frame.setSize(400 , 500);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
								
		Scanner input = new Scanner(System.in);
		
		reveals = new String[word.length()];
		for(int i = 0; i < word.length(); i++)
			reveals[i] = "*";
		
		System.out.println("Word: " + word);
		for(int i = 0; i < reveals.length; i++)
			System.out.print(reveals[i]);
	}
	
	gameHangmanGuess()
	{
		hangman hangman = new hangman();
		add(hangman);
		jtfInputPath.addActionListener(this);
		add(jtfInputPath, BorderLayout.SOUTH);
	}
	
	
	static String newWord()
	{
		if(once == 0)
		{
			System.out.println("ENTER PATH OR 'n' FOR DEFAULT ");
			Scanner input1 = new Scanner(System.in);
			String temp = input1.nextLine();
			
			if(temp.compareTo("n") != 0)
				PATH = temp;
				
			
			once = 2;
		}
		
		String[] wordList = new String[126];
		String stringList = "";
		
		try 
		{
			Scanner file = new Scanner(new FileReader(new File(PATH)));
			
			while(file.hasNext())
				stringList += file.next() + " ";
			
			wordList = stringList.split(" ");
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String newWord = wordList[(int) (Math.random() * 1000 % 126)];

		return newWord;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		try
		{
			String entered = jtfInputPath.getText();
			
			if(word.indexOf(entered) == -1 && entered.length() <= 1)
			{
				// TODO Auto-generated catch block
				hangman.refresh();
				if(parts < 3)
				{
					JFrame pathError = new JFrame();
					pathError.setTitle("NOPE");
					pathError.setSize(250 , 100);
					pathError.setLocationRelativeTo(null); //Center the frame
					pathError.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					pathError.setVisible(true);
					pathError.setResizable(false);
					JLabel pathErrorMessage = new JLabel("    CHARACTER '" + entered + "' IS NOT IN THE WORD");
					pathError.setLayout(new BorderLayout());
					pathError.add(pathErrorMessage, BorderLayout.CENTER);
				}
			}
			
			else if (entered.length() <= 1)
			{
				int enteredOccurence = 0;
				
				//reveals[word.indexOf(entered)] = entered;
				//int temp = word.indexOf(entered);
				for(int i = 0; i < reveals.length; i++)
					if(word.indexOf(entered, i) != -1)
					{
						reveals[word.indexOf(entered, i)] = entered;
						i = word.indexOf(entered, i);
					}
				
				
				
				System.out.println();
				
				for(int i = 0; i < reveals.length; i++)
					System.out.print(reveals[i]);
			}
			
			if (entered.length() <= 1 && checkWin())
			{
				parts--;
				hangman.refresh();
				
				JFrame pathErrors = new JFrame();
				pathErrors.setTitle("NOPE");
				pathErrors.setSize(250 , 100);
				pathErrors.setLocationRelativeTo(null); //Center the frame
				pathErrors.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				pathErrors.setVisible(true);
				pathErrors.setResizable(false);
				JLabel pathErrorMessages = new JLabel("    CHARACTER '" + entered + "' IS NOT IN THE WORD");
				pathErrors.setLayout(new BorderLayout());
				pathErrors.add(pathErrorMessages, BorderLayout.CENTER);
				
				System.out.println("\nTHE WORD WAS: " + word);
				
				final JFrame pathError = new JFrame();
				pathError.setTitle("MEH");
				pathError.setSize(250 , 100);
				pathError.setLocationRelativeTo(null); //Center the frame
				pathError.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				pathError.setVisible(true);
				pathError.setResizable(false);
				JLabel pathErrorMessage = new JLabel("               WANNA RESTART?");
				pathError.setLayout(new BorderLayout());
				JPanel panel = new JPanel();
				JButton yRestart = new JButton("YES");
				JButton nRestart = new JButton("NO");
				panel.add(yRestart);
				panel.add(nRestart);
				pathError.add(panel, BorderLayout.SOUTH);
				pathError.add(pathErrorMessage, BorderLayout.CENTER);
				
				yRestart.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						hangman.restart();
						pathError.dispose();
					}
				});
				
				nRestart.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						System.exit(0);
					}
				});
			}
		}
		
		catch(Exception ex)
		{
			JFrame pathError = new JFrame();
			pathError.setTitle("ERROR");
			pathError.setSize(250 , 100);
			pathError.setLocationRelativeTo(null); //Center the frame
			pathError.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			pathError.setVisible(true);
			pathError.setResizable(false);
			JLabel pathErrorMessage = new JLabel("               ENTER SOMETHING!");
			pathError.setLayout(new BorderLayout());
			pathError.add(pathErrorMessage, BorderLayout.CENTER);
		}
	}
	
	boolean checkWin()
	{
		if(parts == 3)
		{
			repaint();
			return true;
		}
		
		for(int i = 0; i < reveals.length; i++)
			if(reveals[i].compareTo("*") == 0)
				return false;
		
		return true;
	}
	
	static class hangman extends JPanel
	{
		double angle = 90;
		double angleh = 90;
		double inc = -1;
		double fix = -0.2;
		Timer t = new Timer(50, new timeListener());		
				
		class timeListener implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				repaint();
			}
		}
		
		static void restart()
		{
			parts = 0;
			word = newWord();
			System.out.println("\nNew Word: " + word);
			reveals = new String[word.length()];
			for(int i = 0; i < word.length(); i++)
				reveals[i] = "*";
			for(int i = 0; i < reveals.length; i++)
				System.out.print(reveals[i]);
		}
		
		static void refresh()
		{
			parts++;
		}
		
		protected void paintComponent(Graphics g)
		{
			t.start();
			super.paintComponent(g);
			int width = getWidth();
			int height = getHeight();
			angle += inc;
			angleh += inc;
						
			if (angle >= 100)
			{
				inc *= -1;
				fix *= -1;
			}
			
			if (angle <= 80)
			{
				inc *= -1;
				fix *= -1;
			}
			
			angleh += fix;
			
			if (parts >=  1)
			{
				//rope
				double[] ropetop = point((0.7 * width), (0.1 * height), (0.7 * width), (0.1 * height), angle, true);
				double[] ropebot = point((0.7 * width), (0.1 * height), (0.7 * width), (0.175 * height), angle, true);
				g.drawLine((int) ropetop[0] , (int) ropetop[1] , (int) ropebot[0], (int) ropebot[1]);
				
				//head
				double[] head = point((0.7 * width), (0.1 * height), (0.625 * width), (0.175 * height), angleh, false);
				g.drawOval((int) head[0] - 29, (int) head[1] - 13, (int) (0.15 * width) , (int) (0.15 * height));
			}
			
			if (parts >= 2)
			{
				//torso
				double[] torsotop = point((0.7 * width), (0.2 * height), (0.7 * width), (0.325 * height), angle, false);
				double[] torsobot = point((0.7 * width), (0.2 * height), (0.7 * width), (0.5 * height), angle, false);
				g.drawLine((int) torsotop[0] , (int) torsotop[1] , (int) torsobot[0] , (int) torsobot[1]);
			}
			
			if (parts >= 3)
			{
				//right leg
				double[] rltop = point((0.7 * width), (0.2 * height), (0.55 * width), (0.6 * height), angle - 15, false);
				double[] rlbot = point((0.7 * width), (0.2 * height), (0.7 * width), (0.5 * height), angle, false);
				g.drawLine((int) rltop[0] , (int) rltop[1] , (int) rlbot[0] , (int) rlbot[1]);
				
				//left leg
				double[] lltop = point((0.7 * width), (0.2 * height), (0.85 * width), (0.6 * height), angle + 15, false);
				double[] llbot = point((0.7 * width), (0.2 * height), (0.7 * width), (0.5 * height), angle, false);
				g.drawLine((int) lltop[0] , (int) lltop[1] , (int) llbot[0] , (int) llbot[1]);
				
				//right hand
				double[] rhtop = point((0.7 * width), (0.2 * height), (0.65 * width), (0.31 * height), angle, false);
				double[] rhbot = point((0.7 * width), (0.2 * height), (0.5 * width), (0.4 * height), angle - 25, false);
				g.drawLine((int) rhtop[0] , (int) rhtop[1] , (int) rhbot[0] , (int) rhbot[1]);
				
				//left hand
				double[] lhtop = point((0.7 * width), (0.2 * height), (0.75 * width), (0.31 * height), angle, false);
				double[] lhbot = point((0.7 * width), (0.2 * height), (0.9 * width), (0.4 * height), angle + 25, false);
				g.drawLine((int) lhtop[0] , (int) lhtop[1] , (int) lhbot[0] , (int) lhbot[1]);
			}
					
			//hanger top
			g.drawLine((int) (0.24 * width) , (int) (0.1 * height) , (int) (0.7 * width) , (int) (0.1 * height));
			
			//hanger mid
			g.drawLine((int) (0.24 * width) , (int) (0.65 * height) , (int) (0.24 * width) , (int) (0.1 * height));
			
			// hanger base
			g.drawArc((int) (0.05 * width) , (int) (0.65 * height) , (int) (0.38 * width) , (int) (0.25 * height) , 30 , 120);
		}
	}
	 
	
	public static double[] point(double cx, double cy, double x, double y, double angle, boolean fix)
	{
		if (!fix)
			return new double[] {cx + Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2)) * Math.cos(angle/360*2*Math.PI), cy + Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2)) * Math.sin(angle/360*2*Math.PI)};
		
		else
			return new double[] {cx + (Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2))-4) * Math.cos(angle/360*2*Math.PI), cy + (Math.sqrt(Math.pow((x-cx), 2) + Math.pow((y-cy), 2))-4) * Math.sin(angle/360*2*Math.PI)};
 	}
}