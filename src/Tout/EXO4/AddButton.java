package Tout.EXO4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AddButton extends AbstractAction {

    private Container c;
    private int number;
    private Auditeurs audit;

    AddButton(Container c, String text,Auditeurs audit){
        super(text);
        this.c = c;
        number = audit.i;
        this.audit = audit;

    }

    //ajout des boutons en appuyant sur add
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton Button = new JButton(String.valueOf(number++));
        c.add(Button);
        SwingUtilities.updateComponentTreeUI(c);
        Button.addActionListener(new ActionListener() {
            //supprimer le bouton appuye
            @Override
            public void actionPerformed(ActionEvent e) {
                audit.remove(Button);
                audit.repaint();
                audit.pack();
            }
        });

    }
}
