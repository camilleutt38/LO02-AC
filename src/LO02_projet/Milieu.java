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
		
		try {
			
		if (idCroyant>=0 && idCroyant<=6) {
		Croyant c =(Croyant)j.main.get(idCroyant);
		

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
		
	} catch (ClassCastException e) {
		System.out.println("Vous n'avez pas selectionne un Croyant...");
	}
	}
	
	
	
	
	public void recupererCroyant(Joueur j) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer l'index d'un Croyant du milieu pour le recuperer");
		int idCroyantMilieu = sc.nextInt();
		System.out.println("Entrer l'index d'un Guide Spirituel de votre main");
		int idGuide = sc.nextInt();
		
		try {
		
		if (idGuide>=0 && idGuide<=6 && idCroyantMilieu>=0 && idCroyantMilieu<=this.CroyantsMilieu.size()) {
		
		GuideSpirituel guide =(GuideSpirituel)j.main.get(idGuide);
		Croyant croyantMilieu =(Croyant) this.CroyantsMilieu.get(idCroyantMilieu);
		
		if (guide.dogme1==croyantMilieu.dogme1 || guide.dogme1==croyantMilieu.dogme2 || guide.dogme1==croyantMilieu.dogme3 || guide.dogme2==croyantMilieu.dogme1 || guide.dogme2==croyantMilieu.dogme2 || guide.dogme2==croyantMilieu.dogme3 ) {
		
		if (guide.origine == Origine.jour) {
			if (j.PtsAction[0] > 0) {
				this.CroyantsMilieu.remove(idCroyantMilieu);
				this.nbCroyants = this.nbCroyants - 1;
				j.PtsAction[0] = j.PtsAction[0] - 1;
				j.espaceJoueur.add(guide);
				j.espaceJoueur.add(croyantMilieu);
				j.main.remove(idGuide);
				j.nbPrieres=j.nbPrieres + croyantMilieu.nbPriere;
			} else {
				System.out.println("Pas assez de point d'action d'origine Jour...");
			}
		} else if (guide.origine == Origine.nuit) {
			if (j.PtsAction[1] > 0) {
				this.CroyantsMilieu.remove(idCroyantMilieu);
				this.nbCroyants = this.nbCroyants - 1;
				j.PtsAction[1] = j.PtsAction[1] - 1;
				j.espaceJoueur.add(guide);
				j.espaceJoueur.add(croyantMilieu);
				j.main.remove(idGuide);
				j.nbPrieres=j.nbPrieres + croyantMilieu.nbPriere;
			} else {
				System.out.println("Pas assez de point d'action d'origine Nuit...");
			}
		} else {
			if (j.PtsAction[2] > 0) {
				this.CroyantsMilieu.remove(idCroyantMilieu);
				this.nbCroyants = this.nbCroyants - 1;
				j.PtsAction[0] = j.PtsAction[0] - 1;
				j.espaceJoueur.add(guide);
				j.espaceJoueur.add(croyantMilieu);
				j.main.remove(idGuide);
				j.nbPrieres=j.nbPrieres + croyantMilieu.nbPriere;
			} else {
				System.out.println("Pas assez de point d'action d'origine Neant...");
			}
			}
		}  else {
		System.out.println("Index de carte non valable");
			}		
		} else {
			System.out.println("Le guide et le croyant n'ont aucun dogme en commun...");
		}
		} catch (ClassCastException e) {
		System.out.println("Vous n'avez pas selectionne un Guide Spirituel...");
	}
}
	
	
}
	

