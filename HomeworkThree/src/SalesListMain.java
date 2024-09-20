import java.awt.EventQueue;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

/** Initialize Main
 * 
 * @author Andrew Espinosa
 * @version 1.0
 * 
 */

public class SalesListMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField item_text_field;
	private JTextField cost_text_field;
	private JTextField quantity_text_field;
	private JTextField result_text_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesListMain frame = new SalesListMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SalesListMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Item Label
		JLabel item_label = new JLabel("Item:");
		item_label.setBounds(127, 14, 46, 14);
		contentPane.add(item_label);
		
		// Item Text Field
		item_text_field = new JTextField();
		item_text_field.setBounds(183, 11, 137, 20);
		contentPane.add(item_text_field);
		item_text_field.setColumns(10);
		
		// Cost Text Field
		cost_text_field = new JTextField();
		cost_text_field.setColumns(10);
		cost_text_field.setBounds(183, 39, 86, 20);
		contentPane.add(cost_text_field);
		
		// Cost Label
		JLabel cost_text_label = new JLabel("Cost:");
		cost_text_label.setBounds(127, 42, 46, 14);
		contentPane.add(cost_text_label);
		
		// Quantity Text Field
		quantity_text_field = new JTextField();
		quantity_text_field.setColumns(10);
		quantity_text_field.setBounds(183, 70, 86, 20);
		contentPane.add(quantity_text_field);
		
		// Quantity Label
		JLabel quantity_label = new JLabel("Quantity:");
		quantity_label.setBounds(127, 73, 100, 14);
		contentPane.add(quantity_label);
		
		// Submit Button
		JButton submit_button = new JButton("Add Item to the Sales list");
		submit_button.setBounds(127, 101, 193, 23);
		contentPane.add(submit_button);
		
		// Enable Scrolling for Text Area
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(75, 135, 300, 80);
		contentPane.add(scrollPane);
		
		// Text Area
		JTextArea text_area = new JTextArea();
		text_area.setEditable(false);
		scrollPane.setViewportView(text_area);
		
		// Result TextField
		result_text_field = new JTextField();
		result_text_field.setEditable(false);
		result_text_field.setText("0");
		result_text_field.setColumns(10);
		result_text_field.setBounds(204, 230, 116, 20);
		contentPane.add(result_text_field);
		
		// Total Sales Label
		JLabel result_text_label = new JLabel("Total Sales:");
		result_text_label.setBounds(127, 233, 100, 14);
		contentPane.add(result_text_label);
		
		/** Submit Button Pressed 
		 * 
		 * @return Pop-up window to input text + return its values
		 * 
		 */
		submit_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				// Check if any of the text fields are empty
				Item item = new Item(item_text_field.getText(), cost_text_field.getText(), quantity_text_field.getText());
				
				if(item.checkError(item.getItem(), item.getCost(), item.getQuantity(), text_area) == false) {
					item.addItem(text_area, item.getCost(), item.getItem(), item.getQuantity());
					result_text_field.setText(item.totalCost(result_text_field.getText(), item.getCost(), item.getQuantity()));
				}
				
				
			}
		});
		
	}
}
