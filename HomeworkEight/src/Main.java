package HomeworkEight.src;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main
{
	private static JFrame Frame = new JFrame();
	private static JPanel Panel;
	
	private static JLabel ProjectTitle;
	
	private static JLabel SKU;
	private static JTextField SKUTF;
	
	private static JLabel Title;
	private static JTextField TitleTF;
	
	private static JLabel Price;
	private static JTextField PriceTF;
	
	private static JLabel Quantity;
	private static JTextField QuantityTF;
	
	private static JButton submit;
	

// Run Program
	public static void main(String[] args) 
	{
		
		Views view = new Views();
		view.Home();
		view.events();
		
	}
	
	//Build UI
	public static void BuildFrame() 
	{
		
		
	}

}
