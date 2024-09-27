package HomeworkFour;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowBuilder extends JFrame {

	public static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JTextField xTextField;
	public JTextField yTextField;
	public JTextField resultTextField;
	
	public JRadioButton addRadioButton;
	public JRadioButton modRadioButton;
	public JLabel mainLabel;
	public JButton submitButton;

	/** Create the frame
	 * 
	 * @return a JFrame window
	 * 
	 */
	public WindowBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// Add Radio Button
		addRadioButton = new JRadioButton("Add");
		addRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		addRadioButton.setBounds(101, 139, 109, 23);
		contentPane.add(addRadioButton);
		
		// Mod Radio Button
		modRadioButton = new JRadioButton("Modulus");
		modRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		modRadioButton.setBounds(277, 139, 109, 23);
		contentPane.add(modRadioButton);
		
		// Main Label
		mainLabel = new JLabel("Enter any positive integer");
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setBounds(101, 47, 285, 14);
		contentPane.add(mainLabel);
		// X Text Field
		xTextField = new JTextField();
		xTextField.setBounds(101, 112, 285, 20);
		contentPane.add(xTextField);
		xTextField.setColumns(10);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(addRadioButton);
		btnGroup.add(modRadioButton);
		
		// Submit Button
		submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Determine which method is selected
				if(addRadioButton.isSelected()) {
					// Add Method
					System.out.println("Add Enabled");
				}else if(modRadioButton.isSelected()) {
					// Modulus Method
					System.out.println("Mod is enabled");
				}
			}
		});
		
		// Add the rest of the contents to the frame
		
		submitButton.setBounds(198, 179, 89, 23);
		contentPane.add(submitButton);
		
		yTextField = new JTextField();
		yTextField.setBounds(101, 81, 285, 20);
		contentPane.add(yTextField);
		yTextField.setColumns(10);
		
		JLabel xLabel = new JLabel("X:");
		xLabel.setHorizontalAlignment(SwingConstants.CENTER);
		xLabel.setBounds(69, 84, 29, 14);
		contentPane.add(xLabel);
		
		JLabel yLabel = new JLabel("Y:");
		yLabel.setHorizontalAlignment(SwingConstants.CENTER);
		yLabel.setBounds(69, 115, 29, 14);
		contentPane.add(yLabel);
		
		resultTextField = new JTextField();
		resultTextField.setEditable(false);
		resultTextField.setBounds(101, 230, 285, 20);
		contentPane.add(resultTextField);
		resultTextField.setColumns(10);
	}
}
