package LO02_projet;
public class Divinite extends Carte {
	

	protected Dogmes dogme1;
	protected Dogmes dogme2;
	protected Dogmes dogme3;
	
	public Divinite(String capacite, String nom, Origine origine, Dogmes dogme1, Dogmes dogme2, Dogmes dogme3) {
		super(capacite, nom, origine);
		this.dogme1 = dogme1;
		this.dogme2 = dogme2;
		this.dogme3 = dogme3;
	}

	public String toString() {
		return "Divinite nom : " + nom + "\n";
	}
	

}
