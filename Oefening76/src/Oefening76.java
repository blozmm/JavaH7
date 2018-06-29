public class Oefening76 {
	public static void main( String[] args ) {
		Voorraad voorraad = new Voorraad();
		voorraad.voegtoe( new Artikel( "Haarborstel", 4 ) );
		voorraad.voegtoe( new Artikel( "Bril", 2 ) );
		voorraad.voegtoe( new Artikel( "Oortjes", 13 ) );		
		voorraad.print();
	}
}