package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Ram");
		hm.put(2, "Shiva");

		hm.put(3, "Sarran");
		hm.put(3, "Bobby");

		hm.put(4, "Bobby");
		hm.put(5, "Bobby");
		hm.put(6, "Bobby");
		hm.put(7, "Bobby");

		System.out.println(hm);

		System.out.println(hm.remove(3));
		System.out.println(hm);

		// store duplicate values in same key
		HashMap<Integer, List<Integer>> multiMap = new HashMap<>();
		multiMap.computeIfAbsent(1, k -> new ArrayList<>()).add(10);
		multiMap.computeIfAbsent(1, k -> new ArrayList<>()).add(20);
		multiMap.computeIfAbsent(2, k -> new ArrayList<>()).add(20);

		if (multiMap.containsKey(2)) {
			System.out.println(multiMap);
		}
	}
}
