package LO02_projet;
public class GuideSpirituel extends Action {
	
	protected int nbCroyantsMax;
	protected int nbcroyantsRattaches;
	public Dogmes dogme1;
	protected Dogmes dogme2;
	
	public GuideSpirituel(String capacite, String nom, Origine origine, EtatCarte etat, Dogmes dogme1, Dogmes dogme2, int nbCroyantsMax, int nbCroyantsRattaches) {
		super(capacite, nom, origine, etat);
		this.dogme1 = dogme1;
		this.dogme2 = dogme2;
		this.nbCroyantsMax = nbCroyantsMax;
		this.nbcroyantsRattaches = nbCroyantsRattaches;
		type = "guidespirituel";
		
	}
	
	public String toString() {
		return "Guide Spirituel nom : " + nom + ", d'origine : " +origine+ ", dogmes : " +dogme1+ ", " +dogme2+ "\n";

	}
	

}
