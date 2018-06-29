public class Boek {
	private String titel;
	private String ISBN;
	private Persoon auteur;
  
	public Boek( String titel, String ISBN, Persoon auteur ) {
		this.titel = titel;
		this.ISBN = ISBN;
		this.auteur = auteur;
	}
  
	public String toString() {
		return auteur.getNaam() + ", " + titel + ", ISBN " + ISBN;
	}
}