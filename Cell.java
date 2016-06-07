package thirdsem;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

class Cello extends JPanel
{
	boolean player = true;
	int cellNumber = 0;
	
	Cello(int newCellNumber)
	{
		cellNumber = newCellNumber;
	}
	
	boolean cellTaken = false;
	
	protected void paintComponent(Graphics g)
	{
		addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				// TODO Auto-generated method stub
				paintComponent(getGraphics(), player);
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
	
	protected void paintComponent(Graphics g, boolean t)
	{
		if(player)
		{
			g.drawLine(20,15,70,55);
			g.drawLine(70,15,20,55);
			cellTaken = true;
			gameTicTacToe.getMoved(cellNumber, "player");
		}
		
		else if(!player)
		{
			g.drawOval(20, 15, 50, 40);
			cellTaken = true;
			gameTicTacToe.getMoved(cellNumber, "computer");
		}
	}
	
	public void paintCell()
	{
		paintComponent(getGraphics(), true);
	}
	
	public void setPlayer(boolean player)
	{
		player = this.player;
	}
}