package LO02_projet;

import java.util.Collections;
import java.util.LinkedList;

public class PileDivinites {
	
	private LinkedList<Divinite> tasDivinite ;
	
	public PileDivinites() {
		tasDivinite = new LinkedList<Divinite>();
		
		Divinite divinite1 = new Divinite("Peut empecher l'utilisation d'une carte Apocalypse. La carte est defaussee", "Brewalen", Origine.jour, Dogmes.nature, Dogmes.humain, Dogmes.mystique);
		tasDivinite.add(divinite1);
		
		Divinite divinite2 = new Divinite("Peut imposer le sacrifice d'un guide spirituel ayant le dogme Symboles ou Nature", "Shingva", Origine.aube, Dogmes.chaos, Dogmes.mystique, Dogmes.humain);
		tasDivinite.add(divinite2);
		
		Divinite divinite3 = new Divinite("Peut recuperer les points d'Action d'une autre Divinite en plus des siens. L'autre Divinite ne recoit aucun point d'Action ce tour-ci","Gorpa", Origine.crepuscule, Dogmes.chaos, Dogmes.symbole, Dogmes.humain);
		tasDivinite.add(divinite3);
		
		Divinite divinite4 = new Divinite("Peut obliger un joueur a poser une carte Apocalypse s'il en possede une", "Llewella", Origine.nuit, Dogmes.chaos, Dogmes.mystique, Dogmes.nature);
		tasDivinite.add(divinite4);
		
		Divinite divinite5 = new Divinite("Peut detruire toutes les cartes de Croyants au centre de la table d'Origine Jour", "Pui-Tara", Origine.nuit, Dogmes.symbole, Dogmes.mystique, Dogmes.nature);
		tasDivinite.add(divinite5);
		
		Divinite divinite6 = new Divinite("Peut empecher le sacrifice d'un des Guides Spirituels de n'importe quel joueur", "Drinded", Origine.jour, Dogmes.symbole, Dogmes.humain, Dogmes.nature);
		tasDivinite.add(divinite6);
		
		Divinite divinite7 = new Divinite("Peut detruire toutes les cartes de Croyants au centre de la table d'Origine Neant", "Yarstur", Origine.jour, Dogmes.symbole, Dogmes.chaos, Dogmes.mystique);
		tasDivinite.add(divinite7);
		
		Divinite divinite8 = new Divinite("Peut obliger un joueur a poser une carte Apocalypse s'il en possede une", "Killinstred", Origine.nuit, Dogmes.chaos, Dogmes.nature, Dogmes.mystique);
		tasDivinite.add(divinite8);
		
		Divinite divinite9 = new Divinite("Recupere autant de points d'Action supplementaires d'Origine Neant que le nombre de Guides Spirituels que la Divinite possede", "Gwenghelen", Origine.aube, Dogmes.symbole, Dogmes.mystique, Dogmes.humain);
		tasDivinite.add(divinite9);
		
		Divinite divinite10 = new Divinite("Peut empecher un joueur de creer un Guide Spirituel. La carte est defaussee", "Romtec", Origine.crepuscule, Dogmes.chaos, Dogmes.humain, Dogmes.nature);
		tasDivinite.add(divinite10);
	}
	
	public void melanger(){
		Collections.shuffle(tasDivinite);
	}
	
	public Divinite tirerCarteDessus(){
		if (estVide() == false){
		return tasDivinite.removeFirst();}
		else {return null;}
	}
	
	public boolean estVide() {
		return tasDivinite.isEmpty();
	}

}
