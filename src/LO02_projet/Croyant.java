package LO02_projet;
public class Croyant extends Action {
	
	protected int nbPriere;
	public Dogmes dogme1;
	protected Dogmes dogme2;
	protected Dogmes dogme3;

	public Croyant(String capacite, String nom, Origine origine, EtatCarte etat, Dogmes dogme1, Dogmes dogme2, Dogmes dogme3, int nbPriere) {
		super(capacite, nom, origine, etat);
		this.dogme1 = dogme1;
		this.dogme2 = dogme2;
		this.dogme3 = dogme3;
		this.nbPriere = nbPriere;
		type = "croyant";
	}

	@Override
	public String toString() {
		return "Croyant nom : " + nom + ", d'origine : " +origine+ ", dogmes : " +dogme1+ ", " +dogme2+ ", " +dogme3+  "\n";
	}
	
	
	
	

}
