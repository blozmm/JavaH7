public class Scorebord {
	private Teller score1;
	private Teller score2;
  
	public Scorebord() {
		score1 = new Teller();
		score2 = new Teller();
	}
  
	public void verhoogScore1() {
		score1.verhoog();
	}
  
	public void verlaagScore1() {
		score1.verlaag();
	}
 

	public void verhoogScore2() {
		score2.verhoog();
	}
  
	public void verlaagScore2() {
		score2.verlaag();
	}

	public void print() {
		System.out.println( "De score is momenteel " + score1.getWaarde() + "-" + score2.getWaarde() );
	}
}