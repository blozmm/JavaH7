public class Artikel {
	private String omschrijving;
	private double prijsExBTW;
	private double btwPercentage;

	public Artikel( String omschrijving, double prijsExBTW, double btwPercentage ) {
		this.omschrijving = omschrijving;
		this.prijsExBTW = prijsExBTW;
		this.btwPercentage = btwPercentage;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public String toString() {
		return String.format( "%-25s ex BTW %6.2f, incl BTW %6.2f",
                          omschrijving, prijsExBTW, prijsExBTW * ( 1 + btwPercentage/100  ) );
	}
}