package LO02_projet;

import java.util.ArrayList;
import java.util.Iterator;

public class Partie {

	private ArrayList<Joueur> joueurs;
	public Pile cartes;
	public PileDivinites pileDivi;

	public Partie() {
		joueurs = new ArrayList<Joueur>();
		cartes = new Pile();
		cartes.melanger();
		pileDivi = new PileDivinites();
		pileDivi.melanger();
	}

	@Override
	public String toString() {
		return "Cartes" + cartes;
	}

	public void ajouterJoueur(Joueur joueur) {
		// if (partieEnCours == false) {
		joueurs.add(joueur);
	}
	// }

	public void distribuerCarte() {
		while (cartes.estVide() == false) {
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				j.prendreCarte(cartes.tirerCarteDessus());
			}
		}
	}

	public void distribuerDivinite() {
		Iterator<Joueur> it = joueurs.iterator();
		while (it.hasNext()) {
			Joueur j = (Joueur) it.next();
			j.piocherDivinite(pileDivi.tirerCarteDessus());
		}
	}
	
	//Fonction qui lance le dé et qui distribue les points d'actions aux Joueurs
	
	public void lancerDe() {
		int valeurDe=0;

		valeurDe= (int)(1+ 3*Math.random());
		if (valeurDe == 0){
			System.out.println("Le dé a dit Jour !");
		} else if(valeurDe == 1) {
			System.out.println("Le dé a dit Nuit !");
		} else {
			System.out.println("Le dé a dit Neant !");
		}
		if (valeurDe == 0) {
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				if (j.divinite.origine == Origine.jour){
					j.PtsActionJour(2);}
				else if (j.divinite.origine == Origine.aube){
					j.PtsActionJour(1);}
		}
		} else if (valeurDe == 1) {
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				if (j.divinite.origine == Origine.nuit){
					j.PtsActionNuit(2);}
				else if (j.divinite.origine == Origine.crepuscule){
					j.PtsActionNuit(1);}
			}
		} else {
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				if (j.divinite.origine == Origine.aube){
					j.PtsActionNeant(1);}
				else if (j.divinite.origine == Origine.crepuscule){
					j.PtsActionNeant(1);}
			}
		}

	}

	public static void main(String[] args) {

		Partie p = new Partie();
		System.out.println(p);

		Joueur chaton = new Joueur("Chaton");
		Joueur lucie = new Joueur("Lucie");
		Joueur chris = new Joueur("Chris");

		p.ajouterJoueur(chaton);
		p.ajouterJoueur(lucie);
		p.ajouterJoueur(chris);

		p.distribuerCarte();

		p.distribuerDivinite();

		System.out.println(chaton);
		System.out.println(lucie);
		System.out.println(chris);

		p.lancerDe();
		
		System.out.println(chaton);
		System.out.println(lucie);
		System.out.println(chris);

	}

}
