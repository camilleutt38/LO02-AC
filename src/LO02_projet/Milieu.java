package LO02_projet;

import java.util.ArrayList;
import java.util.Iterator;

public class Milieu {

	public ArrayList<Action> CroyantsMilieu;
	private int nbCroyants;

	public Milieu() {
		CroyantsMilieu = new ArrayList<Action>();
		nbCroyants = 0;
	}

	public void poserCroyant(Joueur j, int idCroyant) {
		if (idCroyant>=0 && idCroyant<=6) {
		Action c = j.main.get(idCroyant);

		if (c.origine == Origine.jour) {
			if (j.PtsAction[0] > 0) {
				this.CroyantsMilieu.add(c);
				this.nbCroyants = this.nbCroyants + 1;
				j.PtsAction[0] = j.PtsAction[0] - 1;
				j.main.remove(idCroyant);
			} else {
				System.out.println("Pas assez de point d'action d'origine Jour...");
			}
		} else if (c.origine == Origine.nuit) {
			if (j.PtsAction[1] > 0) {
				this.CroyantsMilieu.add(c);
				this.nbCroyants = this.nbCroyants + 1;
				j.PtsAction[1] = j.PtsAction[1] - 1;
				j.main.remove(idCroyant);
			} else {
				System.out.println("Pas assez de point d'action d'origine Nuit...");
			}
		} else {
			if (j.PtsAction[2] > 0) {
				this.CroyantsMilieu.add(c);
				this.nbCroyants = this.nbCroyants + 1;
				j.PtsAction[2] = j.PtsAction[2] - 1;
				j.main.remove(idCroyant);
			} else {
				System.out.println("Pas assez de point d'action d'origine Neant...");
			}
		}
		} else {
			System.out.println("Index de carte non valable");
		}
	}
	
}
