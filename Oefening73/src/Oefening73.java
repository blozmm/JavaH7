public class Oefening73 {
	public static void main( String[] args ) {
		Bestelling bestelling = new Bestelling();
		Artikel artikel1 = new Artikel( "Haarborstel", 6.49, 21.0 );
		Artikel artikel2 = new Artikel( "Bril", 120.00, 21.0 );
		Artikel artikel3 = new Artikel( "Oortjes", 29.99, 21.0 );
		bestelling.voegtoe( artikel1 );
		bestelling.voegtoe( artikel2 );
		bestelling.voegtoe( artikel3 );
		bestelling.print();
	}
}