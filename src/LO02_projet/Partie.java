package LO02_projet;


import java.util.ArrayList;
import java.util.Iterator;

public class Partie {

	private ArrayList<Joueur> joueurs;
	public Pile cartes;
	public PileDivinites pileDivi;
	public Milieu milieu;
	public boolean etatPartie;

	public Partie() {
		etatPartie = true;
		joueurs = new ArrayList<Joueur>();
		cartes = new Pile();
		cartes.melanger();
		pileDivi = new PileDivinites();
		pileDivi.melanger();
		milieu = new Milieu();
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
		for (int i = 0; i <= 6; i++) {
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

	// Fonction qui lance le de et qui distribue les points d'actions aux
	// Joueurs

	public void lancerDe() {
		int valeurDe = 0;

		valeurDe = (int) (3 * Math.random());
		if (valeurDe == 0) {
			System.out.println("Le de dit Jour !");
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				if (j.divinite.origine == Origine.jour) {
					j.PtsActionJour(2);
				} else if (j.divinite.origine == Origine.aube) {
					j.PtsActionJour(1);
				}
			}
		} else if (valeurDe == 1) {
			System.out.println("Le de a dit Nuit !");
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				if (j.divinite.origine == Origine.nuit) {
					j.PtsActionNuit(2);
				} else if (j.divinite.origine == Origine.crepuscule) {
					j.PtsActionNuit(1);
				}
			}
		} else {
			System.out.println("Le de a dit Neant !");
			Iterator<Joueur> it = joueurs.iterator();
			while (it.hasNext()) {
				Joueur j = (Joueur) it.next();
				if (j.divinite.origine == Origine.aube) {
					j.PtsActionNeant(1);
				} else if (j.divinite.origine == Origine.crepuscule) {
					j.PtsActionNeant(1);
				}
			}
		}
	}

	public void doApocalypse() {
		int i = 2;
		if (i > 4) {
			Iterator<Joueur> ite = joueurs.iterator();
			Joueur joueurPerdant = new Joueur ("Perdant");
			joueurPerdant.nbPrieres = 1000;
			while (ite.hasNext()) {
				Joueur j = (Joueur) ite.next();
				if (j.nbPrieres < joueurPerdant.nbPrieres) {
					joueurPerdant = j;
				}
			}
			joueurs.remove(joueurPerdant);
			System.out.println("Le joueur " + joueurPerdant.nom + " a été éliminé ! ");

		} else {

			Iterator<Joueur> ite = joueurs.iterator();
			Joueur joueurGagnant = new Joueur ("Gagnant");
			while (ite.hasNext()) {
				Joueur j = (Joueur) ite.next();
				if (j.nbPrieres > joueurGagnant.nbPrieres) {
					joueurGagnant = j;
				}
			}
			System.out.println("Le joueur " + joueurGagnant.nom + " a gagné !");
			etatPartie = false;
		}

	}

	public static void main(String[] args) {

		Partie p = new Partie();
		// System.out.println(p);

		Joueur camille = new Joueur("Camille");
		Joueur lucie = new Joueur("Lucie");
		Joueur chris = new Joueur("Chris");

		p.ajouterJoueur(camille);
		p.ajouterJoueur(lucie);

		p.distribuerCarte();

		p.distribuerDivinite();

		p.lancerDe();
		p.lancerDe();
		p.lancerDe();
		p.lancerDe();
		p.lancerDe();

		System.out.println(camille);
		System.out.println(lucie);

		// On fait poser un Croyant a Lucie (si elle peut)
		p.milieu.poserCroyant(lucie);

		// Contenu du mileu :
		System.out.println("Contenu du milieu : " + p.milieu.CroyantsMilieu);

		// Camille va essayer de voler le croyant du milieu
		p.milieu.recupererCroyant(camille);

		System.out.println(camille);
		
		p.doApocalypse();

	}

}
