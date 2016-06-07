package thirdsem;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createCalculator extends JFrame implements ActionListener
{
	public static void main(String[] args)
	{
		createCalculator frame = new createCalculator();
		frame.setTitle("Exercise18_11");
		frame.setSize(375 , 200);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
	JTextField field = new JTextField();
	createCalculator()
	{
		setLayout(new BorderLayout());
		
		add(field, BorderLayout.NORTH);
		
		JPanel p1 = new JPanel();
		
		JButton back = new JButton("Back");
		back.setActionCommand("back");
		back.addActionListener(this);
		p1.add(back);
		
		JButton ce = new JButton("CE");
		ce.setActionCommand("ce");
		ce.addActionListener(this);
		p1.add(ce);
		
		JButton c = new JButton("C");
		c.setActionCommand("c");
		c.addActionListener(this);
		p1.add(c);
		
		add(p1);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4,6));
		
		JButton mc = new JButton("MC");
		mc.setActionCommand("mc");
		mc.addActionListener(this);
		p2.add(mc);
		
		JButton seven = new JButton("7");
		seven.setActionCommand("seven");
		seven.addActionListener(this);
		p2.add(seven);

		JButton eight = new JButton("8");
		eight.setActionCommand("eight");
		eight.addActionListener(this);
		p2.add(eight);
		
		JButton nine = new JButton("9");
		nine.setActionCommand("nine");
		nine.addActionListener(this);
		p2.add(nine);
		
		JButton div = new JButton("/");
		div.setActionCommand("div");
		div.addActionListener(this);
		p2.add(div);

		JButton sqrt = new JButton("sqrt");
		sqrt.setActionCommand("sqrt");
		sqrt.addActionListener(this);
		p2.add(sqrt);
		
		JButton mr = new JButton("MR");
		mr.setActionCommand("mr");
		mr.addActionListener(this);
		p2.add(mr);

		JButton four = new JButton("4");
		four.setActionCommand("four");
		four.addActionListener(this);
		p2.add(four);
		
		JButton five = new JButton("5");
		five.setActionCommand("five");
		five.addActionListener(this);
		p2.add(five);
		
		JButton six = new JButton("6");
		six.setActionCommand("six");
		six.addActionListener(this);
		p2.add(six);

		JButton mul = new JButton("*");
		mul.setActionCommand("mul");
		mul.addActionListener(this);
		p2.add(mul);

		JButton mod = new JButton("%");
		mod.setActionCommand("mod");
		mod.addActionListener(this);
		p2.add(mod);
		
		JButton ms = new JButton("MS");
		ms.setActionCommand("ms");
		ms.addActionListener(this);
		p2.add(ms);
		
		JButton one = new JButton("1");
		one.setActionCommand("one");
		one.addActionListener(this);
		p2.add(one);
		
		JButton two = new JButton("2");
		two.setActionCommand("two");
		two.addActionListener(this);
		p2.add(two);
		
		JButton three = new JButton("3");
		three.setActionCommand("three");
		three.addActionListener(this);
		p2.add(three);

		JButton sub = new JButton("-");
		sub.setActionCommand("sub");
		sub.addActionListener(this);
		p2.add(sub);
		
		JButton wat = new JButton("1/x");
		wat.setActionCommand("wat");
		wat.addActionListener(this);
		p2.add(wat);
		
		JButton mplus = new JButton("M+");
		mplus.setActionCommand("mplus");
		mplus.addActionListener(this);
		p2.add(mplus);
		
		JButton zero = new JButton("0");
		zero.setActionCommand("zero");
		zero.addActionListener(this);
		p2.add(zero);
		
		JButton pm = new JButton("+/-");
		pm.setActionCommand("pm");
		pm.addActionListener(this);
		p2.add(pm);
		
		JButton point = new JButton(".");
		point.setActionCommand("point");
		point.addActionListener(this);
		p2.add(point);
		
		JButton add = new JButton("+");
		add.setActionCommand("add");
		add.addActionListener(this);
		p2.add(add);
				
		JButton res = new JButton("=");
		res.setActionCommand("res");
		res.addActionListener(this);
		p2.add(res);
		
		add(p2, BorderLayout.SOUTH);		
	}
	
	String mem = null;
	String beforeop = null;
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		try
		{
			switch(e.getActionCommand())
			{
				case "c":
					beforeop = field.getText();
					field.setText("");
					break;
		
				case "zero":
					beforeop = field.getText();
					field.setText(field.getText() + "0");
					break;
				
				case "one":
					beforeop = field.getText();
					field.setText(field.getText() + "1");
					break;
				
				case "two":
					beforeop = field.getText();
					field.setText(field.getText() + "2");
					break;
				
				case "three":
					beforeop = field.getText();
					field.setText(field.getText() + "3");
					break;
				
				case "four":
					beforeop = field.getText();
					field.setText(field.getText() + "4");
					break;
				
				case "five":
					beforeop = field.getText();
					field.setText(field.getText() + "5");
					break;
				
				case "six":
					beforeop = field.getText();
					field.setText(field.getText() + "6");
					break;
				
				case "seven":
					beforeop = field.getText();
					field.setText(field.getText() + "7");
					break;
				
				case "eight":
					beforeop = field.getText();
					field.setText(field.getText() + "8");
					break;
				
				case "nine":
					beforeop = field.getText();
					field.setText(field.getText() + "9");
					break;
				
				case "point":
					beforeop = field.getText();
					field.setText(field.getText() + ".");
					break;
				
				case "pm":
					beforeop = field.getText();
					double num = Double.parseDouble(field.getText());
					num -= num * 2;
					field.setText(num + "");
					break;
				
				case "add":
					beforeop = field.getText();
					field.setText(field.getText() + "+");
					break;
				
				case "sub":
					beforeop = field.getText();
					field.setText(field.getText() + "-");
					break;
				
				case "mul":
					beforeop = field.getText();
					field.setText(field.getText() + "*");
					break;
				
				case "div":
					beforeop = field.getText();
					field.setText(field.getText() + "/");
					break;
				
				case "sqrt":
					beforeop = field.getText();
					field.setText(Math.sqrt(Double.parseDouble(calculate(field.getText()))) + "");
					break;
					
				case "mod":
					beforeop = field.getText();
					field.setText(field.getText() + "%");
					break;
					
				case "wat":
					beforeop = field.getText();
					field.setText(1 / Double.parseDouble(calculate(field.getText())) + "");
					break;
					
				case "res":
					beforeop = field.getText();
					field.setText(calculate(field.getText()) + "");
					break;
					
				case "mc":
					mem = null;
					break;
					
				case "ms":
					mem = calculate(field.getText());
					break;
					
				case "mr":
					if(mem == null)
						break;
					field.setText(field.getText() + mem);
					break;
					
				case "mplus":
					field.setText(calculate(field.getText() + "+" + mem));
					break;
					
				case "back":
					String b = field.getText();
					if (b.length() > 0) 
						b = b.substring(0, b.length()-1);
					field.setText(b);
					
				case "ce":
					field.setText(beforeop);
					break;
			}
		}
		
		catch (Exception Ex)
		{
			field.setText("Revise Equation: " + field.getText());
		}
	}
	
	String calculate(String s)
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		try 
		{
			return engine.eval(s) + "";
		}
		
		catch (ScriptException e) 
		{
			// TODO Auto-generated catch block
			return "Revise Equation: " + field.getText();
		}
	}
}