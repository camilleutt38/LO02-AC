package LO02_projet;
public class Action extends Carte {

	protected EtatCarte etat;
	
	public Action(String capacite, String nom, Origine origine, EtatCarte etat) {
		super(capacite, nom, origine);
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Action [, nom=" + nom + "etat=" + etat + ", capacite=" + capacite + ", origine=" + origine
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	

}
