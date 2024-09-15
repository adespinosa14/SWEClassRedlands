import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.HttpURLConnection;
import java.net.URL;

/** Main File
 * 
 *  @author Andrew Espinosa
 *  @version 1.0
 * 
 */
public class ScrabbleMain {
    
    /**
     * 
     * 
     * 
     */

    public static void main(String[] args){
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        // Fill the layout with placeholders
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
        JLabel main_text_label = new JLabel("Please Enter 7 Letters:");
        constraints.gridx = 5;
        constraints.gridy = 7;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        panel.add(main_text_label, constraints);
        
        // User Text Field 7 
        JTextField letter_text_field = new JTextField(20);
        letter_text_field.setPreferredSize(new Dimension(109, 24));
        constraints.gridx = 5;
        constraints.gridy = 8;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(letter_text_field, constraints);
        
        // Submit Field
        JButton submit_button = new JButton("Submit");
        submit_button.setPreferredSize(new Dimension(79, 24));
        
        constraints.gridx = 5;
        constraints.gridy = 11;
        constraints.gridwidth = 3;
        constraints.gridheight = 3;
        panel.add(submit_button, constraints);
        
        // Result Text Area
        JTextArea word_result = new JTextArea(8, 24);
        word_result.setPreferredSize(new Dimension(100, 51));
        word_result.setText("Words appear here");
        constraints.gridx = 5;
        constraints.gridy = 13;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(word_result, constraints);
        
        frame.add(panel);
        frame.setVisible(true);

        // Button Clicked Method
        submit_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                // Detect Whether the text field has exceeded 7 characters OR are invalid characters
                
                int text_length = letter_text_field.getText().length();
                String text = letter_text_field.getText();
                if(text_length > 7){
                    JOptionPane.showMessageDialog(frame, "Please Enter Only 7 Letters");
                    letter_text_field.setText("");
                }else{

                    // Check if there are invalid characters
                    char[] alphabet = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
                    for(int i = 0; i < text_length - 1; i++){
                        if(alphabet.toString().contains(String.valueOf(text.charAt(i)))){
                            JOptionPane.showMessageDialog(frame, "Invalid Character: \"" + text.charAt(i + 1) + "\". Please enter only characters from the English alphabet.");
                            letter_text_field.setText("");
                        }
                    }

                    // No Invalid Characters were Spotted

                    

                }
                
                System.out.println(text);

            }

        });

    }
}
