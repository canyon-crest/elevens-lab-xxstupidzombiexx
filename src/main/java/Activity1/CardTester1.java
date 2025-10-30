package Activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester1 {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card1 c1 = new Card1("10", "spades", 10);
		Card1 c2 = new Card1("Jack", "hearts", 11);
		Card1 c3 = new Card1("Queen", "spades", 12);
		System.out.println(c1.rank());
		System.out.println(c2.suit());
		System.out.println(c2.matches(c3));
		System.out.println(c3.pointValue());
	}
}
