package automation.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import automation.oop.Circle;

public class TestMap {
	public static void main(String[] args) {

		testMap();

	}

	public static void testMap() {

		Circle circle1 = new Circle();
		Circle circle2 = new Circle();

		Map<Integer, Circle> map1 = new HashMap();

		map1.put(100, circle1);
		map1.put(222, circle2);

		// System.out.println(map1.get(100));
		// System.out.println(map1.get(222));
		System.out.println(map1.size());

		Collection<Circle> collection = map1.values();
		System.out.println(collection.size());

		Iterator it3 = collection.iterator();
		while (it3.hasNext()) {
			// int key = it3.next();

			System.out.println(it3.next());
		}

	}

}
