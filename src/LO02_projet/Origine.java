package LO02_projet;

public enum Origine {
	crepuscule ("Crepuscule"),
	aube ("Aube"),
	jour ("Jour"),
	nuit ("Nuit"),
	neant ("Neant"),
	sansOrigine ("SansOrigine");
	
	private String value = "";
	
	Origine(String value){
		this.value = value;
	}
	public String toString(){
		return value;
	}
	//Crepuscule, Aube, Jour, Nuit, Neant, SansOrigine;
}
