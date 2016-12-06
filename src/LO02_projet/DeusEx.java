package LO02_projet;
public class DeusEx extends Action {

	public DeusEx(String capacite, String nom, Origine origine, EtatCarte etat) {
		super(capacite, nom, origine, etat);
		type = "deusex";
	}

	public String toString() {
		return "DeusEx nom : " +nom+ ", d'origine : " + origine + "\n";

	}

}
