package theFinal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Final extends JFrame
{
	public static JPanel panel_1 = new JPanel();
	public static JPanel panel_2 = new JPanel();
	public static JPanel panel_3 = new JPanel();
	public static JPanel panel_4 = new JPanel();
	public static JPanel panel_5 = new JPanel();
	
	public static JComboBox box = new JComboBox();
	
	public static JTextField textField = new JTextField();
	
	public static JRadioButton radio = new JRadioButton("800 m");
	public static JRadioButton radio2 = new JRadioButton("1 mile");
	public static JRadioButton radio3 = new JRadioButton("2 miles");
	public static JRadioButton radio4 = new JRadioButton("3 miles");
	public static ButtonGroup group = new ButtonGroup();
	
	public static JCheckBox checkBox = new JCheckBox("50 miles");
	public static JCheckBox checkBox2 = new JCheckBox("100 miles");
	public static JCheckBox checkBox3 = new JCheckBox("200 miles");
	public static JCheckBox checkBox4 = new JCheckBox("300 miles");
	public static JCheckBox checkBox5 = new JCheckBox("400 miles");
	public static JCheckBox checkBox6 = new JCheckBox("500 miles");
	public static JCheckBox checkBox7 = new JCheckBox("600 miles");
	public static JCheckBox checkBox8 = new JCheckBox("700 miles");
	
	public static JScrollPane scroll = new JScrollPane();
	public static JList List = new JList();
	
	public static JButton button = new JButton("Next");
	public static JButton button2 = new JButton("Back");
	public static JButton button3 = new JButton("Next");
	public static JButton button4 = new JButton("Back");
	public static JButton button5 = new JButton("Next");
	public static JButton button6 = new JButton("Back");
	public static JButton button7 = new JButton("Next");
	public static JButton button8 = new JButton("Back");
	public static JButton button9 = new JButton("finalize");
	
	public static JLabel label = new JLabel("How far are you running?");
	public static JLabel label2 = new JLabel("How far did you run in the off-season");
	public static JLabel label3 = new JLabel("What season are you running in?");
	public static JLabel label4 = new JLabel("What kind of land are you running on?");
	public static JLabel label5 = new JLabel("What is your name?");
	public static JLabel label6 = new JLabel("Add Item");

	public static Font myFont = new Font("Arial", Font.BOLD, 20);
	
	public static void main(String args [])
	{
		new Final();
	}

	public Final()
	{
		setTitle("Final");
		setSize(1200,1200);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new GridBagLayout());
		
		GridBagConstraints myGrid = new GridBagConstraints();
		
		//first panel
		
		myGrid = new GridBagConstraints();
		getContentPane().setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		myGrid.insets = new Insets (10,10,10,10);
		getContentPane().add(panel_1, myGrid);
		panel_1.setVisible(true);
		
		myGrid = new GridBagConstraints();
		panel_1.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		label.setFont(myFont);
		label.setForeground(Color.BLACK);
		panel_1.add(label, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_1.setLayout(new GridBagLayout());
		myGrid.gridx = 2;
		myGrid.gridy = 0;
		button.setFont(myFont);
		button.setForeground(Color.BLACK);
		panel_1.add(button, myGrid);
		
		myGrid.gridx = 2;
		myGrid.gridy = 0;
		button2.setFont(myFont);
		button2.setForeground(Color.BLACK);
		panel_1.add(button2, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_1.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 1;
		radio.setFont(myFont);
		radio.setForeground(Color.BLACK);
		panel_1.add(radio, myGrid);
		
		myGrid.gridx = 0;
		myGrid.gridy = 2;
		radio2.setFont(myFont);
		radio2.setForeground(Color.BLACK);
		panel_1.add(radio2, myGrid);
		
		myGrid.gridx = 0;
		myGrid.gridy = 3;
		radio3.setFont(myFont);
		radio3.setForeground(Color.BLACK);
		panel_1.add(radio3, myGrid);
		
		myGrid.gridx = 0;
		myGrid.gridy = 4;
		radio4.setFont(myFont);
		radio4.setForeground(Color.BLACK);
		panel_1.add(radio4, myGrid);
		
		group.add(radio);
		group.add(radio2);
		group.add(radio3);
		group.add(radio4);
		
		//next panel
		
		myGrid = new GridBagConstraints();
		getContentPane().setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		myGrid.insets = new Insets (10,10,10,10);
		getContentPane().add(panel_2, myGrid);
		panel_2.setVisible(false);
		
		myGrid = new GridBagConstraints();
		panel_2.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		label2.setFont(myFont);
		label2.setForeground(Color.BLACK);
		panel_2.add(label2, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_2.setLayout(new GridBagLayout());
		myGrid.gridx = 1;
		myGrid.gridy = 0;
		button3.setFont(myFont);
		button3.setForeground(Color.BLACK);
		panel_2.add(button3, myGrid);
		
		myGrid.gridx = 2;
		myGrid.gridy = 0;
		button4.setFont(myFont);
		button4.setForeground(Color.BLACK);
		panel_2.add(button4, myGrid);
				
		myGrid = new GridBagConstraints();
		panel_2.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 1;
		checkBox.setFont(myFont);
		checkBox.setForeground(Color.BLACK);
		panel_2.add(checkBox, myGrid);
		
		myGrid.gridx = 0;
		myGrid.gridy = 2;
		checkBox2.setFont(myFont);
		checkBox2.setForeground(Color.BLACK);
		panel_2.add(checkBox2, myGrid);

		myGrid.gridx = 0;
		myGrid.gridy = 3;
		checkBox3.setFont(myFont);
		checkBox3.setForeground(Color.BLACK);
		panel_2.add(checkBox3, myGrid);

		myGrid.gridx = 0;
		myGrid.gridy = 4;
		checkBox4.setFont(myFont);
		checkBox4.setForeground(Color.BLACK);
		panel_2.add(checkBox4, myGrid);
		
		myGrid.gridx = 1;
		myGrid.gridy = 1;
		checkBox5.setFont(myFont);
		checkBox5.setForeground(Color.BLACK);
		panel_2.add(checkBox5, myGrid);		
		
		myGrid.gridx = 1;
		myGrid.gridy = 2;
		checkBox6.setFont(myFont);
		checkBox6.setForeground(Color.BLACK);
		panel_2.add(checkBox6, myGrid);		
		
		myGrid.gridx = 1;
		myGrid.gridy = 3;
		checkBox7.setFont(myFont);
		checkBox7.setForeground(Color.BLACK);
		panel_2.add(checkBox7, myGrid);		
		
		myGrid.gridx = 1;
		myGrid.gridy = 4;
		checkBox8.setFont(myFont);
		checkBox8.setForeground(Color.BLACK);
		panel_2.add(checkBox8, myGrid);
		
		//next panel
		myGrid = new GridBagConstraints();
		getContentPane().setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		myGrid.insets = new Insets (10,10,10,10);
		getContentPane().add(panel_3, myGrid);
		panel_3.setVisible(false);
		
		myGrid = new GridBagConstraints();
		panel_3.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		label3.setFont(myFont);
		label3.setForeground(Color.BLACK);
		panel_3.add(label3, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_3.setLayout(new GridBagLayout());
		myGrid.gridx = 1;
		myGrid.gridy = 0;
		button5.setFont(myFont);
		button5.setForeground(Color.BLACK);
		panel_3.add(button5, myGrid);
		
		myGrid.gridx = 2;
		myGrid.gridy = 0;
		button6.setFont(myFont);
		button6.setForeground(Color.BLACK);
		panel_3.add(button6, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_3.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 1;
		box.setFont(myFont);
		box.setForeground(Color.BLACK);
		panel_3.add(box, myGrid);
		
		box.addItem("Winter");
		box.addItem("Spring");
		box.addItem("Summer");
		box.addItem("Fall");
		
		//next panel
		myGrid = new GridBagConstraints();
		getContentPane().setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		myGrid.insets = new Insets (10,10,10,10);
		getContentPane().add(panel_4, myGrid);
		panel_4.setVisible(false);
		
		myGrid = new GridBagConstraints();
		panel_4.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		label4.setFont(myFont);
		label4.setForeground(Color.BLACK);
		panel_4.add(label4, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_4.setLayout(new GridBagLayout());
		myGrid.gridx = 1;
		myGrid.gridy = 0;
		button7.setFont(myFont);
		button7.setForeground(Color.BLACK);
		panel_4.add(button7, myGrid);
		
		myGrid.gridx = 2;
		myGrid.gridy = 0;
		button8.setFont(myFont);
		button8.setForeground(Color.BLACK);
		panel_4.add(button8, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_4.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 1;
		scroll.setFont(myFont);
		scroll.setSize(30, 30);
		scroll.setForeground(Color.BLACK);
		panel_4.add(scroll, myGrid);
		scroll.add(List);
		DefaultListModel land = new DefaultListModel();
		land.addElement("Grass");
		land.addElement("Gravel");
		land.addElement("Pavement");
		land.addElement("Rubber Track");
		land.addElement("Sand");
		scroll.setViewportView(List);
		List.setModel(land);
		
		//next panel
		
		myGrid = new GridBagConstraints();
		getContentPane().setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		myGrid.insets = new Insets (10,10,10,10);
		getContentPane().add(panel_5, myGrid);
		panel_5.setVisible(false);
		
		myGrid = new GridBagConstraints();
		panel_5.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 0;
		label3.setFont(myFont);
		label3.setForeground(Color.BLACK);
		panel_5.add(label5, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_5.setLayout(new GridBagLayout());
		myGrid.gridx = 1;
		myGrid.gridy = 0;
		button9.setFont(myFont);
		button9.setForeground(Color.BLACK);
		panel_5.add(button9, myGrid);
		
		myGrid = new GridBagConstraints();
		panel_5.setLayout(new GridBagLayout());
		myGrid.gridx = 0;
		myGrid.gridy = 1;
		textField.setFont(myFont);
		textField.setForeground(Color.BLACK);
		textField.setColumns(5);
		panel_5.add(textField, myGrid);	
		
		button.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed(e); 
		  }});
		button2.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed2(e); 
		  }});
		button3.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed3(e); 
		  }});
		button4.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed4(e); 
		  }});
		button5.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed5(e); 
		  }});
		button6.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed6(e); 
		  }});
		button7.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed7(e); 
		  }});
		button8.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed8(e); 
		  }});
		button9.addActionListener(new ActionListener()  
		{ 
		  public void actionPerformed(ActionEvent e)  
		  { 
		    buttonActionPerformed9(e); 
		  }});
	}
	
	public void buttonActionPerformed(ActionEvent e)
	{
		panel_1.setVisible(false);
		panel_2.setVisible(true);
	}
	
	public void buttonActionPerformed2(ActionEvent e)
	{
		panel_1.setVisible(true);
		panel_2.setVisible(false);
	}
	
	public void buttonActionPerformed3(ActionEvent e)
	{
		panel_2.setVisible(false);
		panel_3.setVisible(true);
	}
	
	public void buttonActionPerformed4(ActionEvent e)
	{
		panel_2.setVisible(true);
		panel_3.setVisible(false);
	}
	
	public void buttonActionPerformed5(ActionEvent e)
	{
		panel_3.setVisible(false);
		panel_4.setVisible(true);
	}
	
	public void buttonActionPerformed6(ActionEvent e)
	{
		panel_3.setVisible(true);
		panel_4.setVisible(false);
	}
	
	public void buttonActionPerformed7(ActionEvent e)
	{
		panel_4.setVisible(false);
		panel_5.setVisible(true);
	}
	
	public void buttonActionPerformed8(ActionEvent e)
	{
		panel_4.setVisible(true);
		panel_5.setVisible(false);
	}
	
	public void buttonActionPerformed9(ActionEvent e)
	{
		panel_5.setVisible(false);
		
		String message = "No matter what, you are slow...sorry";
		
		String title = "Your time based on certain factors";
		
		JOptionPane.showConfirmDialog(null, message, title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
	}
	
}
