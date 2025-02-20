package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(5);

		System.out.println("Original ArrayList : " + arrayList);
		System.out.println("Assending Order    : " + arrayList.stream().sorted().collect(Collectors.toList()));
		System.out.println("Descending Order   : "
				+ arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println("Even Numbers : " + arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
		System.out.println("Odd Numbers : " + arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList()));
		System.out.println("Square Numbers : " + arrayList.stream().map(i -> i * i).collect(Collectors.toList()));
		System.out.println("Cube Numbers : " + arrayList.stream().map(i -> i * i * i).collect(Collectors.toList()));
	}
}
