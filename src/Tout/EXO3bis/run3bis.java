package Tout.EXO3bis;

import Tout.EXO2.Decouverte;

import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class run3bis {

    public static void main(String[] args) {

        //A thread to run swing applications
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Action_Bouton_bis actionBouton = new Action_Bouton_bis("" +
                        "Associer des actions aux boutons");
                actionBouton.setDefaultCloseOperation(EXIT_ON_CLOSE);
                actionBouton.setLocationRelativeTo(null);
                actionBouton.setSize(500, 300);
                actionBouton.setVisible(true);
            }
        });
    }
}
