import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** Determines the strength of passwords.
 * 
 * @author Andrew Espinosa
 * @Version 1.0
 * 
 */

public class PasswordStrengthMain {
    public static void main(String[] args){
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Fill the layout with placeholder
        for (int row = 0; row < 25; row++) {
            for (int col = 0; col < 10; col++) {
                constraints.gridx = col;
                constraints.gridy = row;
                constraints.weightx = 1.0;
                constraints.weighty = 1.0;
                constraints.fill = GridBagConstraints.BOTH;

                Component filler = Box.createRigidArea(new Dimension(0, 0));
                panel.add(filler, constraints);
            }
        }

        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTHWEST;

        // Main Label
        JLabel main_text_label = new JLabel("Please Enter Password between 8-12 Characters:");
        constraints.gridx = 4;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        panel.add(main_text_label, constraints);
        
        // User Text Field 7 
        JTextField letter_text_field = new JTextField(20);
        letter_text_field.setPreferredSize(new Dimension(109, 24));
        constraints.gridx = 4;
        constraints.gridy = 8;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(letter_text_field, constraints);
        
        // Submit Field
        JButton submit_button = new JButton("Submit");
        submit_button.setPreferredSize(new Dimension(79, 24));
        
        constraints.gridx = 4;
        constraints.gridy = 11;
        constraints.gridwidth = 3;
        constraints.gridheight = 3;
        panel.add(submit_button, constraints);
        
        // Result Text Area
        JTextArea result = new JTextArea(8, 24);
        result.setPreferredSize(new Dimension(100, 51));
        result.setText("Strength Result");
        constraints.gridx = 4;
        constraints.gridy = 13;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        result.setEnabled(false);
        panel.add(result, constraints);
        
        frame.add(panel);
        frame.setVisible(true);

        /** Creates event upon button press
         * 
         * @return Error OR Password Strength
         * 
         */
        
        submit_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Password password = new Password(letter_text_field.getText());
                if(password.checkError(frame, letter_text_field)){
                    System.out.println("Error Found");
                }else{
                    System.out.println("Success");
                    System.out.println("New Password: " + password.passwordStrength(result));
                }
            }
        });

    }
}
