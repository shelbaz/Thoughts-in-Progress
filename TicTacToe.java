package thirdsem;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class TicTacToe extends JFrame{
	
	Cellos UL = new Cellos();
	Cellos UC = new Cellos();
	Cellos UR = new Cellos();
	Cellos ML = new Cellos();
	Cellos MC = new Cellos();
	Cellos MR = new Cellos();
	Cellos DL = new Cellos();
	Cellos DC = new Cellos();
	Cellos DR = new Cellos();
	
	JPanel panel = new JPanel();//panel containing the cells
	JLabel label = new JLabel("X's turn");//Label
	
	static TicTacToe frame = new TicTacToe();
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise18_24");
		frame.setSize(350 , 350);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public TicTacToe(){
		setLayout(new BorderLayout());
		JButton button = new JButton("New Game");
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				removeAll();
				UL = new Cellos();
				 UC = new Cellos();
				 UR = new Cellos();
				 ML = new Cellos();
				 MC = new Cellos();
				 MR = new Cellos();
				 DL = new Cellos();
				 DC = new Cellos();
				 DR = new Cellos();
				
				panel = new JPanel();//panel containing the cells
				label = new JLabel("X's turn");//Label
				panel.setLayout(new GridLayout(3, 3));
				panel.add(UL);
				panel.add(UC);
				panel.add(UR);
				panel.add(ML);
				panel.add(MC);
				panel.add(MR);
				panel.add(DL);
				panel.add(DC);
				panel.add(DR);
				add(panel, BorderLayout.CENTER);
				add(label, BorderLayout.SOUTH);
				repaint();
			}
			
		});
		add(button, BorderLayout.NORTH);
		
		UL.addMouseListener(new Mouse());
		UC.addMouseListener(new Mouse());
		UR.addMouseListener(new Mouse());
		ML.addMouseListener(new Mouse());
		MC.addMouseListener(new Mouse());
		MR.addMouseListener(new Mouse());
		DL.addMouseListener(new Mouse());
		DC.addMouseListener(new Mouse());
		DR.addMouseListener(new Mouse());
		
		panel.setLayout(new GridLayout(3, 3));
		panel.add(UL);
		panel.add(UC);
		panel.add(UR);
		panel.add(ML);
		panel.add(MC);
		panel.add(MR);
		panel.add(DL);
		panel.add(DC);
		panel.add(DR);
		add(panel, BorderLayout.CENTER);
		
		
		add(label, BorderLayout.SOUTH);
	}
		
	
	public class Mouse implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == UL && UL.getToken() == ' '){
				UL.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(e.getSource() == UC && UC.getToken() == ' '){
				UC.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(e.getSource() == UR && UR.getToken() == ' '){
				UR.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(e.getSource() == ML && ML.getToken() == ' '){
				ML.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(e.getSource() == MC && MC.getToken() == ' '){
				MC.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(e.getSource() == MR && MR.getToken() == ' '){
				MR.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(e.getSource() == DL && DL.getToken() == ' '){
				DL.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(e.getSource() == DC && DC.getToken() == ' '){
				DC.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(e.getSource() == DR && DR.getToken() == ' '){
				DR.setToken('X');
				repaint();
				for( ; ; ){
					int o = (int)(Math.random()*9);
					int found = 0;
					switch (o){
				
					case 0: if(UL.getToken() == ' '){
						UL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 1: if(UC.getToken() == ' '){
						UC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 2: if(UR.getToken() == ' '){
						UR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 3: if(ML.getToken() == ' '){
						ML.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 4: if(MC.getToken() == ' '){
						MC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 5: if(MR.getToken() == ' '){
						MR.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 6: if(DL.getToken() == ' '){
						DL.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					
					case 7: if(DC.getToken() == ' '){
						DC.setToken('O');
						found = 1;
						break;
					}
					else break;
					
					case 8: if(DR.getToken() == ' '){
						DR.setToken('O');
						found = 1;
						break;
					}
					else break;
					}
					if(found == 1)
						break;
				}
				repaint();
			}
			if(UL.getToken() == 'O' && UC.getToken() == 'O' && UR.getToken() == 'O'){
				label.setText("You lost!");
				repaint();	
			}
			if(ML.getToken() == 'O' && MC.getToken() == 'O' && MR.getToken() == 'O'){
				label.setText("You lost!");
				repaint();
			}
			if(DL.getToken() == 'O' && DC.getToken() == 'O' && DR.getToken() == 'O'){
				label.setText("You lost!");
				repaint();
			}
			if(UL.getToken() == 'O' && ML.getToken() == 'O' && DL.getToken() == 'O'){
				label.setText("You lost!");
				repaint();
			}
			if(UC.getToken() == 'O' && MC.getToken() == 'O' && DC.getToken() == 'O'){
				label.setText("You lost!");
				repaint();
			}
			if(UR.getToken() == 'O' && MR.getToken() == 'O' && DR.getToken() == 'O'){
				label.setText("You lost!");
				repaint();
			}
			if(UL.getToken() == 'O' && MC.getToken() == 'O' && DR.getToken() == 'O'){
				label.setText("You lost!");
				repaint();
			}
			if(DL.getToken() == 'O' && MC.getToken() == 'O' && UR.getToken() == 'O'){
				label.setText("You lost!");
				repaint();
			}
			if(UL.getToken() == 'X' && UC.getToken() == 'X' && UR.getToken() == 'X'){
				label.setText("You win!");
				repaint();	
			}
			if(ML.getToken() == 'X' && MC.getToken() == 'X' && MR.getToken() == 'X'){
				label.setText("You win!");
				repaint();
			}
			if(DL.getToken() == 'X' && DC.getToken() == 'X' && DR.getToken() == 'X'){
				label.setText("You win!");
				repaint();
			}
			if(UL.getToken() == 'X' && ML.getToken() == 'X' && DL.getToken() == 'X'){
				label.setText("You win!");
				repaint();
			}
			if(UC.getToken() == 'X' && MC.getToken() == 'X' && DC.getToken() == 'X'){
				label.setText("You win!");
				repaint();
			}
			if(UR.getToken() == 'X' && MR.getToken() == 'X' && DR.getToken() == 'X'){
				label.setText("You win!");
				repaint();
			}
			if(UL.getToken() == 'X' && MC.getToken() == 'X' && DR.getToken() == 'X'){
				label.setText("You win!");
				repaint();
			}
			if(DL.getToken() == 'X' && MC.getToken() == 'X' && UR.getToken() == 'X'){
				label.setText("You win!");
				repaint();
			}
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}