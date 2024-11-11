package HomeworkEight.src;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Views {
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
	
	private static JButton submitAddItem;
	private static JButton submitDeleteItem;
	private static JButton submitViewItem;
	private static JButton submitViewList;
	
	private static JButton addItem;
	private static JButton deleteItem;
	private static JButton ViewList;
	private static JTextArea FullList;
	
	
	public Views() {}

	
	// Home
	
	
	public void Home() 
	{
		
		Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProjectTitle = new JLabel("Home", SwingConstants.CENTER);
		addItem = new JButton("Add Item");
		deleteItem = new JButton("Delete Button");
		ViewList = new JButton("View List");
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(390,400));
		panel.add(ProjectTitle);
		panel.add(addItem);
		panel.add(deleteItem);
		panel.add(ViewList);
		Frame.add(panel);
		Frame.pack();
		Frame.setVisible(true);
		
	}
	
	//Add an item
	public static void AddItem() 
	{
		Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProjectTitle = new JLabel("Add Textbook", SwingConstants.CENTER);
		SKU = new JLabel("SKU: ");
		SKUTF = new JTextField(15);
		
		Title = new JLabel("Title: ");
		TitleTF = new JTextField(15);
		
		Price = new JLabel("Price: ");
		PriceTF = new JTextField(15);
		
		Quantity = new JLabel("Quantity");
		QuantityTF = new JTextField(15);
		
		submitAddItem = new JButton("Submit");
		
		Panel = new JPanel();
		Panel.setPreferredSize(new Dimension(360,400));
		Panel.add(ProjectTitle);
		Panel.add(SKU);
		Panel.add(SKUTF);
		Panel.add(Title);
		Panel.add(TitleTF);
		Panel.add(Price);
		Panel.add(PriceTF);
		Panel.add(Quantity);
		Panel.add(QuantityTF);
		Panel.add(submitAddItem);
		
		Frame.add(Panel);
		Frame.pack();
		Frame.setVisible(true);
		AddItemEvent();
		
	}
	
	public static void DeleteItem() 
	{
		
		Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProjectTitle = new JLabel("Delete Item", SwingConstants.CENTER);
		SKU = new JLabel("SKU: ");
		SKUTF = new JTextField(15);
		submitDeleteItem = new JButton("Submit");
		
		Panel = new JPanel();
		Panel.setPreferredSize(new Dimension(360,400));
		Panel.add(ProjectTitle);
		Panel.add(SKU);
		Panel.add(SKUTF);
		Panel.add(submitDeleteItem);
		
		Frame.add(Panel);
		Frame.pack();
		Frame.setVisible(true);
		DeleteItemEvent();
		
	}
	
	public static void ViewFile() 
	{
		
		Frame = new JFrame();
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProjectTitle = new JLabel("View File", SwingConstants.CENTER);
		SKU = new JLabel("SKU: ");
		SKUTF = new JTextField(15);
		submitViewItem = new JButton("Find Book");
		submitViewList = new JButton("View Full List");
		
		FullList = new JTextArea();
		FullList.setPreferredSize(new Dimension(550,600));
		FullList.setEditable(false);
		
		Panel = new JPanel();
		Panel.setPreferredSize(new Dimension(500,550));
		Panel.add(ProjectTitle);
		Panel.add(SKU);
		Panel.add(SKUTF);
		Panel.add(submitViewItem);
		Panel.add(submitViewList);
		Panel.add(FullList);
		Frame.add(Panel);
		Frame.pack();
		Frame.setVisible(true);
		SubmitViewEvent();
		SubmitItemEvent();
	}
	
	// Events
	
	public static void events() 

	{
		
		// ADD ITEMVIEW
		addItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				AddItem();
			}
		});
		
		// DELETE ITEM VIEW
		deleteItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DeleteItem();
			}
		});
		
		// VIEW LIST VIEW
		ViewList.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ViewFile();
			}
		});

	}
	
	// Add Item
	public static void AddItemEvent() 
	{
		submitAddItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Add Item");
				try 
				{
					Textbook textbook = new Textbook(SKUTF.getText(), TitleTF.getText(), Integer.valueOf(PriceTF.getText()), Integer.valueOf(QuantityTF.getText()));
					TextbookDB db = new TextbookDB();
					db.AddBook(textbook);
					
				}
				catch(Exception err) 
				{
					System.out.println("Error: " + err.getLocalizedMessage());
				}
			}
		});
	}
	
	// Delete Event
	public static void DeleteItemEvent() 
	{
		submitDeleteItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Deleted Line");
				try 
				{
					
					TextbookDB db = new TextbookDB();
					File file = new File("TextbookDB.txt");
					file.createNewFile();
					db.DeleteLine(SKUTF.getText(), file);
					
				}
				catch(Exception err) 
				{
					System.out.println("Error: " + err.getLocalizedMessage());
				}
			}
		});
	
	}
	
	// Submit Item Event
	public static void SubmitItemEvent() 
	{
		submitViewItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Print Item");
				TextbookDB db = new TextbookDB();
				File file = new File("TextbookDB.txt");
				FullList.setText(db.ReadFile(file)); 
			}
		});
	}
	
	//Submit Full List
	public static void SubmitViewEvent() {
		submitViewList.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Print Full List");
				TextbookDB db = new TextbookDB();
				File file = new File("TextbookDB.txt");
				FullList.append(db.ReadFile(file)); 
			}
		});
	}
	
}
