package automation;

/**
 * Class in charge of drawing squares
 * 
 * @author Raulg
 *
 */

public class OverLoading {

	public static void main(String[] args) {
		short length = 7;
		drawSquare(length);

		System.out.println("-----------------------------");

		drawSquare(9);

	}

	/**
	 * Method draws a Square out of "*"
	 * 
	 * @param length
	 *        the length of the square
	 * 
	 */
	public static void drawSquare(int length) {
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	/**
	 * Method draws a Square out of "#"
	 * 
	 * @param length
	 *        the length of the square
	 */
	public static void drawSquare(short length) {
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}