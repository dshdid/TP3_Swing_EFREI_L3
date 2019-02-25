package Tout.EXO2;

import Tout.EXO1.ExampleJFrame;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class run2 {
    public static void main(String[] args) {

        //A thread to run swing applications
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Decouverte decouverte = new Decouverte(" A la " +
                        "découverte de nouveaux composants");
                decouverte.setDefaultCloseOperation(EXIT_ON_CLOSE);
                decouverte.setLocationRelativeTo(null);
                decouverte.setSize(500, 300);
                decouverte.setVisible(true);
            }
        });
    }
}