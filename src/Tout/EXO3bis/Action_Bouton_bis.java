package Tout.EXO3bis;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivilegedAction;



public class Action_Bouton_bis extends JFrame {


    private ButtonPanel panel;
    private JTextArea textArea;
    private JButton button;

    public Action_Bouton_bis(String title) {

        super(title);
        build();
    }

    private void build() {

        setLayout(new BorderLayout());
        textArea = new JTextArea();

        button = new JButton(new TestButton(this, "Test"));
        button.setPreferredSize(new Dimension(70, 30));

        JButton buttons[] = {new JButton(new ClickButton(this, "Un")),
                new JButton(new ClickButton(this, "Deux")),
                new JButton(new ClickButton(this, "Trois"))};

        for(JButton bouton : buttons){
            bouton.setPreferredSize(new Dimension(70, 30));
        }

        panel = new ButtonPanel(buttons);

        Container c = getContentPane();
        c.add(panel, BorderLayout.WEST);
        c.add(textArea, BorderLayout.CENTER);


    }

    class ButtonPanel extends JPanel{
        public ButtonPanel(JButton buttons[]) {

            Dimension size = getPreferredSize();
            size.width = 150;
            setPreferredSize(size);

            setBorder(BorderFactory.createTitledBorder("Bouton :"));

            setLayout(new GridBagLayout());
            GridBagConstraints gc = new GridBagConstraints();

            //// First Column ////

            gc.weightx = 0.1;
            gc.weighty = 0.1;

            gc.gridx = 0;
            gc.gridy = 0;

            this.add(button, gc);

            gc.gridx = 0;
            gc.gridy = 1;

            for(JButton bouton : buttons){
                gc.gridy ++;
                this.add(bouton, gc);
            }
       }
    }

    class TestButton extends AbstractAction{

        private String text;

        public TestButton(Action_Bouton_bis button, String text){
            super(text);
            this.text = text + " clic!";

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.append(text + "\n");
        }
    }

    class ClickButton extends AbstractAction{

        String text;
        public ClickButton(Action_Bouton_bis button, String text){
            super(text);
            this.text = text;

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setTitle( "* "+ text + " *");
        }
    }
}

