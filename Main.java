import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window builder!");
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

        // Set constraints to the grid
        constraints.weightx = 0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTHWEST;

        // Top label
        JLabel label_0 = new JLabel("Enter ONLY Positive Integers");
        constraints.gridx = 6;
        constraints.gridy = 9;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        panel.add(label_0, constraints);

        // X Text Box
        JTextField text_field_0 = new JTextField(15);
        text_field_0.setPreferredSize(new Dimension(139, 24));
        constraints.gridx = 6;
        constraints.gridy = 10;
        constraints.gridwidth = 5;
        constraints.gridheight = 5;
        panel.add(text_field_0, constraints);

        JLabel label_1 = new JLabel("X");
        constraints.gridx = 5;
        constraints.gridy = 10;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        panel.add(label_1, constraints);

        // Y Text Box
        JTextField text_field_1 = new JTextField(15);
        text_field_1.setPreferredSize(new Dimension(139, 24));
        constraints.gridx = 6;
        constraints.gridy = 12;
        constraints.gridwidth = 5;
        constraints.gridheight = 5;
        panel.add(text_field_1, constraints);

        JLabel label_2 = new JLabel("Y");
        constraints.gridx = 5;
        constraints.gridy = 12;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        panel.add(label_2, constraints);

        // Answer Area Display
        JTextArea text_area = new JTextArea(3, 30);
        text_area.setPreferredSize(new Dimension(107, 51));
        text_area.setEditable(false);
        constraints.gridx = 5;
        constraints.gridy = 14;
        constraints.gridwidth = 4;
        constraints.gridheight = 4;
        panel.add(text_area, constraints);

        // Submit Button
        JButton submit_button = new JButton("Button");
        submit_button.setPreferredSize(new Dimension(154, 27));
        constraints.gridx = 6;
        constraints.gridy = 18;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;

        // Add items to the frame
        panel.add(submit_button, constraints);
        frame.add(panel);
        frame.setVisible(true);

        // Add event listener to the button
        submit_button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    // Create 2 number objects
                    BigNumber x = new BigNumber(Long.valueOf(text_field_0.getText()));
                    BigNumber y = new BigNumber(Long.valueOf(text_field_1.getText()));
                    text_area.setText("= " + String.valueOf(x.add(y.getBigNumber())));
                } catch (Exception er) {
                    // Throw exception should an error occur. Display to the user
                    text_area.setText("Error: " + er.getMessage());
                }
            }
        }); 
    }
}
