public class Oefening75 {
	public static void main( String[] args ) {
		Rapport rapport = new Rapport( "Blossom" );
		rapport.voegResultaatToe( new Resultaat( "Nederlands", 9 ) );
		rapport.voegResultaatToe( new Resultaat( "Engels", 8 ) );
		rapport.voegResultaatToe( new Resultaat( "Rekenen", 8 ) );
		rapport.print();
  }
}
