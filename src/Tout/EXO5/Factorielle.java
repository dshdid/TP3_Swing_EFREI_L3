package Tout.EXO5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorielle extends JFrame {

	public Factorielle()
	{
		super();
		build();
	}

	void build()
	{
		setTitle("Factorielle");
		setPreferredSize(new Dimension(400, 100));
        setLocationRelativeTo(null);

        Container c = getContentPane();

		final JTextField textField;

		final JButton resultat;
		final JLabel label;

		textField = new JTextField(4);

		resultat = new JButton("Resultat : ");
		label = new JLabel();

		c.setLayout(new FlowLayout());
		c.add(textField);
		c.add(resultat);
		c.add(label);

        resultat.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
                String text;
                int number;

                text = textField.getText();

                try{// catching a NumberFormatException when entering a letter instead of a number
                    number = Integer.parseInt(text);

                    if (number >= 17)
                        JOptionPane.showMessageDialog(null, "Le nombre doit etre plus petit de 17", "Erreur", JOptionPane.ERROR_MESSAGE);

                    else
                    {
                        int calcul = FactorielleCalcul.factorielle(number);

                        String result = String.valueOf(calcul);

                        label.setText(result);

                        resultat.setText(text + "!");
                    }
                }catch (NumberFormatException s){
                    JOptionPane.showMessageDialog(null, "Entrez un entier!", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        pack();
	}

    public static class FactorielleCalcul
    {
        static int factorielle (int n)
        {
            if ( n== 0 ) return 1;
            return n * factorielle(n-1);
        }
    }
}

