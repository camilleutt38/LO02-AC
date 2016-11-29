package LO02_projet;


public class DeCosmogonie {
	
	int valeurDe;
	
	//0 = jour 1= nuit 2 = neant
	public void lancerDe(){
		valeurDe=0;

		valeurDe= (int)(1+ 3*Math.random());
		if (valeurDe == 0){
			System.out.println("Le dé a dit Jour !");
		} else if(valeurDe == 1) {
			System.out.println("Le dé a dit Nuit !");
		} else {
			System.out.println("le dé a dit Neant !");
		}
		
	}
	

}
