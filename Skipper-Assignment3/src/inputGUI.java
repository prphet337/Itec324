/*[Multithreading Project] Write a program WordCount that counts the number of 
**words in input files.
**Your program must be able to receive a list of filenames through a GUI input window. 
**For each input file, you must create and start one thread to:
**count the number of words in the file; 
**display a GUI output window designated for the one input file; and
**display the result (i.e., the number of words) as well as the contents 
**of the entire input file in the GUI output window. 
**Note: Depending on the number of input files, you need to display the 
**same number of GUI output windows.
*/
import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class inputGUI extends JFrame 
{
	outputGUI output = new outputGUI();
	private JTextField textField;
	String line;
	BufferedReader read;
	int wordCount;
	int count;
	String Chars;
	JFrame frame;
	
	public inputGUI() 
	{
		
		getContentPane().setLayout(null);
		
		JLabel lbltxtFileTo = new JLabel(".txt file to count");
		lbltxtFileTo.setBounds(65, 6, 109, 16);
		getContentPane().add(lbltxtFileTo);
		
		textField = new JTextField();
		textField.setBounds(48, 34, 134, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Scanner scan;
				try
				{
					scan = new Scanner(new File(textField.getText()));
				
				} 
				catch (FileNotFoundException e) {
					JOptionPane.showMessageDialog(null, "document not found", "error", JOptionPane.ERROR_MESSAGE);
					System.exit(0);
					return;
				}
				ArrayList<String> list = new ArrayList<String>();
				while(scan.hasNext())
				{
					Chars = scan.next();
					list.add(Chars);
					//Chars  = scan.next();
					//count++;
				}
				
				//scan.close();
				//scan = new Scanner(textField.getText());
				
				//ArrayList<String> list = new ArrayList<String>();
				
				/*for(int i = 0; i < chars.length; i++)
				{
					if(scan.hasNext())
					{
						System.out.println(chars[i]);
						Chars = scan.next();
						chars[i] = Chars;
						System.out.println(chars[i]);
					}
				}
				for(int x = 0; x < chars.length; x++)
				{
					System.out.print(chars[x]);
				}*/
	
					wordCount = list.size();
					String count = Integer.toString(wordCount);
					
					
					output.setVisible(true);
					output.lblWordCountValue.setText(count);
					for(int i = 0; i < list.size(); i++)
					{
		                  output.textArea.append((String)list.get(i));
		            }
					//output.textField.setText(list);
			}
		});
		
		btnCount.setBounds(57, 66, 117, 29);
		getContentPane().add(btnCount);
	}
}
