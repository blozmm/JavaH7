public class Datum {
	private int dag, maand, jaar;

	public Datum( int dag, int maand, int jaar ) {
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}
  
	public String toString() {
		return dag + "-" + maand + "-" + jaar;
	}
}