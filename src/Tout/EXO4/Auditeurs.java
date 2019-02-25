package Tout.EXO4;

import javax.swing.*;
import java.awt.*;


class Auditeurs extends JFrame {
    int i = 1;

    Auditeurs(String title){
        super(title);
        build();
    }

    void build() {

        // Set layout manager
        setLayout(new FlowLayout());

        Container c = getContentPane();
        //ajout des boutons add et reverse
        JButton addButton = new JButton(new AddButton(c, "Add", this));
        JButton reset = new JButton(new RemoveButton("Reset", this, c));
        c.add(addButton);
        c.add(reset);


        pack();
    }
}