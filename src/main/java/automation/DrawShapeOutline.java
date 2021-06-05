package automation;

public class DrawShapeOutline {
	public static void main(String[] args) {

		drawShapeOutline(4, 10);

	}

	public static void drawShapeOutline(int height, int width) {
		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == height || j == 1 || j == width) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
