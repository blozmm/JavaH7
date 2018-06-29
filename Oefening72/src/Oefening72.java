public class Oefening72 {
	public static void main( String[] args ) {
		Persoon auteur = new Persoon( "Stark, Ulf",  new Datum( 31, 1, 2015 ) );
		Boek boek = new Boek( "De vrienden in het dromenbos", "9031371822175", auteur );
		System.out.println( boek );
	}
}