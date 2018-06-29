import java.util.*;

	public class Bestelling {
		private ArrayList<Artikel> lijst;

		public Bestelling() {
			lijst = new ArrayList<Artikel>();
		}

		public void voegtoe( Artikel artikel ) {
			lijst.add( artikel );
		}
  
		public void print() {
			for( Artikel a : lijst ) {
				System.out.println( a );
			}
		}
}