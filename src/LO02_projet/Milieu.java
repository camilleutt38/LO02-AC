package LO02_projet;

import java.util.*;

public class Milieu {

	public ArrayList<Action> CroyantsMilieu;
	private int nbCroyants;

	public Milieu() {
		CroyantsMilieu = new ArrayList<Action>();
		nbCroyants = 0;
	}

	public void poserCroyant(Joueur j) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer l'index d'un Croyant dans votre main");
		int idCroyant = sc.nextInt();
		
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
	
	
	
	
	public void recupererCroyant(Joueur j) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer l'index d'un Croyant du milieu");
		int idCroyantMilieu = sc.nextInt();
		System.out.println("Entrer l'index d'un Guide Spirituel de votre main");
		int idGuide = sc.nextInt();
		
		if (idGuide>=0 && idGuide<=6 && idCroyantMilieu>=0 && idCroyantMilieu<=this.CroyantsMilieu.size()) {
		
		Action guide = j.main.get(idGuide);
		Action croyantMilieu = this.CroyantsMilieu.get(idCroyantMilieu);
		
		if (guide.origine == Origine.jour) {
			if (j.PtsAction[0] > 0) {
				this.CroyantsMilieu.remove(idCroyantMilieu);
				this.nbCroyants = this.nbCroyants - 1;
				j.PtsAction[0] = j.PtsAction[0] - 1;
				j.espaceJoueur.add(guide);
				j.espaceJoueur.add(croyantMilieu);
			} else {
				System.out.println("Pas assez de point d'action d'origine Jour...");
			}
		} else if (guide.origine == Origine.nuit) {
			if (j.PtsAction[1] > 0) {
				this.CroyantsMilieu.remove(idCroyantMilieu);
				this.nbCroyants = this.nbCroyants - 1;
				j.PtsAction[1] = j.PtsAction[0] - 1;
				j.espaceJoueur.add(guide);
				j.espaceJoueur.add(croyantMilieu);
			} else {
				System.out.println("Pas assez de point d'action d'origine Nuit...");
			}
		} else {
			if (j.PtsAction[2] > 0) {
				this.CroyantsMilieu.remove(idCroyantMilieu);
				this.nbCroyants = this.nbCroyants - 1;
				j.PtsAction[0] = j.PtsAction[2] - 1;
				j.espaceJoueur.add(guide);
				j.espaceJoueur.add(croyantMilieu);
			} else {
				System.out.println("Pas assez de point d'action d'origine Neant...");
			}
			}
		}  else {
		System.out.println("Index de carte non valable");
			}		
	}
	
	
}
	

