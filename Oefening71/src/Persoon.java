public class Persoon {
	private String naam;
	private Datum gebdatum;
  
	public Persoon( String naam, Datum gebdatum ) {
		this.naam = naam;
		this.gebdatum = gebdatum;
	}
  
	public String getNaam() {
		return naam;
	}

	public void setNaam( String naam ) {
		this.naam = naam;
	}
  
	public Datum getGebdatum() {
		return gebdatum;
	}
  
	public String toString() {
		return naam + " is geboren op " + gebdatum.toString();
	}
}