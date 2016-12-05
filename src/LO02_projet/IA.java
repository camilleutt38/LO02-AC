package LO02_projet;

import java.util.Iterator;
import java.util.Scanner;

public class IA extends Joueur {

	public IA(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
		IA = true;
	}

	public boolean decision(Partie p) {
		System.out.println("Je suis une IA stupide qui ne sait rien faire");
		boolean jouer = false;

		if (this.PtsAction[0] != 0) {
			Iterator<Action> it = this.main.iterator();
			while (it.hasNext()) {
				Action a = (Action) it.next();
				Integer index = this.main.indexOf(a);

				if (a.type == "apocalypse") {
					if (a.origine == Origine.jour) {
						p.doApocalypse();
						this.main.remove(a);
						jouer = true;
					}
				}
				//A modifier pour poser des croyants origines jour
				if (a.type == "croyant") {
					if (a.origine == Origine.jour) {
						jouer = p.milieu.poserCroyant(this);
						//p.milieu.CroyantsMilieu.add(a);
						//this.PtsAction[0] = this.PtsAction[0] - 1;
						//this.main.remove(index);
						jouer = true;
					}
				}

			}
		}
		else{
			if(main.size() <= 5){
				this.prendreCarte(p.cartes.tirerCarteDessus());
				this.prendreCarte(p.cartes.tirerCarteDessus());
				jouer = true;
			}
			else {
				defausser();
				jouer = true;
			}
		}
		return jouer;
	}

	public void defausser() {

		this.defaussercarte(this.main.get(0));

	}


}
