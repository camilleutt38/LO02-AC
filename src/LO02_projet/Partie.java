package LO02_projet;

import java.util.ArrayList;
import java.util.Iterator;

import TP04.Joueur;

public class Partie {
	
	private ArrayList<Joueur> joueurs;
	public Pile cartes;
	
	public Partie(){
		joueurs = new ArrayList<Joueur>();
		cartes = new Pile();
		cartes.melanger();
		}
	
	
	
	@Override
	public String toString() {
		return "Cartes" + cartes;
	}
	
	public void ajouterJoueur(Joueur joueur) {
		//if (partieEnCours == false) {
			joueurs.add(joueur);
		}
	//}
	
	public void distribuerCarte() {
		while (cartes.estVide() == false) {
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				j.prendreCroyant(cartes.tirerCarteDessus());
			}
		}
	}



	public static void main(String[] args) {
		
		Partie p = new Partie();
		System.out.println(p);
		System.out.println(p.cartes.tirerCarteDessus());
		
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

		

		
	}

}
