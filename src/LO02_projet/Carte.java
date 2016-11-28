package LO02_projet;

public abstract class Carte {
	
	protected String capacite;
	protected String nom;
	protected Origine origine;
	
	public Carte(String capacite, String nom, Origine origine){
		this.capacite = capacite;
		this.nom = nom;
		this.origine = origine;
	}

	@Override
	public String toString() {
		return "Carte [ nom=" + nom + ",capacite=" + capacite + ", origine=" + origine + "]";
	}
	
	
	

}
