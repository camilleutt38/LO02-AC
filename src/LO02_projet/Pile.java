package LO02_projet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Pile {


	public final static int nbDeCartes = 37;

	private LinkedList<Action> tasDeCartes;

	public Pile() {

		// Creation des Croyants
		tasDeCartes = new LinkedList<Action>();

		// Creation des Moines

		Croyant croyant1 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour,
				EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.mystique, 2);
		//System.out.println(croyant1);
		tasDeCartes.add(croyant1);

		Croyant croyant2 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour,
				EtatCarte.pioche, Dogmes.humain, Dogmes.chaos, Dogmes.mystique, 2);
		//System.out.println(croyant2);
		tasDeCartes.add(croyant2);

		Croyant croyant3 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour,
				EtatCarte.pioche, Dogmes.chaos, Dogmes.symbole, Dogmes.mystique, 2);
		//System.out.println(croyant3);
		tasDeCartes.add(croyant3);

		Croyant croyant4 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour,
				EtatCarte.pioche, Dogmes.symbole, Dogmes.nature, Dogmes.mystique, 2);
		//System.out.println(croyant4);
		tasDeCartes.add(croyant4);

		Croyant croyant5 = new Croyant("Donne un point d'action d'origine Jour", "Moines", Origine.jour,
				EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.mystique, 2);
		//System.out.println(croyant5);
		tasDeCartes.add(croyant5);

		// Creation des travailleurs Croyants

		Croyant croyant6 = new Croyant("Empeche une divinite possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de croyants durant ce tour", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.chaos, 2 );
		// System.out.println(croyant6);
		tasDeCartes.add(croyant6);
		
		Croyant croyant7 = new Croyant("Empeche une divinite possédant le Dogme Nature ou Mystique de sacrifier une de ses cartes de croyants durant ce tour", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.nature, 2 );
		// System.out.println(croyant7);
		tasDeCartes.add(croyant7);
		
		Croyant croyant8 = new Croyant("Vous piochez deux cartes au hasard dans la main d'une autre Divinité", "Travaileurs", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.mystique, Dogmes.chaos, 2 );
		// System.out.println(croyant8);
		tasDeCartes.add(croyant8);
		
		//creation des Ermites croyants 
		
		Croyant croyant9 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Ermite", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.chaos, 1);
		// System.out.println(croyant9);
		tasDeCartes.add(croyant9);
		
		Croyant croyant10 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Ermite", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 1);
		// System.out.println(croyant10);
		tasDeCartes.add(croyant10);
		
		//Creation de l'Integriste Croyant
		
		Croyant croyant11 = new Croyant("Impose le sacrifice d'un Guide Spirituel d'un autre joueur, qui choisit la carte. La capacité spéciale du sacrifice est jouée.", "Integristes", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.chaos, 1);
		// System.out.println(croyant11);
		tasDeCartes.add(croyant11);
		
		//Creation du Guerrier Saint croyant
		
		Croyant croyant12 = new Croyant("Un Guide Spirituel revient dans la main de sa Divinité. Ses Croyants reviennent au centre de la table.", "Guerriers Saints", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 4);
		// System.out.println(croyant12);
		tasDeCartes.add(croyant12);

		

		// Creation du Diplomates Croyant
		
		Croyant croyant13 = new Croyant("Relancez le de de Cosmogonie. Le tour se finit normalement sous la nouvelle influence", "Diplomates",
				Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, Dogmes.chaos, 4);
		//System.out.println(croyant13);
		tasDeCartes.add(croyant13);

		// Creation des Demons Croyants
		
		Croyant croyant14 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.mystique, 2);
		// System.out.println(croyant14);
		tasDeCartes.add(croyant14);
		
		Croyant croyant15 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.chaos, Dogmes.mystique, 2);
		// System.out.println(croyant15);
		tasDeCartes.add(croyant15);
		
		Croyant croyant16 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.symbole, Dogmes.chaos, Dogmes.mystique, 2);
		// System.out.println(croyant16);
		tasDeCartes.add(croyant16);
		
		Croyant croyant17 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.mystique, 2);
		// System.out.println(croyant17);
		tasDeCartes.add(croyant17);
		
		Croyant croyant18 = new Croyant("Donne un point d'Action d'Origine Nuit.", "Demons", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.mystique, 2);
		// System.out.println(croyant18);

		

		// Creation des Alchimistes Croyants
		
		Croyant croyant19 = new Croyant("Empeche une Divinit� poss�dant le Dogme Humain ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu.", "Alchimistes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.symbole, 2);
		// System.out.println(croyant19);
		tasDeCartes.add(croyant19);
		
		Croyant croyant20 = new Croyant("Emp�che une Divinit� poss�dant le Dogme Humain ou Symboles de sacrifier un de ses Guides Spirituels durant ce tour de jeu. ", "Alchimistes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.mystique, 2);
		// System.out.println(croyant20);
		tasDeCartes.add(croyant20);
		
		Croyant croyant21 = new Croyant("Vous piochez deux cartes au hasard dans la main d'une autre Divinite ", "Alchimistes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.symbole, 2);
		// System.out.println(croyant21);
		tasDeCartes.add(croyant21);

		// Creation des Vampires Croyants
		
		Croyant croyant22 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifi�. La capacit� sp�ciale du sacrifice est jou�e", "Vampires", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, Dogmes.symbole, 1);
		//System.out.println(croyant22);
		tasDeCartes.add(croyant22);
		
		Croyant croyant23 = new Croyant("Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifi�. La capacit� sp�ciale du sacrifice est jou�e", "Vampires", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.chaos, Dogmes.mystique, 1);
		// System.out.println(croyant23);
		tasDeCartes.add(croyant23);

		

		// Creation des Lycanthropes Croyants
		
		Croyant croyant24 = new Croyant("Retirez tous les Croyants attaches a l'un des Guides Spirituels d'une autre Divinite. Les croyants reviennent au milieu de la table, le Guide Spirituel est defausse.", "Lycanthropes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, Dogmes.humain, 4);
		// System.out.println(croyant24)
		tasDeCartes.add(croyant24);
		
		// Creation des Pillards Croyants
		
		Croyant croyant25 = new Croyant("Recuperez les points d'action d'une Divinite n'ayant pas encore joue durant ce tour. Les point d'action gardent leur Origine. La Divinite perd ses points.", "Pillars", Origine.nuit, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 4);
		// System.out.println(croyant25);
		tasDeCartes.add(croyant25);

		
		// Creation des Illusionnistes Croyants
		
		Croyant croyant26 = new Croyant("Vous beneficiez de la capacite speciale de sacrifice d'une carte de Croyants appartenant a une autre Divinite. La carte en question reste en jeu.", "Illusionnistes", Origine.nuit, EtatCarte.pioche, Dogmes.chaos, Dogmes.symbole, Dogmes.humain, 4);
		// System.out.println(croyant26);
		tasDeCartes.add(croyant26);

		

		// Creation des Esprits Croyants
		
		Croyant croyant27 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.humain, 2);
		// System.out.println(croyant27);
		tasDeCartes.add(croyant27);
		
		Croyant croyant28 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.chaos, Dogmes.humain, 2);
		// System.out.println(croyant28);
		tasDeCartes.add(croyant28);
		
		Croyant croyant29 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.chaos, Dogmes.symbole, 2);
		// System.out.println(croyant29);
		tasDeCartes.add(croyant29);
		
		Croyant croyant30 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.symbole, 2);
		// System.out.println(croyant30);
		tasDeCartes.add(croyant30);
		
		Croyant croyant31 = new Croyant("Donne un point d'Action d'Origine Neant", "Esprits", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, Dogmes.chaos, 2);
		// System.out.println(croyant31);
		tasDeCartes.add(croyant31);
		

		// Creation des Alienes Croyants
		
		Croyant croyant32 = new Croyant("Empeche une divinite possedant le Dogme Nature ou Mystique de sacrifier une de ses cartes de Croyants durant ce tour de jeu", "Alienes", Origine.neant, EtatCarte.pioche, Dogmes.symbole, Dogmes.humain, Dogmes.chaos, 2);
		// System.out.println(croyant32);
		tasDeCartes.add(croyant32);
		
		Croyant croyant33 = new Croyant("Empeche une divinite possedant le Dogme Chaos ou Mystique de sacrifier un de ses Guide Spirituel durant ce tour de jeu", "Alienes", Origine.neant, EtatCarte.pioche, Dogmes.symbole, Dogmes.humain, Dogmes.nature, 2);
		// System.out.println(croyant33);
		tasDeCartes.add(croyant33);
		
		Croyant croyant34 = new Croyant("Vous piochez deux cartes au hasard dans la main d'une autre Divinite", "Alienes", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.humain, Dogmes.chaos, 2);
		// System.out.println(croyant34);
		tasDeCartes.add(croyant34);
		
		// Creation du Revenant Croyant

		Croyant croyant35 = new Croyant("Lancez le d� de Cosmgonie. Le tour se fini normalement, mais sous cette nouvelle influence.","Revenant", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.humain, Dogmes.nature, 1);
		//System.out.println(croyant35);
		tasDeCartes.add(croyant35);

		// Creation des Revolutionnaires Croyants
		
		Croyant croyant36 = new Croyant("Imposez le sacrifice d'une carte de Croyants � autant de Divinites que vous le voulez. Chaque Divinite choisir la carte a sacrifier. Les capacites speciales sont jouees.", "Revolutionnaires", Origine.neant, EtatCarte.pioche, Dogmes.chaos, Dogmes.humain, Dogmes.symbole, 2);
		// System.out.println(croyant36);
		tasDeCartes.add(croyant36);


		// Creation des Nihilistes Croyants
		
		Croyant croyant37 = new Croyant("Jusqu'� la fin du tour, plus aucune Divinite ne recoit de points d'Action", "Nihillistes", Origine.neant, EtatCarte.pioche, Dogmes.chaos, Dogmes.symbole, Dogmes.mystique, 4);
		// System.out.println(croyant37);
		tasDeCartes.add(croyant37);

		
		// Creation des guides spirituels

		// les Martyrs
		GuideSpirituel guide1 = new GuideSpirituel("Equivalent a la pose d'une carte Apocalypse", "Martyr", Origine.jour, EtatCarte.pioche, Dogmes.humain, Dogmes.nature, 2, 0);
		// System.out.println(guide1);
		tasDeCartes.add(guide1);
		
		GuideSpirituel guide2 = new GuideSpirituel("Equivalent a la pose d'une carte Apocalypse", "Martyr", Origine.nuit, EtatCarte.pioche, Dogmes.humain, Dogmes.symbole, 2, 0);
		// System.out.println(guide2);
		tasDeCartes.add(guide2);
		
		GuideSpirituel guide3 = new GuideSpirituel("Equivalent a la pose d'une carte Apocalypse", "Martyr", Origine.neant, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, 2, 0);
		// System.out.println(guide3);
		tasDeCartes.add(guide3);

		// les Clercs
		GuideSpirituel guide4 = new GuideSpirituel("Fait gagner un nombre de points d'Action egal au nombre de cartes de Croyants rattachees. L'Origine des points d'Action est au choix du joueur.", "Clerc", Origine.jour, EtatCarte.pioche, Dogmes.chaos, Dogmes.humain, 2, 0);
		// System.out.println(guide4);
		tasDeCartes.add(guide4);
		
		GuideSpirituel guide5 = new GuideSpirituel("Fait gagner un nombre de points d'Action egal au nombre de cartes de Croyants rattachees. L'Origine des points d'Action est au choix du joueur.", "Clerc", Origine.nuit, EtatCarte.pioche, Dogmes.nature, Dogmes.symbole, 2, 0);
		// System.out.println(guide5);
		tasDeCartes.add(guide5);
		
		GuideSpirituel guide6 = new GuideSpirituel("Fait gagner un nombre de points d'Action egal au nombre de cartes de Croyants rattachees. L'Origine des points d'Action est au choix du joueur.", "Clerc", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, 2, 0);
		// System.out.println(guide6);
		tasDeCartes.add(guide6);
		
		GuideSpirituel guide7 = new GuideSpirituel("Fait gagner un nombre de points d'Action egal au nombre de cartes de Croyants rattachees. L'Origine des points d'Action est au choix du joueur.", "Clerc", Origine.jour, EtatCarte.pioche, Dogmes.chaos, Dogmes.nature, 2, 0);
		// System.out.println(guide7);
		tasDeCartes.add(guide7);
		
		GuideSpirituel guide8 = new GuideSpirituel("Fait gagner un nombre de points d'Action egal au nombre de cartes de Croyants rattachees. L'Origine des points d'Action est au choix du joueur.", "Clerc", Origine.nuit, EtatCarte.pioche, Dogmes.mystique, Dogmes.symbole, 2, 0);
		// System.out.println(guide8);
		tasDeCartes.add(guide8);
		
		GuideSpirituel guide9 = new GuideSpirituel("Fait gagner un nombre de points d'Action egal au nombre de cartes de Croyants rattachees. L'Origine des points d'Action est au choix du joueur.", "Clerc", Origine.neant, EtatCarte.pioche, Dogmes.chaos, Dogmes.symbole, 2, 0);
		// System.out.println(guide9);
		tasDeCartes.add(guide9);
		
		GuideSpirituel guide10 = new GuideSpirituel("Fait gagner un nombre de points d'Action egal au nombre de cartes de Croyants rattachees. L'Origine des points d'Action est au choix du joueur.", "Clerc", Origine.jour, EtatCarte.pioche, Dogmes.chaos, Dogmes.mystique, 2, 0);
		// System.out.println(guide10);
		tasDeCartes.add(guide10);
		
		GuideSpirituel guide11 = new GuideSpirituel("Fait gagner un nombre de points d'Action egal au nombre de cartes de Croyants rattachees. L'Origine des points d'Action est au choix du joueur.", "Clerc", Origine.nuit, EtatCarte.pioche, Dogmes.nature, Dogmes.humain, 2, 0);
		// System.out.println(guide11);
		tasDeCartes.add(guide11);

		// le Shaman
		GuideSpirituel guide12 = new GuideSpirituel("Sacrifie tous les croyants d'origine Neant d'une Divinite ayant le Dogme Humain. Les capacites speciales sont jouees normalement.", "Shaman", Origine.nuit, EtatCarte.pioche, Dogmes.nature, Dogmes.mystique, 3, 0);
		// System.out.println(guide12);
		tasDeCartes.add(guide12);

		// l'Anarchiste
		GuideSpirituel guide13 = new GuideSpirituel("Sacrifie un Guide Spirituel, si lui ou sa Divinite ne croit pas au Dogme Chaos. Les capacites speciales sont jouees normalement", "Anachiste", Origine.neant, EtatCarte.pioche, Dogmes.chaos, Dogmes.humain, 3, 0);
		// System.out.println(guide13);
		tasDeCartes.add(guide13);


		// Le paladin
		GuideSpirituel guide14 = new GuideSpirituel("Tous les Croyants d'Origine Nuit ou Neant et ayant le Dogme Nature, actuellement sur la table sont defauses. Les capacites speciales ne sont pas jouees.", "Paladin", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.humain, 3, 0);
		// System.out.println(guide14);
		tasDeCartes.add(guide14);
		
		// l'Ascete
		GuideSpirituel guide15 = new GuideSpirituel("Sacrifie 2 cartes Croyants d'une Divinite ayant le Dogme Humain ou Symboles. Les capacites speciales sont jouees normalement.", "Ascete", Origine.nuit, EtatCarte.pioche, Dogmes.mystique, Dogmes.humain, 1, 0);
		// System.out.println(guide15);
		tasDeCartes.add(guide15);

		// Le Devin
		GuideSpirituel guide16 = new GuideSpirituel("Oblige une Divinite ayant le Dogme Nature ou Mystique a sacrifier l'un de ses Guide Spirituel.", "Devin", Origine.neant, EtatCarte.pioche, Dogmes.mystique, Dogmes.nature, 1, 0);
		// System.out.println(guide16);
		tasDeCartes.add(guide16);

		// L'exorciste
		GuideSpirituel guide17 = new GuideSpirituel("Une Divinite d'Origine Nuit ou ayant les Dogmes Mystique et Chaos reprend dans sa main l'un de ses Guides Spirituels. Les Croyants qui y etaient attaches sont defausses.", "Exorciste", Origine.jour, EtatCarte.pioche, Dogmes.chaos, Dogmes.mystique, 1, 0);
		// System.out.println(guide17);
		tasDeCartes.add(guide17);
		
		// Le sorcier
		GuideSpirituel guide18 = new GuideSpirituel("Echangez l'un de vos Guides Spirituels avec un d'une autre divinite. Vous choisissez les deux guides en question. Les croyants restent rattaches aux meme cartes.", "Sorcier", Origine.nuit, EtatCarte.pioche, Dogmes.mystique, Dogmes.symbole, 3, 0);
		// System.out.println(guide18);
		tasDeCartes.add(guide18);

		// le tyran
		GuideSpirituel guide19 = new GuideSpirituel("Defausse tous les Croyants ayant le Dogme Mystique actuellement au centre de la table.", "Tyran", Origine.neant, EtatCarte.pioche, Dogmes.chaos, Dogmes.symbole, 3, 0);
		// System.out.println(guide19);
		tasDeCartes.add(guide19);

		// le Messie
		GuideSpirituel guide20 = new GuideSpirituel("Le joueur pose le de de Cosmogonie sur la face qu'il desire et commence un nouveau tour de jeu.", "Messie", Origine.jour, EtatCarte.pioche, Dogmes.mystique, Dogmes.humain, 3, 0);
		// System.out.println(guide20);
		tasDeCartes.add(guide20);
		
		//APOCALYPSES
		Apocalypse apocalypse1 = new Apocalypse("Boulversement divin", "Apocalypse", Origine.jour, EtatCarte.pioche);
		tasDeCartes.add(apocalypse1);
		
		Apocalypse apocalypse2 = new Apocalypse("Boulversement divin", "Apocalypse", Origine.nuit, EtatCarte.pioche);
		tasDeCartes.add(apocalypse2);
		
		Apocalypse apocalypse3 = new Apocalypse("Boulversement divin", "Apocalypse", Origine.neant, EtatCarte.pioche);
		tasDeCartes.add(apocalypse3);
		
		Apocalypse apocalypse4 = new Apocalypse("Boulversement divin", "Apocalypse", Origine.sansOrigine, EtatCarte.pioche);
		tasDeCartes.add(apocalypse4);
		
		Apocalypse apocalypse5 = new Apocalypse("Boulversement divin", "Apocalypse", Origine.sansOrigine, EtatCarte.pioche);
		tasDeCartes.add(apocalypse5);
		
	}

	public void melanger() {
		Collections.shuffle(tasDeCartes);
	}
	
	public Action tirerCarteDessus(){
		if (estVide() == false){
		Action carte = tasDeCartes.removeFirst();
		carte.etat = EtatCarte.enMain;
		return carte;}
		else {return null;}
	}


	@Override
	public String toString() {
		return " " + tasDeCartes + " ";
	}

	public boolean estVide() {
		return tasDeCartes.isEmpty();
	}

}
