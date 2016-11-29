package LO02_projet;

import java.util.ArrayList;

public class Joueur {

	
	private int nbPrieres=0;
	public ArrayList<Action> main ;
	protected String nom;
	public Divinite divinite;
	
	public Joueur(String nom){
		this.nom = nom;
		main = new ArrayList<Action>();
	}
	
	public void prendreCarte(Action action){
		main.add(action);
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(nom);
		sb.append(" : ");
		sb.append(main);
		sb.append("\n");
		sb.append("Divinite :");
		sb.append(divinite);
		return sb.toString();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void piocherDivinite(Divinite divinite) {
		this.divinite = divinite;
	}

	
	


}
