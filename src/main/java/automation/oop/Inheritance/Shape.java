package automation.oop.Inheritance;

public class Shape {
	private String color;

	public String draw() {
		return "Drawing a shape";

	}

	public void erase() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		this.color = c;
	}

}

class Circle extends Shape {
	@Override
	public String draw() {
		return "Drawing a circle shape";
	}
}

class Rectangle extends Shape {
	private int length;
	private int breadth;

	public int getLength() {
		return length;
	}

	public int getBredth() {
		return breadth;
	}

	public void setLength(int l) {
		if (l > 0)
			this.length = l;
	}

	public void setBreadth(int b) {
		if (b > 0)
			this.breadth = b;
	}

	public double getArea() {
		return length * breadth;
	}

	@Override
	public String draw() {
		return "Drawing a rectangle shape";
	}

}

class Square extends Rectangle {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int s) {
		if (s > 0)
			this.side = s;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public int getLength() {
		return side;
	}

	@Override
	public int getBredth() {
		return side;
	}

	@Override
	public void setLength(int l) {
		if (l > 0)
			this.side = l;
	}

	@Override
	public void setBreadth(int b) {
		if (b > 0)
			this.side = b;
	}

	@Override
	public String draw() {
		return "Drawing a square shape";
	}

	@Override
	public String toString() {
		return "The side length of this square is: " + side;
	}
}

class Triangle extends Shape {
	public void flipVertical() {
	}

	public void flipHorizontal() {
	}

	@Override
	public String draw() {
		return "Drawing a triangle shape";
	}

}
