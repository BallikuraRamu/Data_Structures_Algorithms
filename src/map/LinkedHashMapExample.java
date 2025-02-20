package map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		lhm.put(1, 10);
		lhm.put(2, 40);
		lhm.put(3, 30);
		lhm.put(5, 50);
		System.out.println(lhm);
	}
}
