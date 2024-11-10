import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

import java.io.File;

public class ViewController{

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel title_label;
    private static JTextField user_input;
    private static JButton input_button;
    private static JButton submit;
    private static JTextArea answer_area;
    public static File fileToRead;

    public static void main(String[] args)
    {
        BuildView();
        addLisenerEvents();
    }

    public static void BuildView()
    {

        //Build the framework
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create elements
        title_label = new JLabel("JMCS Bot");
        user_input = new JTextField();
        user_input.setEditable(false);
        user_input.setPreferredSize(new Dimension(300,20));

        input_button = new JButton("Find File");
        submit = new JButton("Build JMCS");

        answer_area = new JTextArea();
        answer_area.setEditable(false);
        answer_area.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(answer_area);
        scrollPane.setPreferredSize(new Dimension(350,200));

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(400,300));

        // Add Objects to the panel
        panel.add(title_label);
        panel.add(user_input);
        panel.add(input_button);
        panel.add(submit);
        panel.add(scrollPane);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }   

    public static void addLisenerEvents()
    {
        input_button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                requestInputFile();
            }
        });

        submit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JMCS jmcs = new JMCS(fileToRead);
                jmcs.buildCatalog();
                System.out.println(jmcs.toString());
                answer_area.setText(jmcs.toString());
            }
        });
    }
    
    // Pull file from user's computer
    public static void requestInputFile()
    {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if(returnValue == JFileChooser.APPROVE_OPTION)
            {
                fileToRead = jfc.getSelectedFile(); 
                System.out.println("Selected File: " + fileToRead);
                user_input.setText(fileToRead.toString());
            }
    }

}