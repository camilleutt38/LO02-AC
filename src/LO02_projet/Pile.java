package LO02_projet;


import java.util.Collections;
import java.util.LinkedList;

public class Pile {
	
	public final static int nbDeCartes = 37 ;
	private LinkedList<Croyant> tasDeCroyants;
	
	public Pile(){
		
		//Creation des Croyants
		tasDeCroyants= new LinkedList<Croyant>();
		
		// Creation des Moines
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
		
		// Creation des travailleurs Croyants
		
		Croyant croyant6 = new Croyant("Empeche une divinite possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de croyants durant ce tour", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.chaos, 2 );
		System.out.println(croyant6);
		tasDeCroyants.add(croyant6);
		
		Croyant croyant7 = new Croyant("Empeche une divinite possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de croyants durant ce tour", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.nature, 2 );
		System.out.println(croyant7);
		tasDeCroyants.add(croyant7);
		
		Croyant croyant8 = new Croyant("Vous piochez deux cartes au hasard dans la main d'une autre Divinité", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.mystique, Dogmes.chaos, 2 );
		System.out.println(croyant8);
		tasDeCroyants.add(croyant8);
		
		//creation des Ermites croyants 
		
		Croyant croyant9 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Ermite", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.chaos, 1);
		System.out.println(croyant9);
		tasDeCroyants.add(croyant9);
		
		Croyant croyant10 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Ermite", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 1);
		System.out.println(croyant10);
		tasDeCroyants.add(croyant10);
		
		//Creation de l'Integriste Croyant
		
		Croyant croyant11 = new Croyant("Impose le sacrifice d'un Guide Spirituel d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Integristes", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.chaos, 1);
		System.out.println(croyant11);
		tasDeCroyants.add(croyant11);
		
		//Creation du Guerrier Saint croyant
		
		Croyant croyant12 = new Croyant("Un Guide Spirituel revient dans la main de sa Divinité. Ses Croyants reviennent au centre de la table.", "Guerriers Saints", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 4);
		System.out.println(croyant12);
		tasDeCroyants.add(croyant12);
		
		// Creation du Diplomates Croyant
		
		Croyant croyant13 = new Croyant("Relancez le dé de Cosmogonie. Le tour se finit normalement sous la nouvelle influence", "Diplomates", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.chaos, 4);
		System.out.println(croyant13);
		tasDeCroyants.add(croyant13);
		
		// Creation des Demons Croyants
		
		Croyant croyant14 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.mystique, 2);
		System.out.println(croyant14);
		tasDeCroyants.add(croyant14);
		
		Croyant croyant15 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.chaos, Dogmes.mystique, 2);
		System.out.println(croyant15);
		tasDeCroyants.add(croyant15);
		
		Croyant croyant16 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.symbole, Dogmes.chaos, Dogmes.mystique, 2);
		System.out.println(croyant16);
		tasDeCroyants.add(croyant16);
		
		Croyant croyant17 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.mystique, 2);
		System.out.println(croyant17);
		tasDeCroyants.add(croyant17);
		
		Croyant croyant18 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.mystique, 2);
		System.out.println(croyant18);
		tasDeCroyants.add(croyant18);
		
		// Creation des Alchimistes Croyants
		
		Croyant croyant19 = new Croyant("Empeche une Divinit� poss�dant le Dogme Humain ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.", "Alchimistes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.symbole, 2);
		System.out.println(croyant19);
		tasDeCroyants.add(croyant19);
		
		Croyant croyant20 = new Croyant("Emp�che une Divinit� poss�dant le Dogme Humain ou Symboles de sacrifier un de ses Guides Spirituels durant ce tour de jeu. ", "Alchimistes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.mystique, 2);
		System.out.println(croyant20);
		tasDeCroyants.add(croyant20);
		
		Croyant croyant21 = new Croyant("Vous piochez deux cartes au hasard dans la main d'une autre Divinite ", "Alchimistes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.symbole, 2);
		System.out.println(croyant21);
		tasDeCroyants.add(croyant21);

		// Creation des Vampires Croyants
		
		Croyant croyant22 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifi�. La capacit� sp�ciale du sacrifice est jou�e", "Vampires", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.symbole, 1);
		System.out.println(croyant22);
		tasDeCroyants.add(croyant22);
		
		Croyant croyant23 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifi�. La capacit� sp�ciale du sacrifice est jou�e", "Vampires", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.chaos, Dogmes.mystique, 1);
		System.out.println(croyant23);
		tasDeCroyants.add(croyant23);
		
		// Creation des Lycanthropes Croyants
		
		Croyant croyant24 = new Croyant("Retirez tous les Croyants attaches a l'un des Guides Spirituels d'une autre Divinite. Les croyants reviennent au milieu de la table, le Guide Spirituel est defausse.", "Lycanthropes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.humain, 4);
		System.out.println(croyant24);
		tasDeCroyants.add(croyant24);
		
		// Creation des Pillards Croyants
		
		Croyant croyant25 = new Croyant("Recuperez les points d'action d'une Divinite n'ayant pas encore joue durant ce tour. Les point d'action gardent leur Origine. La Divinite perd ses points.", "Pillars", Origine.nuit, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 4);
		System.out.println(croyant25);
		tasDeCroyants.add(croyant25);
		
		// Creation des Illusionnistes Croyants
		
		Croyant croyant26 = new Croyant("Vous beneficiez de la capacite speciale de sacrifice d'une carte de Croyants appartenant a une autre Divinite. La carte en question reste en jeu.", "Illusionnistes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.symbole, Dogmes.humain, 4);
		System.out.println(croyant26);
		tasDeCroyants.add(croyant26);
		
		// Creation des Esprits Croyants
		
		Croyant croyant27 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.humain, 2);
		System.out.println(croyant27);
		tasDeCroyants.add(croyant27);
		
		Croyant croyant28 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.chaos, Dogmes.humain, 2);
		System.out.println(croyant28);
		tasDeCroyants.add(croyant28);
		
		Croyant croyant29 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.chaos, Dogmes.symbole, 2);
		System.out.println(croyant29);
		tasDeCroyants.add(croyant29);
		
		Croyant croyant30 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 2);
		System.out.println(croyant30);
		tasDeCroyants.add(croyant30);
		
		Croyant croyant31 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.chaos, 2);
		System.out.println(croyant31);
		tasDeCroyants.add(croyant31);
		
		// Creation des Alienes Croyants
		
		Croyant croyant32 = new Croyant("Empeche une divinite possedant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu", "Alienes", Origine.neant, EtatCarte.pioche, Dogmes.symbole, Dogmes.humain, Dogmes.chaos, 2);
		System.out.println(croyant32);
		tasDeCroyants.add(croyant32);
		
		Croyant croyant33 = new Croyant("Empeche une divinite possedant le Dogme Chaos ou Mystique de sacrifier un de ses Guide Spirituel durant ce tour de jeu", "Alienes", Origine.neant, EtatCarte.pioche, Dogmes.symbole, Dogmes.humain, Dogmes.nature, 2);
		System.out.println(croyant33);
		tasDeCroyants.add(croyant33);
		
		Croyant croyant34 = new Croyant("Vous piochez deux cartes au hasard dans la main d'une autre Divinite", "Alienes", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.humain, Dogmes.chaos, 2);
		System.out.println(croyant34);
		tasDeCroyants.add(croyant34);
		
		// Creation du Revenant Croyant
		
		Croyant croyant35 = new Croyant("Lancez le d� de Cosmgonie. Le tour se fini normalement, mais sous cette nouvelle influence.", "Revenant", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.humain, Dogmes.nature, 1);
		System.out.println(croyant35);
		tasDeCroyants.add(croyant35);
		
		// Creation des Revolutionnaires Croyants
		
		Croyant croyant36 = new Croyant("Imposez le sacrifice d'une carte de Croyants � autant de Divinites que vous le voulez. Chaque Divinite choisir la carte a sacrifier. Les capacites speciales sont jouees.", "Revolutionnaires", Origine.neant, EtatCarte.pioche, Dogmes.chaos, Dogmes.humain, Dogmes.symbole, 2);
		System.out.println(croyant36);
		tasDeCroyants.add(croyant36);
		
		// Creation des Nihilistes Croyants
		
		Croyant croyant37 = new Croyant("Jusqu'� la fin du tour, plus aucune Divinite ne recoit de points d'Action", "Nihillistes", Origine.neant, EtatCarte.pioche, Dogmes.chaos, Dogmes.symbole, Dogmes.mystique, 4);
		System.out.println(croyant37);
		tasDeCroyants.add(croyant37);
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
	
	public boolean estVide(){
		return tasDeCroyants.isEmpty();
	}
	

}
