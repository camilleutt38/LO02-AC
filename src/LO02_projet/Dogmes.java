package LO02_projet;


public enum Dogmes {
	nature ("Nature"),
	humain ("Humain"),
	mystique ("Mystique"),
	chaos ("Chaos"),
	symbole ("Symbole");
	
	private String dogme = "";
	 
	Dogmes (String dogme){
		this.dogme = dogme;
	}
	
	public String toString(){
		return dogme;
	}

}
