package set;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(3);
		ts.add(2);
		ts.add(4);
		ts.add(6);
		ts.add(5);

		System.out.println(ts);
	}
}
