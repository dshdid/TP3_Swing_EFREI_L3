package Tout.EXO2;

import javafx.scene.effect.Blend;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import static java.awt.Color.*;
import static javax.swing.SwingConstants.CENTER;


public class Decouverte extends JFrame {

    public Decouverte(String title) {
        super(title);
        setContentPane(ContentPane());

    }

    // Add Swing components to content pane
    public Container ContentPane() {
        // Set layout manager
        setLayout(new BorderLayout());

        //create Swing component
        JTextArea textArea = new JTextArea();
        this.add(textArea, BorderLayout.CENTER);
        textArea.setBackground(LIGHT_GRAY);
        textArea.setText("\n\n\n\n\n\n          " +
                "                       " +
                "                   You can type here");

        Border border = BorderFactory.createLineBorder(RED, 2);
        textArea.setBorder(border);

        JButton button = new JButton("OK");
        this.add(button, BorderLayout.SOUTH);
        button.setToolTipText("you can't click me!");

        button.setEnabled(false);
        button.setBackground(blue);

        JTextField text = new JTextField();
        this.add(text, BorderLayout.NORTH);
        text.setEditable(false);
        text.setText("I am a text field.");
        text.setBackground(CYAN);
        Border border1 = BorderFactory.createLineBorder(BLUE, 2);
        text.setBorder(border1);

        return getContentPane();
    }

}