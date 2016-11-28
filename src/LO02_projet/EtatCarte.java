package LO02_projet;
public enum EtatCarte {
	pioche ("pioche"),
	defausse ("defausse"), 
	enMain ("En main du joueur");
	
	private String etatCarte = "";
	
	EtatCarte(String etatCarte){ 
		this.etatCarte = etatCarte;
	}
	
	public String toString(){
		return etatCarte;
	}

}
