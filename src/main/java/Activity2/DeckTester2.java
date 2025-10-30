package Activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Spades"};
		int[] values = {11,12,13};
		Deck2 d1 = new Deck2(ranks, suits, values);
		System.out.println(d1);
	}
}
