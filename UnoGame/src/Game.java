public class Game {

	public enum Suit {
		RED, YELLOW, GREEN, BLUE
	};

	public enum Value {
		ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, COLOR, SKIP, REVERSE, DRAWTWO, DRAWFOUR, WILDCARD
	};

	private final Suit suit;
	private final Value value;

	public Game(Suit s, Value gVal) {
		suit = s;
		value = gVal;
	}

	public Value getValue() {
		return this.value;
	}

	public Suit getSuit() {
		return this.suit;
	}

}
