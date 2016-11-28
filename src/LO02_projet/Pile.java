package LO02_projet;


import java.util.Collections;
import java.util.LinkedList;

public class Pile {
	
	public final static int nbDeCartes = 36 ;
	private LinkedList<Croyant> tasDeCroyants;
	
	public Pile(){
		
		//Création des Croyants
		tasDeCroyants= new LinkedList<Croyant>();
		
		// Création des Moines
		Croyant croyant1 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.mystique, 2 );
		System.out.println(croyant1);
		tasDeCroyants.add(croyant1);
		
		Croyant croyant2 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.chaos, Dogmes.mystique, 2 );
		System.out.println(croyant2);
		tasDeCroyants.add(croyant2);
		
		Croyant croyant3 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour, EtatCarte.pioche, Dogmes.chaos, Dogmes.symbole, Dogmes.mystique, 2 );
		System.out.println(croyant3);
		tasDeCroyants.add(croyant3);
		
		Croyant croyant4 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour, EtatCarte.pioche, Dogmes.symbole, Dogmes.nature, Dogmes.mystique, 2 );
		System.out.println(croyant4);
		tasDeCroyants.add(croyant4);
		
		Croyant croyant5 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.mystique, 2 );
		System.out.println(croyant5);
		tasDeCroyants.add(croyant5);
		
		// Création des travailleurs Croyants
		
		Croyant croyant6 = new Croyant("Empeche une divinite possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de croyants durant ce tour", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.chaos, 2 );
		System.out.println(croyant6);
		tasDeCroyants.add(croyant6);
		
		Croyant croyant7 = new Croyant("Empeche une divinite possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de croyants durant ce tour", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.nature, 2 );
		System.out.println(croyant7);
		tasDeCroyants.add(croyant7);
		
		Croyant croyant8 = new Croyant("Vous piochez deux cartes au hasard dans la main d'une autre Divinité", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.mystique, Dogmes.chaos, 2 );
		System.out.println(croyant8);
		tasDeCroyants.add(croyant8);
		
		//création des Ermites croyants 
		
		Croyant croyant9 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Ermite", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.chaos, 1);
		System.out.println(croyant9);
		tasDeCroyants.add(croyant9);
		
		Croyant croyant10 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Ermite", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 1);
		System.out.println(croyant10);
		tasDeCroyants.add(croyant10);
		
		//Création de l'Intégriste Croyant
		
		Croyant croyant11 = new Croyant("Impose le sacrifice d'un Guide Spirituel d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Intégristes", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.chaos, 1);
		System.out.println(croyant11);
		tasDeCroyants.add(croyant11);
		
		//Création du Guerrier Saint croyant
		
		Croyant croyant12 = new Croyant("Un Guide Spirituel revient dans la main de sa Divinité. Ses Croyants reviennent au centre de la table.", "Guerriers Saints", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 4);
		System.out.println(croyant12);
		tasDeCroyants.add(croyant12);
		
		// Création du Diplomates Croyant
		
		Croyant croyant13 = new Croyant("Relancez le dé de Cosmogonie. Le tour se finit normalement sous la nouvelle influence", "Diplomates", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.chaos, 4);
		System.out.println(croyant13);
		tasDeCroyants.add(croyant13);
		
		// Création des Démons Croyants
		
		Croyant croyant14 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Démons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.mystique, 2);
		System.out.println(croyant14);
		tasDeCroyants.add(croyant14);
		
		Croyant croyant15 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Démons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.chaos, Dogmes.mystique, 2);
		System.out.println(croyant15);
		tasDeCroyants.add(croyant15);
		
		Croyant croyant16 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Démons", Origine.nuit, EtatCarte.pioche, Dogmes.symbole, Dogmes.chaos, Dogmes.mystique, 2);
		System.out.println(croyant16);
		tasDeCroyants.add(croyant16);
		
		Croyant croyant17 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Démons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.mystique, 2);
		System.out.println(croyant17);
		tasDeCroyants.add(croyant17);
		
		Croyant croyant18 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Démons", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.mystique, 2);
		System.out.println(croyant18);
		tasDeCroyants.add(croyant18);
			
	}
	
	public void melanger(){
		Collections.shuffle(tasDeCroyants);
	}
	
	public Croyant tirerCarteDessus(){
		return tasDeCroyants.pop();
	}

	@Override
	public String toString() {
		return " " + tasDeCroyants + " ";
	}
	
	

}
