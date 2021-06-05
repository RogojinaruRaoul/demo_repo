package automation.oop;

public class Square {

	private double squareSide;

	public void setSide(double side) {
		squareSide = side;
	}

	public double getArea() {
		return squareSide * squareSide;
	}

	@Override
	public String toString() {
		return "Patrat";
	}

}
