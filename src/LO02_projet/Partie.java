package LO02_projet;

import java.util.ArrayList;
import java.util.Iterator;

public class Partie {

	private ArrayList<Joueur> joueurs;
	public Pile cartes;

	public Partie() {
		joueurs = new ArrayList<Joueur>();
		cartes = new Pile();
		cartes.melanger();
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

	public void distribuerPtsAction(int valeurDe) {
		if (valeurDe == 0) {
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				// if divinité jour
				j.PtsActionJour(2);
				// else if divinite aubde
				// j.PtsActionJour(1);
			}
		} else if (valeurDe == 1) {
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				// if divinité nuit
				j.PtsActionNuit(2);
				// else if divinite crepuscule
				// j.PtsActionNuit(1);
			}
		} else {
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				// if divinité aube
				j.PtsActionNeant(1);
				// else if divinite crepuscule
				// j.PtsActionNeant(1);
			}
		}

	}

	public static void main(String[] args) {

		Partie p = new Partie();
		DeCosmogonie de = new DeCosmogonie();
		System.out.println(p);

		Joueur chaton = new Joueur("Chaton");
		Joueur lucie = new Joueur("Lucie");
		Joueur chris = new Joueur("Chris");

		p.ajouterJoueur(chaton);
		p.ajouterJoueur(lucie);
		p.ajouterJoueur(chris);

		p.distribuerCarte();

		System.out.println(chaton);
		System.out.println(lucie);
		System.out.println(chris);

		System.out.println(chaton);
		de.lancerDe();

	}

}
