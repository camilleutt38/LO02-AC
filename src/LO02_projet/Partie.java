package LO02_projet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Partie {

	private ArrayList<Joueur> joueurs;
	public Pile cartes;
	public PileDivinites pileDivi;
	public Milieu milieu;
	public boolean etatPartie;
	public Defausse defausse;

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
				System.out.println(j);
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
				System.out.println(j);
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
				System.out.println(j);
			}
		}
	}

	public boolean poserApocalypse(Joueur j) {
		boolean poser = false;
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Entrer l'index d'une carte Apocalypse dans votre main, ou 100 pour choisir une autre action");
		int idApocalypse = sc.nextInt();
		if (idApocalypse == 100) {
			System.out.println("Vous avez choisi de ne pas poser d'Apocalypse");
			return poser;
		}

		try {

			if (idApocalypse >= 0 && idApocalypse <= 6) {
				Apocalypse a = (Apocalypse) j.main.get(idApocalypse);

				if (a.origine == Origine.jour) {
					if (j.PtsAction[0] > 0) {
						this.doApocalypse();
						j.PtsAction[0] = j.PtsAction[0] - 1;
						j.main.remove(idApocalypse);
						poser = true;
					} else {
						System.out.println("Pas assez de point d'action d'origine Jour...");
					}
				} else if (a.origine == Origine.nuit) {
					if (j.PtsAction[1] > 0) {
						this.doApocalypse();
						j.PtsAction[1] = j.PtsAction[1] - 1;
						j.main.remove(idApocalypse);
						poser = true;
					} else {
						System.out.println("Pas assez de point d'action d'origine Nuit...");
					}
				} else {
					if (j.PtsAction[2] > 0) {
						this.doApocalypse();
						j.PtsAction[2] = j.PtsAction[2] - 1;
						j.main.remove(idApocalypse);
						poser = true;
					} else {
						System.out.println("Pas assez de point d'action d'origine Neant...");
					}
				}
			} else {
				System.out.println("Index de carte non valable");
			}

		} catch (ClassCastException e) {
			System.out.println("Vous n'avez pas selectionne une Apocalypse...");
		}
		return poser;
	}

	public void doApocalypse() {
		int nbJoueurs = joueurs.size();
		boolean egalite = false;

		Iterator<Joueur> iter = joueurs.iterator();
		Joueur joueurEgalite = this.joueurs.get(0);
		while (iter.hasNext()) {
			Joueur j = (Joueur) iter.next();
			if (j.nbPrieres == joueurEgalite.nbPrieres) {
				egalite = true;
			}
		}
		if (egalite) {
			System.out.println("Il y a egalite on n'elimine personne !");
		} else if (nbJoueurs > 4 && egalite == false) {
			Iterator<Joueur> ite = joueurs.iterator();
			Joueur joueurPerdant = this.joueurs.get(0);
			while (ite.hasNext()) {
				Joueur j = (Joueur) ite.next();
				if (j.nbPrieres < joueurPerdant.nbPrieres) {
					joueurPerdant = j;
				}
			}
			joueurs.remove(joueurPerdant);
			System.out.println("Le joueur " + joueurPerdant.nom + " a ete elimine ! ");

		} else if (nbJoueurs <= 4 && egalite == false) {

			Iterator<Joueur> ite = joueurs.iterator();
			Joueur joueurGagnant = this.joueurs.get(0);
			while (ite.hasNext()) {
				Joueur j = (Joueur) ite.next();
				if (j.nbPrieres > joueurGagnant.nbPrieres) {
					joueurGagnant = j;
				}
			}
			System.out.println("Le joueur " + joueurGagnant.nom + " a gagne !");
			etatPartie = false;
		}

	}

	public Joueur joueurSuivant(Joueur joueurEnCours) {

		if (this.joueurs.indexOf(joueurEnCours) < this.joueurs.size() - 1) {
			int id = this.joueurs.indexOf(joueurEnCours) + 1;
			Joueur joueurSuivant = this.joueurs.get(id);
			return joueurSuivant;
		} else {
			Joueur joueurSuivant = this.joueurs.get(0);
			return joueurSuivant;
		}
	}

	public void tour() {
		Joueur joueurDe = this.joueurs.get(0);
		int j=1;
		while (this.etatPartie==true) {
			System.out.println("Tour numero : " + j);
			Joueur joueurJoue = joueurDe;
			System.out.println(joueurDe.nom + " lance le de !");
			this.lancerDe();
			for (int i = 0; i < this.joueurs.size(); i++) {
				if (this.etatPartie == true) {
					System.out.println(joueurJoue.nom + " joue son tour !");
					if (joueurJoue.IA == false) {
						this.jouerTour(joueurJoue);
					} else if (joueurJoue.IA == true){
						if (joueurJoue.decision(this)){
							System.out.println("L'IA a su jouer !");
						} else {
							System.out.println("Hum desolee notre IA est encore un peu stupide...");
						}
					}
					System.out.println(joueurJoue);
					joueurJoue = this.joueurSuivant(joueurJoue);

				}
			}
			joueurDe = this.joueurSuivant(joueurDe);
			j = j + 1;
		}
		
	}

	public void jouerTour(Joueur j) {
		Boolean jouer = false;
		while (jouer == false) {
			System.out
					.println("Que veux-tu faire ? 1 pour completer ta main, 2 pour defausser, 3 pour jouer une carte, 4 pour sacrifier une carte");
			Scanner sce = new Scanner(System.in);
			int choixTour = sce.nextInt();
			if (choixTour == 1) {
				if (j.main.size() < 7) {
					for (int i = j.main.size(); i < 7; i++) {
						j.prendreCarte(cartes.tirerCarteDessus());
						jouer = true;
					}
				} else {
					System.out.println("Tu as deja assez de cartes !");
				}
			} else if (choixTour == 2) {
				System.out.println("Combien de cartes voulez-vous defausser ?");
				Scanner scz = new Scanner(System.in);
				int nb = scz.nextInt();
				if (nb > 0 && nb < j.main.size()) {
					for (int i = 1; i < (nb + 1); i++) {
						System.out.println("Entrez l'index de la carte a defausser :");
						Scanner sca = new Scanner(System.in);
						int choixdefausse = sca.nextInt();
						j.defaussercarte(j.main.get(choixdefausse));
					}
					jouer = true;
				}
			} else if (choixTour == 3) {
				System.out.println(j.nom
						+ " quel type de carte veux-tu jouer ? 1 pour croyant 2 pour guide spirituel 3 pour apocalypse");
				Scanner sc = new Scanner(System.in);
				int choix = sc.nextInt();
				if (choix == 1) {
					if (this.milieu.poserCroyant(j) == true) {
						jouer = true;
					}
				} else if (choix == 2) {
					if (this.milieu.recupererCroyant(j) == true) {
						;
						jouer = true;
					}
				} else if (choix == 3) {
					if (this.poserApocalypse(j) == true) {
						
						jouer = true;
					}
				} else {
					System.out.println("Pas un type de cartes...");
				}

			} else if (choixTour == 4) {
				if (this.activerCapacite(j)== true) {
					jouer = true ;
				}
			}
		}
	}

	public boolean activerCapacite(Joueur j) {
		boolean activer = false ;
		System.out.println("Quel type de carte voulez-vous sacrifier ? 1 pour Croyant, 2 pour Guide");
		Scanner scc = new Scanner(System.in);
		int type = scc.nextInt();
		if (type == 1) {
			System.out.println(
					"Entrer l'index de la carte dans votre espace joueur dont vous voulez activer la capacite :");
			Scanner scb = new Scanner(System.in);
			int nb = scb.nextInt();
			if (nb >= 0 && nb <= j.espaceJoueur.size()) {
				Croyant carte =(Croyant) j.espaceJoueur.get(nb);
				// CEST ICI QUON LISTE LES CAPACITES CROYANTS
				if (carte.nom == "Moines") {
					System.out.println(carte.capacite);
					j.PtsAction[0] = j.PtsAction[0] + 1;
					j.espaceJoueur.remove(carte);
					activer = true;
				} else if (carte.nom == "Esprits") {
					System.out.println(carte.capacite);
					j.PtsAction[2] = j.PtsAction[2] + 1;
					j.espaceJoueur.remove(carte);
					activer = true;
				} else if (carte.nom == "Demons") {
					System.out.println(carte.capacite);
					j.PtsAction[1] = j.PtsAction[1] + 1;
					j.espaceJoueur.remove(carte);
					activer = true;
				} else if (carte.nom == "Diplomates") {
					System.out.println(carte.capacite);
					this.lancerDe();
					j.espaceJoueur.remove(carte);
					activer = true;
				} else if (carte.nom == "Pillars") {
					System.out.println(carte.capacite);
					Scanner scf = new Scanner(System.in);
					System.out.println("Entrer un nom de Divinite");
					String nom = scf.nextLine();
					Iterator<Joueur> ite = joueurs.iterator();
					while (ite.hasNext()) {
						Joueur divi = (Joueur) ite.next();
						if (divi.divinite.nom == nom) {
							j.PtsAction[0] = j.PtsAction[0] + divi.PtsAction[0];
							j.PtsAction[1] = j.PtsAction[1] + divi.PtsAction[1];
							j.PtsAction[2] = j.PtsAction[2] + divi.PtsAction[2];
							divi.PtsAction[0] = 0 ;
							divi.PtsAction[1] = 0 ;
							divi.PtsAction[2] = 0 ;
						}
					}
					j.espaceJoueur.remove(carte);
					activer = true;
				}
				else {
					System.out.println("cette capacite n'est pas encore utilisable");
				}
			} else {
				System.out.println("Index de carte non valable");
			}
		} else if (type == 2) {
			System.out.println(
					"Entrer l'index de la carte dans votre espace joueur dont vous voulez activer la capacite :");
			Scanner scb = new Scanner(System.in);
			int nb = scb.nextInt();
			if (nb >= 0 && nb <= j.espaceJoueur.size()) {
				GuideSpirituel carte =(GuideSpirituel) j.espaceJoueur.get(nb);
				// CEST ICI QUON LISTE LES CAPACITES GUIDES
				if (carte.nom == "Martyr") {
					System.out.println(carte.capacite);
					this.doApocalypse();
					j.espaceJoueur.remove(nb+1);
					j.espaceJoueur.remove(carte);
					activer = true;
				} else if (carte.nom == "Clerc") {
					System.out.println(carte.capacite);
					System.out.println("Ce guide a " +carte.nbcroyantsRattaches+ " de croyants rattaches");
					Scanner sc = new Scanner(System.in);
					System.out.println("Vous voulez les convertir en point d'action de quel type ? entrez 1 pour Jour, 2 pour Nuit, 3 pour Neant");
					int face = sc.nextInt();
					if (face==1) {
						j.PtsAction[0] = j.PtsAction[0] + carte.nbcroyantsRattaches;
					} else if (face==2) {
						j.PtsAction[1] = j.PtsAction[1] + carte.nbcroyantsRattaches;
					} else if (face==3) {
						j.PtsAction[2] = j.PtsAction[2] + carte.nbcroyantsRattaches;
					}
					j.espaceJoueur.remove(nb+1);
					j.espaceJoueur.remove(carte);
					activer = true ;
					
				}
				else {
					System.out.println("cette capacite n'est pas encore utilisable");
				}
			} else {
				System.out.println("Index de carte non valable");
			}
		}
		return activer ;
	}

	public static void main(String[] args) {

		Partie p = new Partie();

		System.out.println("Bienvenue dans pandocreon Divinae !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Combien y a t'il de joueurs reels ?");
		int nbReel = sc.nextInt();
		for (int i = 1; i <= nbReel; i++) {
			Scanner sca = new Scanner(System.in);
			System.out.println("Quel est le nom du joueur reel numero : " + i);
			String name = sca.nextLine();
			Reel jReel = new Reel(name);
			p.joueurs.add(jReel);
			System.out.println(jReel);
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Combien voulez-vous de joueurs IA ?");
		int nbIA = scan.nextInt();
		for (int i = 1; i <= nbIA; i++) {
			Scanner sca = new Scanner(System.in);
			System.out.println("Quel est le nom du joueur IA numero : " + i);
			String name = sca.nextLine();
			IA jIA = new IA(name);
			p.joueurs.add(jIA);
			System.out.println(jIA);
			System.out.println();
		}

		p.distribuerCarte();

		p.distribuerDivinite();
		


		//p.lancerDe();
		//p.lancerDe();
		//p.lancerDe();
		//p.lancerDe();
		//p.lancerDe();
		// On fait poser un Croyant a Lucie (si elle peut)
		// p.milieu.poserCroyant(lucie);

		// Contenu du mileu :
		// System.out.println("Contenu du milieu : " + p.milieu.CroyantsMilieu);

		// Camille va essayer de voler le croyant du milieu
		// p.milieu.recupererCroyant(camille);

		// System.out.println(camille);

		// p.doApocalypse();
		p.tour();
		// p.activerCapacite(camille);

		// System.out.println(camille);

	}

}
