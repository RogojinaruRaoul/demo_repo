package automation;

public class DrawShapeCorners {
	public static void main(String[] args) {

		drawShapeCorners(5, 7);

	}

	// if ((i == 1 || i == height) && (j == 1 || j == width))

	public static void drawShapeCorners(int height, int width) {
		for (int i = 1; i <= height; i++) {

			for (int j = 1; j <= width; j++) {

				if (i == 1 && j == 1 || i == 1 && j == width || i == height && j == 1 || i == height && j == width) {
					System.out.print("* ");

				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
