package automation.oop.Inheritance;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Square sq = new Square();
		Triangle t = new Triangle();
		sq.setSide(10_393_943);
		System.out.println(sq.getSide());
		sq.setSide(7);
		sq.getArea();
		System.out.println(sq.getArea());

		System.out.println(s.draw());
		System.out.println(sq.draw());

		// DEFINITIE: toString= reprezentare text a unui obiect
		// This se refera la clasa curenta doar pentru obiecte dinamice, nu si pentru statice
		System.out.println(sq);
		System.out.println(sq.getSide());
	}
}
