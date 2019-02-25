package Tout.EXO6.calculage;

import Tout.EXO6.ageIHM.MaquetteIHM;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class BoutonAge extends AbstractAction {

	private MaquetteIHM Age;

	public BoutonAge(MaquetteIHM Age, String titre){
		super(titre);
		this.Age = Age;
	}

	//appel de la fonction calcul dans MaquetteIHM
	public void actionPerformed(ActionEvent e) {
		Age.calcul();
	}
}