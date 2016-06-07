package thirdsem;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class decryptFiles extends JFrame implements ActionListener
{
	static decryptFiles frame = new decryptFiles();
	JTextField jtfInputPath = new JTextField();
	JTextField jtfOutputPath = new JTextField();
	
	public static void main(String[] args)
	{
		frame.setTitle("Exercise19_15");
		frame.setSize(500 , 125);
		frame.setLocationRelativeTo(null); //Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	decryptFiles()
	{
		JPanel j1 = new JPanel();
		j1.setLayout(new GridLayout(0,2));
		JLabel jlbInputPath = new JLabel("Enter path to input file:");
		j1.add(jlbInputPath);
		j1.add(jtfInputPath);
		
		JPanel j2 = new JPanel();
		j2.setLayout(new GridLayout(0,2));
		JLabel jlbOutputPath = new JLabel("Enter path to output file:");
		j2.add(jlbOutputPath);
		j2.add(jtfOutputPath);
		
		JPanel j3 = new JPanel();
		j3.setLayout(new GridLayout(2,0));
		JButton jbtDecrypt = new JButton("Decrypt");
		jbtDecrypt.addActionListener(this);
		setLayout(new BorderLayout());
		j3.add(j1);
		j3.add(j2);
		
		add(j3, BorderLayout.CENTER);
		add(jbtDecrypt, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		String inputPath = jtfInputPath.getText();
		String outputPath = jtfOutputPath.getText();
		
		try 
		{
			DataInputStream input = new DataInputStream(new FileInputStream(inputPath));
			DataOutputStream output = new DataOutputStream(new FileOutputStream(outputPath));
						
			while(true)
			{
				output.writeByte(input.readByte() - 5);
			}
		} 
		
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			JFrame pathError = new JFrame();
			pathError.setTitle("PATH ERROR");
			pathError.setSize(250 , 100);
			pathError.setLocationRelativeTo(null); //Center the frame
			pathError.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			pathError.setVisible(true);
			pathError.setResizable(false);
			JLabel pathErrorMessage = new JLabel("               ERROR: Path To File Not Found");
			pathError.setLayout(new BorderLayout());
			pathError.add(pathErrorMessage, BorderLayout.CENTER);
		}
		
		catch (EOFException ex)
		{
			JFrame readError = new JFrame();
			readError.setTitle("MESSAGE");
			readError.setSize(250 , 100);
			readError.setLocationRelativeTo(null); //Center the frame
			readError.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			readError.setVisible(true);
			readError.setResizable(false);
			JLabel readErrorMessage = new JLabel("         All Data Were Read And Decrypted");
			readError.setLayout(new BorderLayout());
			readError.add(readErrorMessage, BorderLayout.CENTER);			
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}