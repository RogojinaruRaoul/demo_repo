package automation.collections;

import java.util.ArrayList;
import java.util.List;

import automation.oop.Circle;

public class Lists {
	public static void main(String[] args) {

		parameterizedList();

	}

	public static void parameterizedList() {
		List<Circle> list = new ArrayList<>();

		Circle c = new Circle();

		c.setColor("blue");

		list.add(c);
		list.add(new Circle());
		list.add(c);
		list.add(1, c);
		System.out.println(list.size());

		Circle a = list.get(1);

		System.out.println(a.getColor());
		// System.out.println(list.get(1));

		for (Circle x : list) {
			System.out.println(x);

		}

	}

	public static void rawList() {

		List l = new ArrayList<>();

		l.add("List element");
		l.add("another list element");
		l.add(7);
		l.add(new Circle());

		Object secondElement = l.get(2);
		if (secondElement instanceof String) {

			String a = (String) secondElement;
			System.out.println(a);

		} else if (secondElement instanceof Circle) {

			Circle a = (Circle) secondElement;

			System.out.println(a.getColor());

		} else {

		}

	}

}
