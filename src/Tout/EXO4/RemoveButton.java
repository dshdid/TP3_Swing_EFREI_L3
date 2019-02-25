package Tout.EXO4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RemoveButton extends AbstractAction {

    private Auditeurs audit;

    RemoveButton(String texte, Auditeurs audit, Container c) {
        super(texte);
        this.audit = audit;

    }

    //supprimer les boutons en reintialisant jframe
    public void actionPerformed(ActionEvent e) {
        audit.getContentPane().removeAll();
        audit.build();
        audit.repaint();
        audit.pack();

    }
}
