package LO02_projet;



public class Apocalypse extends Action {
	
	public boolean estPosee;

	public Apocalypse(String capacite, String nom, Origine origine, EtatCarte etat) {
		super(capacite, nom, origine, etat);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Apocalypse d'origine : " + origine + "\n";

	}

}
