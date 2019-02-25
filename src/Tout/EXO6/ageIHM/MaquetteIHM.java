package Tout.EXO6.ageIHM;

import Tout.EXO6.calculage.BoutonAge;
import Tout.EXO6.calculage.BoutonReverse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.*;

public class MaquetteIHM extends JFrame {

	private JLabel labelLastName;
	private JTextField lastName;
	private JLabel labelFirstName;
	private JTextField firstName;
	private JTextField age;
	private JLabel labelAge;
	private JTextField year;
	
	
	public MaquetteIHM() {
		super();
		build();
	}

	private void build() {
		setTitle("Calcul de mon age");
		setSize(400,200);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	}

	private JPanel buildContentPane() {

	    //la partie haute de la fenetre
		JPanel north = new JPanel();
		north.setLayout(new GridLayout(2,1));
		north.setBackground(Color.green);

		labelLastName = new JLabel("Votre nom : ");
		lastName = new JTextField("", 20);
		lastName.setEditable(true);
		north.add(labelLastName);
		north.add(lastName);

		labelFirstName = new JLabel("Votre prenom : ");
		firstName = new JTextField("", 20);
		firstName.setEditable(true);
		north.add(labelFirstName);
		north.add(firstName);

        //la partie centre de la fenetre
		JPanel center = new JPanel();
		center.setLayout(new FlowLayout());
		center.setBackground(Color.green);
		labelAge = new JLabel("Votre annee de naissance : ");
		year = new JTextField("", 4);
		year.setEditable(true);

		age = new JTextField(" ", 27);
		age.setEditable(false);
		age.setBackground(Color.cyan);
		center.add(labelAge);
		center.add(year);
		center.add(age);

        //la partie bas de la fenetre
		JPanel south = new JPanel();
		south.setLayout(new FlowLayout());
		south.setBackground(Color.yellow);

		JButton buttonAge = new JButton(new BoutonAge(this,"Age?"));
		JButton buttonReverse = new JButton(new BoutonReverse(this,"Reverse"));

		south.add(buttonAge);
		south.add(buttonReverse);

		//l'ajout des parties sur le panel principal
        JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add("North", north);
		panel.add("Center", center);
		panel.add("South", south);

		return panel;
	}		

	public JTextField getLastName() {
		return lastName;
	}

	public JTextField getFirstName() {
		return firstName;
	}
	
	public JTextField getyear() {
		return year;
	}
	
	public JTextField getAge() {
		return age;
	}
	

	//le calcul
	public void calcul()
	{
		JTextField year = getyear();
		if (!year.getText().equals(""))
		{
		    try {// catching a NumberFormatException when entering a letter instead of a number
                Calendar cal = Calendar.getInstance();
                int annee = cal.get(Calendar.YEAR);
                int valeur = annee - Integer.parseInt(year.getText());

                String chaine;
                chaine = "En " + annee + " vous avez " + valeur + " ans.";
                getAge().setText(chaine);
            }catch (NumberFormatException s)
            {
                JOptionPane.showMessageDialog(null, "Entrer des entiers!", "Erreur", JOptionPane.ERROR_MESSAGE);

            }

		}
	}
}






