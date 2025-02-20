package set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		int[] array = { 1, 2, 6, 4, 5};
		HashSet<Integer> unique = new HashSet<>();
		for (int num : array) {
			unique.add(num);
		}
		System.out.println(unique);
	}
}
