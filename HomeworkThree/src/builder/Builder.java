package builder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class Builder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Builder frame = new Builder();
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
	public Builder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Item:");
		lblNewLabel.setBounds(127, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(183, 11, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 39, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setBounds(127, 42, 46, 14);
		contentPane.add(lblCost);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 70, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(127, 73, 46, 14);
		contentPane.add(lblQuantity);
		
		JButton btnNewButton = new JButton("Add Item to the Sales list");
		btnNewButton.setBounds(127, 101, 193, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(127, 135, 193, 80);
		contentPane.add(scrollPane);
		
		JTextArea txtrLoremIpsumLorem = new JTextArea();
		txtrLoremIpsumLorem.setEditable(false);
		scrollPane.setViewportView(txtrLoremIpsumLorem);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(204, 230, 116, 20);
		contentPane.add(textField_3);
		
		JLabel lblTotalSales = new JLabel("Total Sales:");
		lblTotalSales.setBounds(127, 233, 67, 14);
		contentPane.add(lblTotalSales);
	}
}
