package automation;

public class DrawFullShape {

	public static void main(String[] args) {
		drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.println("-------------");
		drawFullShape(5);

	}

	public static void drawFullShape(int height, int width) {

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public static void drawFullShape(int length) {

		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
