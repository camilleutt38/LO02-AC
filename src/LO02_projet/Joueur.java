package LO02_projet;

import java.util.ArrayList;


public class Joueur {

	private int nbPrieres = 0;
	public ArrayList<Action> main;
	protected String nom;
	public int PtsAction[] = {0, 0, 0};
	//public Divinite divinite;

	public Joueur(String nom) {
		this.nom = nom;
		main = new ArrayList<Action>();
	}

	public void prendreCarte(Action action) {
		main.add(action);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	@Override
	public String toString() {
		return "Joueur [nom : " + nom + " Nombre de Prieres : " + nbPrieres + ", main : " + main + "Points d'action : Jour : " + PtsAction[0] + " Nuit : " + PtsAction[1] + " Neant" + PtsAction[2] + "]";
	}
	
	public void PtsAction(int i, int j, int k){
		this.PtsAction[0] = i;
		this.PtsAction[1] = j;
		this.PtsAction[2] = k;
		
	}

	
	
	}
