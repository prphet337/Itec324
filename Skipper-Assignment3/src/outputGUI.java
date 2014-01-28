import javax.swing.*;

import java.awt.*;

public class outputGUI extends JFrame
{
	//inputGUI input = new inputGUI();
	public JTextArea textArea;
	public JLabel lblWordCountValue;
	private JPanel panel;
	
	public outputGUI() 
	{
		getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(6, 6, 438, 225);
		getContentPane().add(textArea);
		textArea.setColumns(10);
		
		/*JButton btnClose = new JButton("Close");
		btnClose.setBounds(313, 243, 117, 29);
		getContentPane().add(btnClose);*/
		
		JLabel lblWordCount = new JLabel("Word Count:");
		lblWordCount.setBounds(16, 248, 94, 16);
		getContentPane().add(lblWordCount);
		
		lblWordCountValue = new JLabel("");
		lblWordCountValue.setBounds(105, 248, 78, 16);
		getContentPane().add(lblWordCountValue);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 450, 300);
		getContentPane().add(panel);
	}
	
	
}
