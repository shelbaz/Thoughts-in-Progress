import javax.swing.*;
import java.awt.*;

public class triangleClass extends JFrame
{
	int X1 = 135;
	int Y1 = 175;
	int X2 = 5;
	int Y2 = 10;
	int X3 = 285;
	int Y3 = 95;
	int[] x = {X1, X2, X3};
	int[] y = {Y1, Y2, Y3};
	boolean color = false;
	
	public triangleClass()
	{
		try 
		{
			String input1 = JOptionPane.showInputDialog ("Enter x1");
			this.X1 = Integer.parseInt(input1);
			String input2 = JOptionPane.showInputDialog ("Enter y1");
			this.Y1 = Integer.parseInt(input2);
			String input3 = JOptionPane.showInputDialog ("Enter x2");
			this.X2 = Integer.parseInt(input3);
			String input4 = JOptionPane.showInputDialog ("Enter y2");
			this.Y2 = Integer.parseInt(input4);
			String input5 = JOptionPane.showInputDialog ("Enter x3");
			this.X3 = Integer.parseInt(input5);
			String input6 = JOptionPane.showInputDialog ("Enter y3");
			this.Y3 = Integer.parseInt(input6);
			
			x[0] = X1;
			x[1] = X2;
			x[2] = X3;
			y[0] = Y1;
			y[1] = Y2;
			y[2] = Y3;
						
			String input7 = JOptionPane.showInputDialog ("Enter 0 for not filled, 1 for filled");
			if (Integer.parseInt(input7) == 1)
				this.color = true;
		}
		
		catch (Exception e)
		{
			
		}
		
		add(new newPanel());
	}
	
	public static void main(String[] args)
	{
		triangleClass frame = new triangleClass();
		frame.setTitle("Exercise15_2");
		frame.setSize(350 , 350);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static String getPerimeter(Integer x1, double y1, double x2, double y2, double x3, double y3) 
	{
		return (int) (pointsDistance(x1, y1, x2, y2) + pointsDistance(x2, y2, x3, y3) + pointsDistance(x1, y1, x3, y3)) + "";
	}
	
	public static double pointsDistance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow((x1 - x2) , 2) + Math.pow((y1 - y2) , 2));
	}
	
	public static String getArea(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		
		return (int) Math.abs((x1*(y3-y2) + x2*(y3-y1) + x3*(y2-y1)) / 2) + "";
	}
	
	class newPanel extends JPanel
	{
		protected void paintComponent(Graphics g)
		{
			if (color)
				g.fillPolygon(x , y , 3);
			else 
				g.drawPolygon(x , y , 3);
			g.drawString("Perimeter: " + getPerimeter(X1, Y1, X2, Y2, X3, Y3) , 225 , 275);
			g.drawString("Area: " + getArea(X1, Y1, X2, Y2, X3, Y3) , 225 , 300);
		}
	}
}