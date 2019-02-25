package Tout.EXO3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivilegedAction;



public class Action_Bouton extends JFrame {


    private ButtonPanel panel;
    private JTextArea textArea;
    private JButton button, button1, button2, button3;

    public Action_Bouton(String title) {

        super(title);

        setLayout(new BorderLayout());

        panel = new ButtonPanel();
        textArea = new JTextArea();

        Container c = getContentPane();
        c.add(panel, BorderLayout.WEST);
        c.add(textArea, BorderLayout.CENTER);

        // Add behavior
        buttonAction();
    }

    //regroupant les actions dans une fonction
    private void buttonAction() {

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Test clic!\n");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("* UN *");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("* DEUX *");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setTitle("* TROIS *");
            }
        });
    }

    //ajout pour les boutons un layout GridBagLayout à panel principal
    class ButtonPanel extends JPanel{
        public ButtonPanel() {

            Dimension size = getPreferredSize();
            size.width = 150;
            setPreferredSize(size);

            setBorder(BorderFactory.createTitledBorder("Bouton :"));

            setLayout(new GridBagLayout());
            GridBagConstraints gc = new GridBagConstraints();


            button = new JButton("TEST");
            button.setPreferredSize(new Dimension(70, 30));

            button1 = new JButton("Un");
            button1.setPreferredSize(new Dimension(70, 30));
            button2 = new JButton("Deux");
            button1.setPreferredSize(new Dimension(70, 30));
            button3 = new JButton("Trois");
            button3.setPreferredSize(new Dimension(70, 30));


            gc.weightx = 0.1;
            gc.weighty = 0.1;

            gc.gridx = 0;
            gc.gridy = 0;

            this.add(button, gc);

            gc.gridx = 0;
            gc.gridy = 1;

            this.add(button1, gc);

            gc.gridx = 0;
            gc.gridy = 2;

            this.add(button2, gc);

            gc.gridx = 0;
            gc.gridy = 3;

            this.add(button3, gc);
        }
    }
}

