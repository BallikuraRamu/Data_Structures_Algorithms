package map;

import java.util.TreeMap;

public class TreeHashMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "A");
		tm.put(3, "C");
		tm.put(2, "B");

		System.out.println(tm);
		
		if(tm.containsKey(3)) {
			System.out.println(tm.containsValue("C"));
		}
		
		// for values iteration
		for(String i : tm.values()) {
			System.out.print(i);
		}
		
		// for key iteration
		for(int i: tm.keySet()) {
			System.out.print(i);
		}
	}
}
