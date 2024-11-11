package HomeworkEight;

import java.awt.Dimension;

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
	

// Run Program
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BuildFrame();
	}
	
	//Build UI
	public static void BuildFrame() 
	{
		Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProjectTitle = new JLabel("Add Textbook", SwingConstants.CENTER);
		JLabel newLine = new JLabel("<html><br></html>");
		SKU = new JLabel("SKU: ");
		SKUTF = new JTextField(15);
		
		Title = new JLabel("Title: ");
		TitleTF = new JTextField(15);
		
		Price = new JLabel("Price: ");
		PriceTF = new JTextField(15);
		
		Quantity = new JLabel("Quantity");
		QuantityTF = new JTextField(15);
		
		Panel = new JPanel();
		Panel.setPreferredSize(new Dimension(360,400));
		Panel.add(ProjectTitle);
		Panel.add(newLine);
		Panel.add(SKU);
		Panel.add(newLine);
		Panel.add(SKUTF);
		Panel.add(Title);
		Panel.add(TitleTF);
		Panel.add(Price);
		Panel.add(PriceTF);
		Panel.add(Quantity);
		Panel.add(QuantityTF);
		
		Frame.add(Panel);
		Frame.pack();
		Frame.setVisible(true);
		
		
	}

}
