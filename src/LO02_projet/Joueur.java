package LO02_projet;

import java.util.ArrayList;

public abstract class Joueur {

	
	public int nbPrieres=0;
	public ArrayList<Action> main ;
	protected String nom;
	public Divinite divinite;
	public int PtsAction[] = {0, 0, 0};
	public ArrayList<Action> espaceJoueur ;
	public boolean IA;
	
	public Joueur(String nom){
		this.nom = nom;
		main = new ArrayList<Action>();
		espaceJoueur = new ArrayList<Action>();
	}
	
	public void prendreCarte(Action action){
		main.add(action);
		
	}
	
	public void defaussercarte(Action action){
		main.remove(action);
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
	
	public String toString() {
		String test = "Joueur [nom : " + nom + "\n" + " Nombre de Prieres : " + nbPrieres + "\n" ;
		String test2 = "";
	for (int i=0; i<main.size(); i++) {
		test2 =test2 + i + " " + main.get(i)  ; 
	}
	String test3 = "Points d'action : Jour : " + PtsAction[0] + " Nuit : " + PtsAction[1] + " Neant : " + PtsAction[2] + "]" + "\n" + "Divnite : " +divinite + "\n" + "Espace Joueur :" +espaceJoueur+ "\n";
	return test + test2 + test3 ;
	}
	
	public void PtsActionJour(int i){
		this.PtsAction[0] = i;
		
	}
	public void PtsActionNuit(int j){
		this.PtsAction[1] = j;
		
	}
	public void PtsActionNeant(int k){
		this.PtsAction[2] = k;
		
	}
	
	public boolean decision(Partie partie){
		boolean jouer = false;
		return jouer;
	}
	
	
	} 
