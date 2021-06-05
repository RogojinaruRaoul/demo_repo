package automation.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import automation.Enums.DemoEnum;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("String1");
		list.add("String1");

		HashSet<String> set = new HashSet<String>(list);

		set.add("ww");
		set.add("adsadas");
		set.add("ww");

		for (String s : set) {
			System.out.println(s);
		}

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Map<String, String> m = new HashMap<>();

		m.put("Key3", "value3");
		m.put("Key2", "value2");
		m.put("Key1", "value1");
		m.put("Key5", "value5");
		m.put("Key4", "value4");

		Iterator<String> it2 = m.values()
				.iterator();
		while (it2.hasNext())
			System.out.println(it2.next());

		DemoEnum enums = DemoEnum.FIREFOX;
		System.out.println(enums.ordinal());
		DemoEnum e = DemoEnum.valueOf("FIREFOX");
		DemoEnum[] eArray = DemoEnum.values();
		for (DemoEnum x : eArray) {
			System.out.println(x);

			List<Object> li = new ArrayList<>();
			li.add(DemoEnum.CHROME);
			li.add(DemoEnum.CHROME);

		}

	}

}
