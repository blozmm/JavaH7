public class Resultaat {
	private String vak;
	private double cijfer;
  
	public Resultaat( String vak, double cijfer ) {
		this.vak = vak;
		this.cijfer = cijfer;
	}
  
	public double getCijfer() {
		return cijfer;
	}
  
	public String toString() {
		return String.format( "%-20s %4.1f", vak, cijfer ); 
	}
}