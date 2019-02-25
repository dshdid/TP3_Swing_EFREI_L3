package Tout.EXO6.ageIHM;

import javax.swing.SwingUtilities;

public class run6{
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MaquetteIHM maquetteIHM = new MaquetteIHM();
				maquetteIHM.setVisible(true);
			}
		});
	}
}