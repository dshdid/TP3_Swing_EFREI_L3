package Tout.EXO6.calculage;

import Tout.EXO6.ageIHM.MaquetteIHM;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

public class BoutonReverse extends AbstractAction {
	
	private MaquetteIHM Age;
	
	public BoutonReverse(MaquetteIHM Age, String titre){
		super(titre);
		this.Age = Age;
	}

	//inverser les strings à l'aide de StringBuilder
    // appel de la fonction calcul dans MaquetteIHM
	public void actionPerformed(ActionEvent e) {

		JTextField lastName = Age.getLastName();
		StringBuilder reverse1 = new StringBuilder(lastName.getText());
		lastName.setText(reverse1.reverse().toString());
		
		JTextField firstName = Age.getFirstName();
		StringBuilder reverse2 = new StringBuilder(firstName.getText());
		firstName.setText(reverse2.reverse().toString());
	
		JTextField year = Age.getyear();
		StringBuilder reverse3 = new StringBuilder(year.getText());
		year.setText(reverse3.reverse().toString());
		
		Age.calcul();
	} 
}