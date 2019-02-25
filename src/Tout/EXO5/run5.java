package Tout.EXO5;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.*;

public class run5 {
    public static void main(String[] args) {

        //A thread to run swing applications
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Factorielle factorielle  = new Factorielle();
                factorielle.setDefaultCloseOperation(EXIT_ON_CLOSE);
                factorielle.setVisible(true);
            }
        });
    }
}

