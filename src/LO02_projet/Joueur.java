package LO02_projet;

import java.util.LinkedList;

public class Joueur {

	
	private int num;
	private int nbPrieres;
	public LinkedList<Croyant> main ;
	private String nom;
	
	public Joueur(String nom){
		this.nom = nom;
		main = new LinkedList<Croyant>();
	}
	
	public void prendreCroyant(Croyant croyant){
		main.add(croyant);
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(nom);
		sb.append(" : ");
		sb.append(main);
		sb.append("\n");
		return sb.toString();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	


}
