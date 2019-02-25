package Tout.EXO4;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.*;

public class run4 {
    public static void main(String[] args) {

        //A thread to run swing applications
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Auditeurs auditeurs = new Auditeurs("Auditeurs");
                auditeurs.setDefaultCloseOperation(EXIT_ON_CLOSE);
                auditeurs.setLocationRelativeTo(null);
                auditeurs.setSize(500, 100);
                auditeurs.setVisible(true);
                auditeurs.pack();
            }
        });
    }
}
