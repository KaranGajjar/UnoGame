public class Main {

	public static void main(String[] args) {
		Card ch = new Card();
		ch.generateHand();
		for (Game c : ch.unogame) {
			System.out.println(c.getValue() + " of " + c.getSuit());
		}
	}

}
