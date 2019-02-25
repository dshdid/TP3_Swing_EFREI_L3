package Tout.EXO1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.CENTER;

public class ExampleJFrame extends JFrame {

    public ExampleJFrame(String title){
        super(title);

        // Set layout manager
        setLayout(new BorderLayout());

        //create Swing component
        JButton button = new JButton("OK");
        JLabel label = new JLabel("I am in the centre!");

        // Add Swing components to content pane
        Container c = getContentPane();

        c.add(label);
        label.setHorizontalAlignment(CENTER);
        c.add(button, BorderLayout.SOUTH);

    }
}