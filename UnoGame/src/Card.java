public class Card {
	private int handSize = 108;
	public Game[] unogame = new Game[handSize];

	public void generateHand() {
		int countCards = 0;
		for (Game.Suit s : Game.Suit.values()) {
			for (Game.Value v : Game.Value.values()) {
				unogame[countCards] = (new Game(s, v));
				countCards++;
			}
		} // end outter for
	}// end method

}
