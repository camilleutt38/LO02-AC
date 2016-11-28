package LO02_projet;

public class Partie {
	
	public Pile cartes;
	
	public Partie(){
		cartes = new Pile();
		cartes.melanger();
		}
	
	
	
	@Override
	public String toString() {
		return "Cartes" + cartes;
	}



	public static void main(String[] args) {
		
		Partie p = new Partie();
		System.out.println(p);
		System.out.println(p.cartes.tirerCarteDessus());
		
	}

}
