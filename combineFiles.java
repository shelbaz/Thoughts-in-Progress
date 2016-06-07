package thirdsem;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class combineFiles
{
	public static void main(String[] args)
	{
		System.out.print("Enter Command Line: ");
		Scanner input = new Scanner(System.in);
		String commandLine = input.nextLine();
		String[] splited = commandLine.split(" ");
		
		for(int i = 0; i < splited.length; i++)
			System.out.println(splited[i]);
		
		String[] toCombine = new String[splited.length - 3];
		String[] allData = new String[toCombine.length];
		
		
		try 
		{
			DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(splited[splited.length - 1]));
				
			for(int i = 0; i < toCombine.length; i++)
			{
				try 
				{
					DataInputStream dataInput = new DataInputStream(new FileInputStream(splited[i+2]));
	
					while(true)
					{
						dataOutput.writeByte(dataInput.readByte());
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
				
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					System.out.println("File " + (i+1) + " read.");
				}
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
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
