package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1);
		lhs.add(5);
		lhs.add(4);
		lhs.add(3);
		lhs.add(2);

		System.out.println(lhs);
		lhs.remove(1);
		System.out.println(lhs);
		System.out.println(lhs.size());

		if (lhs.contains(7)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		for(int num: lhs) {
			System.out.println(num);
		}
	}
}
