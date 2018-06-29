import java.util.*;

public class Cijferlijst {
	private ArrayList<Resultaat> lijst;

	public Cijferlijst() {
		lijst = new ArrayList<Resultaat>();  
	}

	public void voegtoe( Resultaat resultaat ) {
		lijst.add( resultaat );
	}

	public void print() {
		for( Resultaat resultaat : lijst ) {
			System.out.println( resultaat );
		}
		System.out.println();
		System.out.println( String.format( "%-20s %4.1f", "Gemiddelde", gemiddelde() ) );
	}

	public double gemiddelde() {
		double subtotaal = 0;
		for( Resultaat resultaat : lijst ) {
			subtotaal = subtotaal + resultaat.getCijfer();
		}
		int aantal = lijst.size();
		return subtotaal / aantal;
	}
}