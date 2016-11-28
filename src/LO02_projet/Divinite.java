package LO02_projet;
public class Divinite extends Carte {
	

	protected Dogmes dogme;
	
	public Divinite(String capacite, String nom, Origine origine, Dogmes dogme) {
		super(capacite, nom, origine);
		this.dogme = dogme;
	}

	

}
