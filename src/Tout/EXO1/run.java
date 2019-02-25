package Tout.EXO1;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.*;

public class run {
    public static void main(String[] args) {

        //A thread to run swing applications
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                ExampleJFrame exampleJFrame = new ExampleJFrame("JFrame Example");
                exampleJFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                exampleJFrame.setLocationRelativeTo(null);
                exampleJFrame.setSize(500, 300);
                exampleJFrame.setVisible(true);
            }
        });
    }
}
